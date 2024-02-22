from flask import Flask, request, jsonify
from flask_cors import CORS
import tensorflow as tf
import numpy as np
from PIL import Image
app = Flask(__name__)
CORS(app) 

model_path = "1.tflite"

interpreter = tf.lite.Interpreter(model_path=model_path)
interpreter.allocate_tensors()

input_details = interpreter.get_input_details()[0]
input_shape = input_details['shape']
# Testowanie lokalne
# image_path = "trufla/4.jpg"
# image = Image.open(image_path)
# image = image.resize((input_shape[1], input_shape[2]))
#
# image = np.array(image, dtype=np.uint8)
#
# image = np.expand_dims(image, axis=0)
#
#
# interpreter.set_tensor(input_details['index'], image)
#
# interpreter.invoke()
#
# output_details = interpreter.get_output_details()[0]
# output = interpreter.get_tensor(output_details['index'])

class_dict = {
    621: "Koźlarz babka",
    1182: "Łuskwiak zmienny",
    671: "Czubajka kania",
    439: "Kolaczak obłączasty",
    616: "Koźlarz grabowy",
    1057: "Maślak pstry",
    # KURZAWKA DO ZROBIENIA,
    83: "Borowik szlachetny",
    264: "Lejkowiec dęty",
    850: "Boczniak ostrygowaty",
    155: "Lejkówka zielonawa",
    #Koźlarz CZERWONY - niepewne
    620: "Koźlarz czerwony",
    623: "Koźlarz czerwony",
    624: "Koźlarz czerwony",
    ### TRUFLA DO ZROBIENIA
    39: "Muchomor sromotnikowy",
    1281: "Muchomor sromotnikowy",
    366: "Hełmówka jadowita",
    912: "Koralówka złocista",
    915: "Koralówka złocista",
    916: "Koralówka złocista",
    37: "Muchomor czerwony"
}
@app.route('/predict', methods=['POST'])
def predict():
    try:
        file = request.files['image']
        if file:
            image = Image.open(file)
            image = image.resize((input_shape[1], input_shape[2]))
            image = np.array(image, dtype=np.uint8)
            image = np.expand_dims(image, axis=0)

            interpreter.set_tensor(input_details['index'], image)
            interpreter.invoke()

            output_details = interpreter.get_output_details()[0]
            output = interpreter.get_tensor(output_details['index'])

            predicted_class = np.argmax(output)
            predicted_class_name = class_dict.get(predicted_class, "Nie znam tego grzyba")
            confidence = output[0][predicted_class]
            print(predicted_class)
            response = {
                "predicted_class": predicted_class_name,
                "confidence": float(confidence)
            }
            return jsonify(response), 200
        else:
            return jsonify({"error": "No file provided"}), 400
    except Exception as e:
        return jsonify({"error": str(e)}), 500

if __name__ == '__main__':
    app.run(debug=True)
# Testowanie lokalne
# predicted_class = np.argmax(output)
# predicted_class_name = class_dict.get(predicted_class, "Nie znam tego grzyba")
# confidence = output[0][predicted_class]
#
# print("Przewidziana klasa:", predicted_class, confidence)