import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-grzyb-recognition',
  templateUrl: './grzyb-recognition.component.html',
  styleUrls: ['./grzyb-recognition.component.css']
})
export class GrzybRecognitionComponent implements OnInit {
  selectedFile: File | null = null;
  imageUrl: string | null = null;
  prediction: any = null;

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }

  onFileSelected(event: any): void {
    this.processFile(event.target.files);
  }

  onDrop(event: any): void {
    event.preventDefault();
    this.processFile(event.dataTransfer.files);
  }

  processFile(files: FileList): void {
    if (files && files.length > 0) {
      this.selectedFile = files[0];

      const reader = new FileReader();
      reader.onload = (e: any) => {
        this.imageUrl = e.target.result;
      };
      reader.readAsDataURL(this.selectedFile);
    }
  }

  onDragOver(event: any): void {
    event.preventDefault();
  }

  onUpload(): void {
    if (this.selectedFile) {
      const formData = new FormData();
      formData.append('image', this.selectedFile, this.selectedFile.name);

      this.http.post<any>('http://localhost:5000/predict', formData).subscribe(
        (res) => {
          console.log('API response:', res);
          this.prediction = res;
        },
        (err) => {
          console.error('Error:', err);
        }
      );
    }
  }
}
