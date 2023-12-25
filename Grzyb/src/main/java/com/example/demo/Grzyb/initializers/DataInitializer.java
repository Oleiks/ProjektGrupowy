//package com.example.demo.Grzyb.initializers;
//
//import com.example.demo.Grzyb.entities.Grzyb;
//import com.example.demo.Grzyb.services.GrzybService;
//import jakarta.annotation.PostConstruct;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.core.io.ClassPathResource;
//
//import java.nio.file.Files;
//import java.io.File;
//
//import java.util.UUID;
//
//@Component
//public class DataInitializer {
//    private GrzybService grzybService;
//    @Autowired
//    public DataInitializer( GrzybService grzybService) {
//        this.grzybService = grzybService;
//    }
//    @PostConstruct
//    public void LoadGrzyby()
//    {
//        Grzyb collageDropout= Grzyb.builder().identifier(UUID.randomUUID()).name("Boczniak ostrygowaty").description("Boczniak ostrygowaty (Pleurotus ostreatus (Jacq.) P. Kumm.) – gatunek grzybów z rodziny boczniakowatych (Pleurotaceae)[1].\n" +
//                "\n" +
//                "Systematyka i nazewnictwo\n" +
//                "Pozycja w klasyfikacji według Index Fungorum: Pleurotus, Pleurotaceae, Agaricales, Agaricomycetidae, Agaricomycetes, Agaricomycotina, Basidiomycota, Fungi[1].\n" +
//                "\n" +
//                "Po raz pierwszy takson ten zdiagnozowany został w 1774 r. przez Jacquina, który nadał mu nazwę Agaricus ostreatus. Obecną, uznaną przez Index Fungorum nazwę nadał mu w 1871 r. P. Kummer, przenosząc go do rodzaju Pleurotus[1]. Synonimów nazwy naukowej ma ok. 70. Niektóre z nich:\n" +
//                "Agaricus ostreatus Jacq. 1774\n" +
//                "Agaricus revolutus J.J. Kickx 1867\n" +
//                "Agaricus salignus Pers. 1801\n" +
//                "Crepidopus ostreatus (Jacq.) Gray 1821\n" +
//                "Dendrosarcus ostreatus (Jacq.) Kuntze 1898\n" +
//                "Dendrosarcus revolutus (J. Kickx f.) Kuntze 1898\n" +
//                "Pleurotus revolutus (J. Kickx f.) Gillet 1876\n" +
//                "Pleurotus salignus (Schrad.) P. Kumm. 1871[2].\n" +
//                "Nazwę polską nadał Henryk Orłoś w 1951 r. W polskim piśmiennictwie mykologicznym gatunek ten opisywany był też jako bedłka ostrygowata, bocznotrzonowiec ostrygokształtny i przyuszek ostrygowaty[3].\n" +
//                "\n" +
//                "Morfologia\n" +
//                "Kapelusz\n" +
//                "Średnica od 5 do 25 cm. Kształt początkowo łukowaty, z długo podwiniętym brzegiem, później muszlowaty, wachlarzowaty lub lejkowaty. Do podłoża przyrasta bokiem. Jest miękki i sprężysty, powierzchnia gładka i naga, tylko przy trzonie pokryta białą pilśnią. Kolor dość zróżnicowany; może być w różnych odcieniach brązowego, popielatego, siwobrązowego, stalowoniebieskiego i fioletowego[4].\n" +
//                "\n" +
//                "Blaszki\n" +
//                "Gęste i głęboko zbiegające na trzon, w kolorze od białawego do siwego, u starszych okazów nawet fioletowe[4].\n" +
//                "\n" +
//                "Trzon\n" +
//                "Krótki, gruby, o wysokości od 1 do 4 cm[5]. Kolor biały lub siwy. Jest nagi, tylko przy podstawie pokryty szczecinkami[4].\n" +
//                "\n" +
//                "Miąższ\n" +
//                "U młodych okazów w kapeluszu jest miękki, u starszych sprężysty, w trzonie u starszych staje się korkowaty i zdrewniały. Kolor biały, smak kwaskowaty[4].\n" +
//                "\n" +
//                "Wysyp zarodników\n" +
//                "Biały. Zarodniki elipsoidalne, gładkie, o średnicy 8–11 × 3–4 µm[6].\n" +
//                "\n" +
//                "Gatunki podobne\n" +
//                "boczniak białożółty (Pleurotus dryinus), ma jaśniejszy, białawy kapelusz o powierzchni nieco kosmkowatej[6],\n" +
//                "boczniak rowkowanotrzonowy (Pleurotus cornucopiae) ma trąbkowaty kapelusz i rowkowany trzon[7].\n" +
//                "boczniak łyżkowaty (Pleurotus pulmonarius) ma jasny kapelusz, anyżkowy zapach i występuje wczesnym latem do jesieni[7],\n" +
//                "łycznik późny (Sarcomyxa serotina) jest mniejszy i często ma zielonkawe odcienie[4]. Ponadto jego trzon ma żółtą barwę, a blaszki na niego nie zbiegają tak głęboko, jak to ma miejsce u boczniaka, lecz tworzą wyraźną granicę między kapeluszem a trzonem w górnej jego części[8][9].\n" +
//                "Występowanie i siedlisko\n" +
//                "Poza Antarktydą występuje na wszystkich kontynentach, a także na wielu wyspach[10]. W Polsce jest pospolity[3].\n" +
//                "\n" +
//                "Grzyb nadrzewny występujący na martwym drewnie gatunków drzew liściastych, takich jak: grab, buk, wierzba, topola, robinia akacjowa, brzoza i orzech włoski. Zazwyczaj rośnie w postaci skupionych grup. Składają się one z wielu większych i mniejszych okazów, często kępkowato pozrastanych, przypominających ławice ostryg, skąd pochodzi nazwa tego gatunku[5]. Owocniki pojawiają się dopiero późną jesienią, od końca października do zimy, a gdy zima jest łagodna, również zimą. Czasami pojawiają się na przedwiośniu[7]. Jest dość wytrzymały na mróz, jednak w okresie wytwarzania owocników potrzebuje dużo światła. Przy zbyt małej jego ilości nie wytwarza owocników lub są one małe[11].\n" +
//                "\n" +
//                "Fizjologia\n" +
//                "Boczniak ostrygowaty jest saprotrofem rosnącym na martwym drewnie, ale również pasożytem atakującym jeszcze żywe drzewa, zazwyczaj jednak stare, osłabione lub uszkodzone[7].\n" +
//                "\n" +
//                "Boczniak ostrygowaty jest także grzybem nicieniobójczym. Nicienie zasiedlające próchniejące drewno są paraliżowane substancjami chemicznymi wydzielanymi przez strzępki grzyba, które następnie wnikają do ich ciał i trawią je[12]. W badaniach zidentyfikowano toksynę wydzielaną przez grzyb jako kwas trans-2-decenodikarboksylowy ((ang.) trans-2-decenedioic acid), który w warunkach laboratoryjnych w stężeniu 300 ppm w ciągu godziny trwale obezwładniał 95% nicieni Panagrellus redivivus[13]. Komórki wydzielające ten związek nie występują w owocnikach boczniaka, a jedynie na niewielkich toksocystach na strzępkach grzybni rosnących w podłożu[12].\n" +
//                "\n" +
//                "Zastosowanie\n" +
//                "Grzyb jadalny. Owocniki boczniaka dostarczają łatwo przyswajalnego białka, kwasu foliowego, aminokwasów, witamin z grupy B i soli mineralnych; wykryto w nich także obecność lowastatyny obniżającej poziom cholesterolu we krwi[14] Wdychanie dużych ilości zarodników tego grzyba (co np. ma miejsce u ludzi zajmujących się jego uprawą) jest niebezpieczne i może zakończyć się problemami z płucami[7].\n" +
//                "\n" +
//                "Grzyb uprawny. W wielu krajach, w tym w Polsce, prowadzi się uprawę boczniaka ostrygowatego. Uprawia się go na słomie[7]. Istnieje wiele odmian uprawnych, w tym również o kolorze różowym[11]. Badania przeprowadzone w Meksyku wykazały, że boczniak ostrygowaty może być hodowany na zużytych pieluchach jednorazowych, redukując masę i objętość ich degradowalnych komponentów nawet o 90%. Powstałe w eksperymentalnej hodowli owocniki miały normalny wygląd, wysoką zawartość białka i były wolne od patogenów chorób ludzkich[15].\n" +
//                "\n" +
//                "Grzyb leczniczy o działaniu przeciwnowotworowym, przeciwwirusowym, przeciwbakteryjnym, nerwotonicznym i obniżającym poziom cholesterolu[16]. Zawiera pleuran – substancję o działaniu immunostymulującym i przeciwnowotworowym[17].").imageURL("https://upload.wikimedia.org/wikipedia/commons/8/89/Pleurotus_ostreatus_G3.jpg").build();
//        this.grzybService.saveGrzyb(collageDropout);
//
//        Grzyb readyToDie=Grzyb.builder().identifier(UUID.randomUUID()).name("Borowik szlachetny").description("Borowik szlachetny (Boletus edulis Bull.) – gatunek grzybów z rodziny borowikowatych (Boletaceae)[2], potocznie nazywany prawdziwkiem. Występuje w Ameryce Północnej (głównie na zachód od Gór Skalistych, rzadziej w części centralnej i wschodniej kontynentu) i w Europie[3]. Ponadto został zawleczony do Nowej Zelandii[4] i południowej Afryki[5]. W Polsce często spotykany zwłaszcza w górach, rzadziej na niżu, zwykle rzadki w okolicach wielkich miast.\n" +
//                "\n" +
//                "Aromatyczny grzyb jadalny o szerokich zastosowaniach w kuchniach europejskich. Nadaje się do bezpośredniego spożycia, marynowania, suszenia i do wszelkich innych rodzajów przerobu. Jest wykorzystywany w przemyśle spożywczym.\n" +
//                "\n" +
//                "Systematyka i nazewnictwo\n" +
//                "Pozycja w klasyfikacji według Index Fungorum: Boletaceae, Boletales, Agaricomycetidae, Agaricomycetes, Agaricomycotina, Basidiomycota, Fungi[2].\n" +
//                "\n" +
//                "Niektóre synonimy naukowe\n" +
//                "Ma ok. 60 synonimów naukowych. Niektóre z nich[6]:\n" +
//                "Boletus betulicola (Vassilkov) Pilát & Dermek 1974\n" +
//                "Boletus edulis f. albus (Pers.) J.A. Muñoz 2005\n" +
//                "Boletus edulis f. arcticus Vassilkov 1966\n" +
//                "Boletus edulis f. betulicola (Vassilkov) Vassilkov 1966\n" +
//                "Boletus edulis f. laevipes (Massee) Vassilkov 1966\n" +
//                "Boletus edulis subsp. betulicola (Vassilkov) Hlaváček 1994\n" +
//                "Boletus edulis subsp. trisporus Watling 1974\n" +
//                "Boletus edulis var. arcticus (Vassilkov) Hlaváček 1994\n" +
//                "Boletus edulis var. betulicola Vassilkov 1948\n" +
//                "Boletus edulis var. laevipes Massee 1892\n" +
//                "Boletus esculentus ß albus Pers. 1825\n" +
//                "Boletus persoonii Bon 1988\n" +
//                "Boletus solidus Sowerby 1809\n" +
//                "Dictyopus edulis (Bull.) Forq. 1890\n" +
//                "Leccinum edule (Bull.) Gray 1821\n" +
//                "Nazwy zwyczajowe\n" +
//                "Występujące w nazwie naukowej łacińskie słowo edulis oznacza jadalny. Do polskiej literatury mykologicznej nazwę borowik szlachetny wprowadziła Alina Skirgiełło w 1960[7]. W polskich taksonomiach ludowych grzyb ten znany jest pod wieloma nazwami zwyczajowymi. Współcześnie poza najczęściej stosowaną nazwą zwyczajową borowik szlachetny, do popularnych określeń gatunku należą: prawdziwek i borowik jadalny. Dawniej w języku polskim używano wielu określeń: borowik, grabak, grzyb borowik (też: borownik, borowy), grzyb jadalny, grzyb majowy, grzyb prawdziwy, grzyb sprawiedliwy, grzyb właściwy, prawdzik[8] oraz grzyb prawy, prawak, prawik, przawdziwik, prawdziwiec, grzyb dębowy[9]. Poza tym ze względu na to, że młode osobniki borowika szlachetnego rozwijające się pod igliwiem są barwy białej, bywa on nazywany też grzybem białym.\n" +
//                "\n" +
//                "Ma jeszcze nazwę, związaną ze zmianami w taksonomii botanicznej. Dawniej borowiki rosnące pod brzozami zaliczano do odrębnego gatunku – borowik brzozowy Boletus betulicola (Vasilk.)[10], według aktualnych ustaleń taksonomicznych jest to synonim borowika szlachetnego[2], które w zależności od przyjętego systemu taksonomicznego Komisja ds. Polskiego Nazewnictwa Grzybów Polskiego Towarzystwa Mykologicznego rekomenduje określać jako: borowik szlachetny, borowik szlachetny podgatunek brzozowy, borowik szlachetny odmiana brzozowa lub borowik szlachetny forma brzozowa. Podobnie jest z Boletus edulis f. citrinus o zalecanych nazwach: borowik szlachetny, borowik szlachetny odmiana cytrynowa lub borowik szlachetny forma cytrynowa oraz Boletus edulis var. piceicola o zalecanych nazwach: borowik szlachetny lub borowik szlachetny odmiana świerkowa[11].\n" +
//                "\n" +
//                "Morfologia\n" +
//                "Kapelusz\n" +
//                "Ma średnicę od 6 do 25 centymetrów. U młodych osobników jest zwykle barwy białej, później piaskowej. Z czasem staje się jasnobrązowy i ciemnobrązowy. Rzadko zdarza się, aby kapelusz borowika szlachetnego był barwy karminowej. Kształt kapelusza początkowo jest gładki i półkolisty, później bardziej wypukły, stare okazy są poduszkowato rozpostarte. Powierzchnia kapelusza jest matowa, bywa pomarszczona, w czasie deszczu i u osobników starszych – staje się gładka i lepka.\n" +
//                "\n" +
//                "Hymenofor\n" +
//                "Drobne, okrągławe na przekroju rurki o długości od 8 do 30 milimetrów. Dają się łatwo oddzielić od miąższu kapelusza. Pory i rurki u młodych owocników są zwykle barwy białej bądź kremowej. U osobników starszych są one żółtawooliwkowe, żółtozielone i oliwkowozielone. U nasady hymenofor jest zatokowo wycięty. Podstawki osiągają rozmiary 32–40 × 10–12 µm, maczugowate z 4 zarodnikami[12].\n" +
//                "\n" +
//                "Trzon\n" +
//                "Ma wysokość od 5 do 20 centymetrów, a grubość od 1,5 do 10 centymetrów. Jest koloru białego, szarobiaławego lub piaskowego. U młodych osobników borowika szlachetnego trzon jest pękaty i głęboko osadzony w ziemi, później wydłuża się, staje się maczugowaty i baryłkowaty. Posiada delikatną siateczkę o białawym lub jasnobrązowym zabarwieniu, widoczną zwłaszcza w górnej części trzonu.\n" +
//                "\n" +
//                "Miąższ\n" +
//                "Zwykle ma kolor biały, rzadziej kremowy lub piaskowy, pod skórą czerwonawobrązowy. U młodych osobników jest on twardy, a u starszych gąbczasty. Nie zmienia zabarwienia na powietrzu ani w trakcie krojenia. Zapach ma przyjemny, a smak opisywany jako orzechowy[13].\n" +
//                "\n" +
//                "Zarodniki\n" +
//                "Mają 14–18 × 4,5–7 µm średnicy i mają wrzecionowaty kształt oraz gładką powierzchnię. Zwykle są barwy białej, ciemnooliwkowej lub oliwkowobrązowej[14]. Rozprzestrzeniane są przez ruchy powietrza.\n" +
//                "\n" +
//                "Siedlisko\n" +
//                "Borowik szlachetny występuje zarówno w lasach iglastych, liściastych, jak i mieszanych. Grzyb ten tworzy mikoryzę z licznymi gatunkami drzew, jednak głównie ze świerkami dlatego najobficiej występuje w górskich drzewostanach świerkowych. Preferuje drzewostany w średniej klasie wieku, w starszych drzewostanach iglastych ustępuje podgrzybowi brunatnemu[15][11]. Owocniki pojawiają się najczęściej i najliczniej w okresie od maja do listopada, zdarzają się także w grudniu (np. w 2000 roku)[16]. Owocniki wyrastają pojedynczo, często w niewielkich grupach po kilka, bywa także, że tworzą kręgi[17].\n" +
//                "\n" +
//                "Do prawidłowego rozwoju borowika szlachetnego potrzebne są nie tylko korzenie właściwego gatunku drzewa. Na powierzchni kory tworzy on ryzomorfy – wyraźnie widoczne gołym okiem sznury grzybniowe, które rozchodzą się w glebie w różnych kierunkach i tworzą okazałe owocniki. Jednak aby strzępki jego grzybni połączyły się z korzeniami drzew, w podłożu muszą się znajdować bakterie z rodzaju Pseudomonas[18][19].\n" +
//                "\n" +
//                "Borowik szlachetny a zwierzęta\n" +
//                "Owocniki smakują ludziom, ale też stanowią pokarm wielu gatunków zwierząt. Amatorami ich są przede wszystkim myszy polne i leśne, chrząszcze, ślimaki i czerwie muchówek. W Stanach Zjednoczonych obserwowano żerowanie na larwach obecnych w owocnikach „prawdziwków” ptaków z gatunku pasówka rudosterna[20]. Grzybnia może być przez owady lub inne zwierzęta przenoszona i w ten sposób grzyb może zajmować nowe stanowiska[21].\n" +
//                "\n" +
//                "Klasyfikacja\n" +
//                "Grzyby z grupy Boletus edulis w poszczególnych klasyfikacjach uzyskiwały różną rangę – od form i odmian do podgatunków i odrębnych gatunków (wówczas nazwa B. edulis sensu lato oznaczała gatunek zbiorowy). Różnice wiążą się głównie z preferencjami siedliskowymi, barwą kapelusza i wykształceniem siateczki na trzonie. Taksonami wyróżnianymi obecnie w randze odrębnych gatunków, niegdyś łączonymi w jeden takson tej rangi są: borowik sosnowy (Boletus pinophilus Pilát & Dermek), borowik usiatkowany (Boletus reticulatus Schaeff.), borowik ciemnobrązowy (Boletus aereus Bull.). Systematyka tej grupy wciąż nie jest ustalona w oparciu o kompleksowe badania DNA[3]. Nie stwierdzono między poszczególnymi taksonami istotnych różnic w budowie mikroskopowej[22].").imageURL("https://upload.wikimedia.org/wikipedia/commons/6/69/Boletus_edulis_-_Note%C4%87_Forest.jpg").build();
//        this.grzybService.saveGrzyb(readyToDie);
//
//        Grzyb test=Grzyb.builder().identifier(UUID.randomUUID()).name("Czubajka kania").description("Czubajka kania (Macrolepiota procera (Scop.) Singer) – gatunek grzybów należący do rodziny pieczarkowatych (Agaricaceae)[1].\n" +
//                "\n" +
//                "Systematyka i nazewnictwo\n" +
//                "Pozycja w klasyfikacji według Index Fungorum: Macrolepiota, Agaricaceae, Agaricales, Agaricomycetidae, Agaricomycetes, Agaricomycotina, Basidiomycota, Fungi[1].\n" +
//                "\n" +
//                "Po raz pierwszy takson ten zdiagnozował w roku 1772 Joannes Antonius Scopoli nadając mu nazwę Agaricus procerus. Obecną, uznaną przez Index Fungorum nazwę nadał mu w roku 1948 Rolf Singer, przenosząc go do rodzaju Macrolepiota[1].\n" +
//                "\n" +
//                "Ma ponad 40 synonimów naukowych. Niektóre z nich[2]:\n" +
//                "Agaricus annulatus Lightf.\n" +
//                "Agaricus annulatus Lightf., var. annulatus\n" +
//                "Agaricus antiquatus Batsch\n" +
//                "Agaricus colubrinus Bull.\n" +
//                "Agaricus procerus Scop.\n" +
//                "Agaricus procerus Scop., var. procerus\n" +
//                "Amanita procera (Scop.) Fr.\n" +
//                "Lepiota procera (Scop.) Gray\n" +
//                "Lepiotophyllum procerum (Scop.) Locq.\n" +
//                "Mastocephalus procerus (Scop.) Pat.\n" +
//                "Nazwę polską podał Stanisław Chełchowski w 1898 r. W polskim piśmiennictwie mykologicznym gatunek ten opisywany był też jako bedłka wyniosła, bedłka wysoka, bedłka parasolowata, czubajka wyniosła, czubajka sowa, stroszka strzelista, stroszka cielista[3]. Nazwy regionalne: stroszka strzelista, parasolowiec, parasolnik, czubaj, czubak, gularka, gapa, sowa, drop, kania[4].\n" +
//                "\n" +
//                "Morfologia\n" +
//                "Kapelusz\n" +
//                "W kształcie parasola o średnicy 10–30 cm z garbkiem na środku, z popękaną, łuszczącą się skórą. Za młodu jajowaty i zamknięty, potem stożkowaty, niskołukowaty, na koniec płaski i rozpostarty. U młodych kapelusz w całości jest brązowy, u starszych białawy z dużymi, brązowymi łuskami. Brzeg kapelusza postrzępiony, zazwyczaj biały[5].\n" +
//                "\n" +
//                "Blaszki\n" +
//                "Blaszki gęste, szerokie, niedochodzące do trzonu[6]. U starszych okazów mają ochrowy nalot[5].\n" +
//                "\n" +
//                "Trzon\n" +
//                "O długości 15–40 cm i grubości do 2 cm, walcowaty, zakończony u dołu bulwą o średnicy do 4 cm. Jest łatwy do wyłamania. Początkowo jest pełny i gąbczasty, na starszych owocnikach pusty w środku. Posiada ruchomy pierścień. Powyżej pierścienia skórka trzonu jest białawo-brązowa i gładka, poniżej występują ciemniejsze poprzeczne prążki[5].\n" +
//                "\n" +
//                "Miąższ\n" +
//                "W kapeluszu miękki, w trzonie łykowaty. Jest biały, nie zmienia barwy po uszkodzeniu. Smak łagodny, przyjemny. Wydziela delikatny grzybowo-owocowy zapach[5]\n" +
//                "\n" +
//                "Wysyp zarodników\n" +
//                "Biały. Zarodniki elipsoidalne, gładkie, o rozmiarach 15–20 × 10–13 μm[6].\n" +
//                "\n" +
//                "Gatunki podobne\n" +
//                "Najbardziej podobna jest tzw. czubajka czerwieniejąca (Chlorophyllum rhacodes). Różni się brakiem łusek na trzonie, a jej miąższ czerwienieje po uszkodzeniu[5]. Bardzo podobna jest również czubajka gwiaździsta (Macrolepiota konradii), która jest znacznie mniejsza, posiada mniej, za to większych łat na kapeluszu i inny wzór na trzonie. Najczęściej nie jest odróżniana przez grzybiarzy, ale taka pomyłka nie jest niebezpieczna. Przez niewprawnych grzybiarzy czubajka kania bywa mylona ze śmiertelnie trującym muchomorem zielonawym (sromotnikowym), głównie z jego białymi odmianami i z tego powodu przez wielu grzybiarzy nie jest zbierana. Notowane są przypadki poważnych zatruć muchomorem plamistym[7] oraz grzybami z rodzaju czubajeczka[8], omyłkowo wziętymi za czubajkę. Podobny i trujący jest także sinoblaszek trujący Chlorophyllum molybdites. Gatunek ten pochodzi z Ameryki Północnej, w Polsce nie występuje.\n" +
//                "\n" +
//                "Występowanie i siedlisko\n" +
//                "Występuje w Ameryce Północnej, Europie, Korei, Japonii i na Nowej Zelandii[9]. W Polsce jest dość pospolity na obszarze całego kraju[3].\n" +
//                "\n" +
//                "Rośnie na brzegach lasów liściastych i iglastych, na polanach leśnych i zrębach, na łąkach, w parkach, na poboczach szos, na cmentarzach. Unika siedlisk kwaśnych i wilgotnych, rośnie najczęściej na glebach gliniastych i zasobnych w wapń. Owocniki wytwarza od lata do późnej jesieni[10].\n" +
//                "\n" +
//                "Znaczenie\n" +
//                "Kulinarne\n" +
//                "Saprotrof[3]. Grzyb jadalny, uważany za bardzo smaczny. Jadalne są kapelusze. Dzięki silnemu aromatowi często jest używany jako grzyb przyprawowy. Najczęściej kanie przyrządza się poprzez panierowanie w formie kotleta. Można też jeść smażone kapelusze z chlebem[4].\n" +
//                "\n" +
//                "Czubajkę kanię łatwo uprawiać w ogrodzie. Preferuje miejsca słoneczne lub lekko zacienione i obniżenia terenu, w których zbiera się woda spływowa. Uprawia się ją na płytkiej pryzmie z odpadów drewnianych, trocin i liści, którą należy regularnie zasilać dodatkową biomasą, np. skoszoną trawą, gałęziami itp. Grzybnię zaszczepia się na pryzmie przy użyciu zarodników zebranych bezpośrednio z dojrzałych kapeluszy lub poprzez dolne części trzonu, zawierające fragmenty grzybni. Czubajka kania jest też przyjazna mrówkom i można w ten sam sposób zaszczepiać mrowiska gatunków z rodzaju Formica[11].\n" +
//                "\n" +
//                "Filatelistyka\n" +
//                "Poczta Polska wyemitowała 31 sierpnia 2012 r. znaczek pocztowy przedstawiający czubajkę kanię, o nominale 3 zł, w serii Grzyby w polskich lasach. Wydrukowano 300 000 sztuk, techniką offsetową, na papierze fluorescencyjnym. Autorem projektu znaczka była Marzanna Dąbrowska. Znaczek posiadał przywieszkę z muchomorem plamistym[12").imageURL("https://upload.wikimedia.org/wikipedia/commons/a/a4/Macrolepiota-procera.jpg").build();
//        this.grzybService.saveGrzyb(test);
//
//        Grzyb test2=Grzyb.builder().identifier(UUID.randomUUID()).name("Gąska zielonka").description("Gąska zielonka (Tricholoma equestre (L.) P. Kumm.) – gatunek grzybów należący do rodziny gąskowatych (Tricholomataceae)[1].\n" +
//                "\n" +
//                "Systematyka i nazewnictwo\n" +
//                "Pozycja w klasyfikacji według Index Fungorum: Tricholoma, Tricholomataceae, Agaricales, Agaricomycetidae, Agaricomycetes, Agaricomycotina, Basidiomycota, Fungi[1].\n" +
//                "\n" +
//                "Po raz pierwszy takson ten zdiagnozowany został w 1753 r. przez K. Linneusza, który nadał mu nazwę Agaricus equestre. Obecną, uznaną przez Index Fungorum nazwę nadał mu P. Kumm. w 1871 r[1].\n" +
//                "\n" +
//                "Ma ok. 20 synonimów. Niektóre z nich[2]:\n" +
//                "Agaricus auratus Paulet 1793\n" +
//                "Agaricus equestris L. 1753\n" +
//                "Agaricus flavovirens Pers. 1793\n" +
//                "Gyrophila equestris (L.) Quél. 1886\n" +
//                "Gyrophila equestris var. aurata (Paulet) Quél. 1886\n" +
//                "Melanoleuca equestris (L.) Murrill 1914\n" +
//                "Tricholoma auratum (Paulet) Gillet 1874\n" +
//                "Tricholoma flavovirens (Pers.) S. Lundell 1942\n" +
//                "Nazwę polską nadał Józef Jundziłł w 1830 r. W polskim piśmiennictwie mykologicznym ma też inne nazwy: bedłka zielonka, gąska żółta[3] i prośnianka[4].\n" +
//                "\n" +
//                "Morfologia\n" +
//                "Kapelusz\n" +
//                "Średnicy 4–10 cm, żółtozielony lub żółtobrązowy, pośrodku ciemniejszy, gładki, w młodym owocniku stożkowato wypukły, później płaski, często różnie powyginany. Skorka naga lub drobnołuskowata, mazista i dlatego często z ziarnami piasku, podczas wilgoci śliska[5].\n" +
//                "\n" +
//                "Blaszki\n" +
//                "Od bladożółtawych do siarkowożółtych, średnio gęste, cienkie, wycięte z ząbkiem, ale u nasady szeroko przyrośnięte[6].\n" +
//                "\n" +
//                "Trzon\n" +
//                "Osiąga długość od 3 do 9 cm i grubość do 3 cm. Jest cylindryczny, pełny. Powierzchnia najpierw z podłużnymi włóknami, później gładka, żółta albo żółtozielonkawa[7].\n" +
//                "\n" +
//                "Miąższ\n" +
//                "Twardy, kruchy, biały, po przekrojeniu nie zmienia zabarwienia. Smak słodkawoorzechowy, pachnie jak świeżo zmielona mąka[7].\n" +
//                "\n" +
//                "Wysyp zarodników\n" +
//                "Biały. Zarodniki o średnicy 6-8 × 3,5-5 µm, jajowate, gładkie, bezbarwne[5].\n" +
//                "\n" +
//                "Występowanie i siedlisko\n" +
//                "Gąska zielonka rozprzestrzeniona jest szeroko w Ameryce Północnej i Europie, ale podana też została z niektórych miejsc w Azji (Japonia), Ameryce Środkowej (Kostaryka) i Afryki[8]. W Polsce gatunek rzadki. Znajduje się na Czerwonej liście roślin i grzybów Polski. Ma status I – gatunek o nieokreślonym zagrożeniu[9]. Znajduje się na listach gatunków zagrożonych także w Niemczech, Holandii, Słowacji[3]. W krajach, gdzie jest gatunkiem zagrożonym – zabroniony jest zbiór tego gatunku[6].\n" +
//                "\n" +
//                "Rośnie od października do grudnia, w borach sosnowych na piaszczystej glebie z dużą ilością porostów, prawie zawsze gromadnie, czasami razem z gąską niekształtną (Tricholoma portentosum). Prawie cały rozwój owocnika przebiega pod ziemią, z mchu i igliwia wystaje zwykle tylko część kapelusza, dlatego też trudno ją znaleźć; miejscami jest częsta[5].\n" +
//                "\n" +
//                "Znaczenie\n" +
//                "Grzyb mikoryzowy[3]. Dawniej uważany za smaczny grzyb jadalny, jednak obecnie nie poleca się jego zbioru[10], w wielu krajach (np. Francja i Niemcy) uznany za toksyczny i niebezpieczny. We Francji w latach 2001–2003 odnotowano liczne przypadki zatruć, z tego kilka śmiertelnych[5][11]. W kraju tym zaczęło dochodzić do coraz częstszych przypadków zatruć po spożyciu gąski zielonej, najprawdopodobniej z powodu skażenia środowiska. Na obszarach o środowisku skażonym zaleca się spożywanie tego gatunku w ograniczonych ilościach[6]. W roku 2009 udokumentowano zatrucie zielonkami w Polsce u trzech osób, z tego jedno śmiertelne. O podstawowy mechanizm zatrucia podejrzewa się rabdomiolizę, która uszkadza błony komórkowe mięśni szkieletowych. W rezultacie tego białko mioglobina przenoszące tlen do mięśni jest uwalniane i pojawia się w moczu, co prowadzi do objawów takich jak ból mięśni i brązowawe zabarwienie moczu[11].\n" +
//                "\n" +
//                "Mimo wszystkich kontrowersji z nią związanych, zgodnie z rozporządzeniem z dnia 12 czerwca 2018 r. jest grzybem dopuszczonym do obrotu handlowego na terenie Polski[12].\n" +
//                "\n" +
//                "Przeprowadzony przez polskich naukowców krytyczny przegląd badań klinicznych i eksperymentalnych wskazujących na rzekomą toksyczność gąski zielonki podkreśla jednak stanowczo, iż gatunek ten nie stanowi większego zagrożenia dla zdrowia aniżeli gatunki grzybów bezsprzecznie uznawane za jadalne, a opisy przypadków zatruć i badań w modelu doświadczalnym cechuje szereg ograniczeń interpretacyjnych[13].").imageURL("https://upload.wikimedia.org/wikipedia/commons/6/63/Tricholoma_equestre_G7.jpg").build();
//        this.grzybService.saveGrzyb(test2);
//
//        Grzyb test3=Grzyb.builder().identifier(UUID.randomUUID()).name("Kolczak obłączasty").description("Czubajka kania (Macrolepiota procera (Scop.) Singer) – gatunek grzybów należący do rodziny pieczarkowatych (Agaricaceae)[1].\n" +
//                "\n" +
//                "Systematyka i nazewnictwo\n" +
//                "Pozycja w klasyfikacji według Index Fungorum: Macrolepiota, Agaricaceae, Agaricales, Agaricomycetidae, Agaricomycetes, Agaricomycotina, Basidiomycota, Fungi[1].\n" +
//                "\n" +
//                "Po raz pierwszy takson ten zdiagnozował w roku 1772 Joannes Antonius Scopoli nadając mu nazwę Agaricus procerus. Obecną, uznaną przez Index Fungorum nazwę nadał mu w roku 1948 Rolf Singer, przenosząc go do rodzaju Macrolepiota[1].\n" +
//                "\n" +
//                "Ma ponad 40 synonimów naukowych. Niektóre z nich[2]:\n" +
//                "Agaricus annulatus Lightf.\n" +
//                "Agaricus annulatus Lightf., var. annulatus\n" +
//                "Agaricus antiquatus Batsch\n" +
//                "Agaricus colubrinus Bull.\n" +
//                "Agaricus procerus Scop.\n" +
//                "Agaricus procerus Scop., var. procerus\n" +
//                "Amanita procera (Scop.) Fr.\n" +
//                "Lepiota procera (Scop.) Gray\n" +
//                "Lepiotophyllum procerum (Scop.) Locq.\n" +
//                "Mastocephalus procerus (Scop.) Pat.\n" +
//                "Nazwę polską podał Stanisław Chełchowski w 1898 r. W polskim piśmiennictwie mykologicznym gatunek ten opisywany był też jako bedłka wyniosła, bedłka wysoka, bedłka parasolowata, czubajka wyniosła, czubajka sowa, stroszka strzelista, stroszka cielista[3]. Nazwy regionalne: stroszka strzelista, parasolowiec, parasolnik, czubaj, czubak, gularka, gapa, sowa, drop, kania[4].\n" +
//                "\n" +
//                "Morfologia\n" +
//                "Kapelusz\n" +
//                "W kształcie parasola o średnicy 10–30 cm z garbkiem na środku, z popękaną, łuszczącą się skórą. Za młodu jajowaty i zamknięty, potem stożkowaty, niskołukowaty, na koniec płaski i rozpostarty. U młodych kapelusz w całości jest brązowy, u starszych białawy z dużymi, brązowymi łuskami. Brzeg kapelusza postrzępiony, zazwyczaj biały[5].\n" +
//                "\n" +
//                "Blaszki\n" +
//                "Blaszki gęste, szerokie, niedochodzące do trzonu[6]. U starszych okazów mają ochrowy nalot[5].\n" +
//                "\n" +
//                "Trzon\n" +
//                "O długości 15–40 cm i grubości do 2 cm, walcowaty, zakończony u dołu bulwą o średnicy do 4 cm. Jest łatwy do wyłamania. Początkowo jest pełny i gąbczasty, na starszych owocnikach pusty w środku. Posiada ruchomy pierścień. Powyżej pierścienia skórka trzonu jest białawo-brązowa i gładka, poniżej występują ciemniejsze poprzeczne prążki[5].\n" +
//                "\n" +
//                "Miąższ\n" +
//                "W kapeluszu miękki, w trzonie łykowaty. Jest biały, nie zmienia barwy po uszkodzeniu. Smak łagodny, przyjemny. Wydziela delikatny grzybowo-owocowy zapach[5]\n" +
//                "\n" +
//                "Wysyp zarodników\n" +
//                "Biały. Zarodniki elipsoidalne, gładkie, o rozmiarach 15–20 × 10–13 μm[6].\n" +
//                "\n" +
//                "Gatunki podobne\n" +
//                "Najbardziej podobna jest tzw. czubajka czerwieniejąca (Chlorophyllum rhacodes). Różni się brakiem łusek na trzonie, a jej miąższ czerwienieje po uszkodzeniu[5]. Bardzo podobna jest również czubajka gwiaździsta (Macrolepiota konradii), która jest znacznie mniejsza, posiada mniej, za to większych łat na kapeluszu i inny wzór na trzonie. Najczęściej nie jest odróżniana przez grzybiarzy, ale taka pomyłka nie jest niebezpieczna. Przez niewprawnych grzybiarzy czubajka kania bywa mylona ze śmiertelnie trującym muchomorem zielonawym (sromotnikowym), głównie z jego białymi odmianami i z tego powodu przez wielu grzybiarzy nie jest zbierana. Notowane są przypadki poważnych zatruć muchomorem plamistym[7] oraz grzybami z rodzaju czubajeczka[8], omyłkowo wziętymi za czubajkę. Podobny i trujący jest także sinoblaszek trujący Chlorophyllum molybdites. Gatunek ten pochodzi z Ameryki Północnej, w Polsce nie występuje.\n" +
//                "\n" +
//                "Występowanie i siedlisko\n" +
//                "Występuje w Ameryce Północnej, Europie, Korei, Japonii i na Nowej Zelandii[9]. W Polsce jest dość pospolity na obszarze całego kraju[3].\n" +
//                "\n" +
//                "Rośnie na brzegach lasów liściastych i iglastych, na polanach leśnych i zrębach, na łąkach, w parkach, na poboczach szos, na cmentarzach. Unika siedlisk kwaśnych i wilgotnych, rośnie najczęściej na glebach gliniastych i zasobnych w wapń. Owocniki wytwarza od lata do późnej jesieni[10].\n" +
//                "\n" +
//                "Znaczenie\n" +
//                "Kulinarne\n" +
//                "Saprotrof[3]. Grzyb jadalny, uważany za bardzo smaczny. Jadalne są kapelusze. Dzięki silnemu aromatowi często jest używany jako grzyb przyprawowy. Najczęściej kanie przyrządza się poprzez panierowanie w formie kotleta. Można też jeść smażone kapelusze z chlebem[4].\n" +
//                "\n" +
//                "Czubajkę kanię łatwo uprawiać w ogrodzie. Preferuje miejsca słoneczne lub lekko zacienione i obniżenia terenu, w których zbiera się woda spływowa. Uprawia się ją na płytkiej pryzmie z odpadów drewnianych, trocin i liści, którą należy regularnie zasilać dodatkową biomasą, np. skoszoną trawą, gałęziami itp. Grzybnię zaszczepia się na pryzmie przy użyciu zarodników zebranych bezpośrednio z dojrzałych kapeluszy lub poprzez dolne części trzonu, zawierające fragmenty grzybni. Czubajka kania jest też przyjazna mrówkom i można w ten sam sposób zaszczepiać mrowiska gatunków z rodzaju Formica[11].\n" +
//                "\n" +
//                "Filatelistyka\n" +
//                "Poczta Polska wyemitowała 31 sierpnia 2012 r. znaczek pocztowy przedstawiający czubajkę kanię, o nominale 3 zł, w serii Grzyby w polskich lasach. Wydrukowano 300 000 sztuk, techniką offsetową, na papierze fluorescencyjnym. Autorem projektu znaczka była Marzanna Dąbrowska. Znaczek posiadał przywieszkę z muchomorem plamistym[12").imageURL("https://upload.wikimedia.org/wikipedia/commons/c/c7/Hydnum_repandum_G4.JPG").build();
//        this.grzybService.saveGrzyb(test3);
//
//        Grzyb test4=Grzyb.builder().identifier(UUID.randomUUID()).name("Koźlarz babka").description("Gąska zielonka (Tricholoma equestre (L.) P. Kumm.) – gatunek grzybów należący do rodziny gąskowatych (Tricholomataceae)[1].\n" +
//                "\n" +
//                "Systematyka i nazewnictwo\n" +
//                "Pozycja w klasyfikacji według Index Fungorum: Tricholoma, Tricholomataceae, Agaricales, Agaricomycetidae, Agaricomycetes, Agaricomycotina, Basidiomycota, Fungi[1].\n" +
//                "\n" +
//                "Po raz pierwszy takson ten zdiagnozowany został w 1753 r. przez K. Linneusza, który nadał mu nazwę Agaricus equestre. Obecną, uznaną przez Index Fungorum nazwę nadał mu P. Kumm. w 1871 r[1].\n" +
//                "\n" +
//                "Ma ok. 20 synonimów. Niektóre z nich[2]:\n" +
//                "Agaricus auratus Paulet 1793\n" +
//                "Agaricus equestris L. 1753\n" +
//                "Agaricus flavovirens Pers. 1793\n" +
//                "Gyrophila equestris (L.) Quél. 1886\n" +
//                "Gyrophila equestris var. aurata (Paulet) Quél. 1886\n" +
//                "Melanoleuca equestris (L.) Murrill 1914\n" +
//                "Tricholoma auratum (Paulet) Gillet 1874\n" +
//                "Tricholoma flavovirens (Pers.) S. Lundell 1942\n" +
//                "Nazwę polską nadał Józef Jundziłł w 1830 r. W polskim piśmiennictwie mykologicznym ma też inne nazwy: bedłka zielonka, gąska żółta[3] i prośnianka[4].\n" +
//                "\n" +
//                "Morfologia\n" +
//                "Kapelusz\n" +
//                "Średnicy 4–10 cm, żółtozielony lub żółtobrązowy, pośrodku ciemniejszy, gładki, w młodym owocniku stożkowato wypukły, później płaski, często różnie powyginany. Skorka naga lub drobnołuskowata, mazista i dlatego często z ziarnami piasku, podczas wilgoci śliska[5].\n" +
//                "\n" +
//                "Blaszki\n" +
//                "Od bladożółtawych do siarkowożółtych, średnio gęste, cienkie, wycięte z ząbkiem, ale u nasady szeroko przyrośnięte[6].\n" +
//                "\n" +
//                "Trzon\n" +
//                "Osiąga długość od 3 do 9 cm i grubość do 3 cm. Jest cylindryczny, pełny. Powierzchnia najpierw z podłużnymi włóknami, później gładka, żółta albo żółtozielonkawa[7].\n" +
//                "\n" +
//                "Miąższ\n" +
//                "Twardy, kruchy, biały, po przekrojeniu nie zmienia zabarwienia. Smak słodkawoorzechowy, pachnie jak świeżo zmielona mąka[7].\n" +
//                "\n" +
//                "Wysyp zarodników\n" +
//                "Biały. Zarodniki o średnicy 6-8 × 3,5-5 µm, jajowate, gładkie, bezbarwne[5].\n" +
//                "\n" +
//                "Występowanie i siedlisko\n" +
//                "Gąska zielonka rozprzestrzeniona jest szeroko w Ameryce Północnej i Europie, ale podana też została z niektórych miejsc w Azji (Japonia), Ameryce Środkowej (Kostaryka) i Afryki[8]. W Polsce gatunek rzadki. Znajduje się na Czerwonej liście roślin i grzybów Polski. Ma status I – gatunek o nieokreślonym zagrożeniu[9]. Znajduje się na listach gatunków zagrożonych także w Niemczech, Holandii, Słowacji[3]. W krajach, gdzie jest gatunkiem zagrożonym – zabroniony jest zbiór tego gatunku[6].\n" +
//                "\n" +
//                "Rośnie od października do grudnia, w borach sosnowych na piaszczystej glebie z dużą ilością porostów, prawie zawsze gromadnie, czasami razem z gąską niekształtną (Tricholoma portentosum). Prawie cały rozwój owocnika przebiega pod ziemią, z mchu i igliwia wystaje zwykle tylko część kapelusza, dlatego też trudno ją znaleźć; miejscami jest częsta[5].\n" +
//                "\n" +
//                "Znaczenie\n" +
//                "Grzyb mikoryzowy[3]. Dawniej uważany za smaczny grzyb jadalny, jednak obecnie nie poleca się jego zbioru[10], w wielu krajach (np. Francja i Niemcy) uznany za toksyczny i niebezpieczny. We Francji w latach 2001–2003 odnotowano liczne przypadki zatruć, z tego kilka śmiertelnych[5][11]. W kraju tym zaczęło dochodzić do coraz częstszych przypadków zatruć po spożyciu gąski zielonej, najprawdopodobniej z powodu skażenia środowiska. Na obszarach o środowisku skażonym zaleca się spożywanie tego gatunku w ograniczonych ilościach[6]. W roku 2009 udokumentowano zatrucie zielonkami w Polsce u trzech osób, z tego jedno śmiertelne. O podstawowy mechanizm zatrucia podejrzewa się rabdomiolizę, która uszkadza błony komórkowe mięśni szkieletowych. W rezultacie tego białko mioglobina przenoszące tlen do mięśni jest uwalniane i pojawia się w moczu, co prowadzi do objawów takich jak ból mięśni i brązowawe zabarwienie moczu[11].\n" +
//                "\n" +
//                "Mimo wszystkich kontrowersji z nią związanych, zgodnie z rozporządzeniem z dnia 12 czerwca 2018 r. jest grzybem dopuszczonym do obrotu handlowego na terenie Polski[12].\n" +
//                "\n" +
//                "Przeprowadzony przez polskich naukowców krytyczny przegląd badań klinicznych i eksperymentalnych wskazujących na rzekomą toksyczność gąski zielonki podkreśla jednak stanowczo, iż gatunek ten nie stanowi większego zagrożenia dla zdrowia aniżeli gatunki grzybów bezsprzecznie uznawane za jadalne, a opisy przypadków zatruć i badań w modelu doświadczalnym cechuje szereg ograniczeń interpretacyjnych[13].").imageURL("https://upload.wikimedia.org/wikipedia/commons/4/44/Leccinum_scabrum_G3.1.jpg").build();
//        this.grzybService.saveGrzyb(test4);
//
//        Grzyb test5=Grzyb.builder().identifier(UUID.randomUUID()).name("Koźlarz czerwony").description("Czubajka kania (Macrolepiota procera (Scop.) Singer) – gatunek grzybów należący do rodziny pieczarkowatych (Agaricaceae)[1].\n" +
//                "\n" +
//                "Systematyka i nazewnictwo\n" +
//                "Pozycja w klasyfikacji według Index Fungorum: Macrolepiota, Agaricaceae, Agaricales, Agaricomycetidae, Agaricomycetes, Agaricomycotina, Basidiomycota, Fungi[1].\n" +
//                "\n" +
//                "Po raz pierwszy takson ten zdiagnozował w roku 1772 Joannes Antonius Scopoli nadając mu nazwę Agaricus procerus. Obecną, uznaną przez Index Fungorum nazwę nadał mu w roku 1948 Rolf Singer, przenosząc go do rodzaju Macrolepiota[1].\n" +
//                "\n" +
//                "Ma ponad 40 synonimów naukowych. Niektóre z nich[2]:\n" +
//                "Agaricus annulatus Lightf.\n" +
//                "Agaricus annulatus Lightf., var. annulatus\n" +
//                "Agaricus antiquatus Batsch\n" +
//                "Agaricus colubrinus Bull.\n" +
//                "Agaricus procerus Scop.\n" +
//                "Agaricus procerus Scop., var. procerus\n" +
//                "Amanita procera (Scop.) Fr.\n" +
//                "Lepiota procera (Scop.) Gray\n" +
//                "Lepiotophyllum procerum (Scop.) Locq.\n" +
//                "Mastocephalus procerus (Scop.) Pat.\n" +
//                "Nazwę polską podał Stanisław Chełchowski w 1898 r. W polskim piśmiennictwie mykologicznym gatunek ten opisywany był też jako bedłka wyniosła, bedłka wysoka, bedłka parasolowata, czubajka wyniosła, czubajka sowa, stroszka strzelista, stroszka cielista[3]. Nazwy regionalne: stroszka strzelista, parasolowiec, parasolnik, czubaj, czubak, gularka, gapa, sowa, drop, kania[4].\n" +
//                "\n" +
//                "Morfologia\n" +
//                "Kapelusz\n" +
//                "W kształcie parasola o średnicy 10–30 cm z garbkiem na środku, z popękaną, łuszczącą się skórą. Za młodu jajowaty i zamknięty, potem stożkowaty, niskołukowaty, na koniec płaski i rozpostarty. U młodych kapelusz w całości jest brązowy, u starszych białawy z dużymi, brązowymi łuskami. Brzeg kapelusza postrzępiony, zazwyczaj biały[5].\n" +
//                "\n" +
//                "Blaszki\n" +
//                "Blaszki gęste, szerokie, niedochodzące do trzonu[6]. U starszych okazów mają ochrowy nalot[5].\n" +
//                "\n" +
//                "Trzon\n" +
//                "O długości 15–40 cm i grubości do 2 cm, walcowaty, zakończony u dołu bulwą o średnicy do 4 cm. Jest łatwy do wyłamania. Początkowo jest pełny i gąbczasty, na starszych owocnikach pusty w środku. Posiada ruchomy pierścień. Powyżej pierścienia skórka trzonu jest białawo-brązowa i gładka, poniżej występują ciemniejsze poprzeczne prążki[5].\n" +
//                "\n" +
//                "Miąższ\n" +
//                "W kapeluszu miękki, w trzonie łykowaty. Jest biały, nie zmienia barwy po uszkodzeniu. Smak łagodny, przyjemny. Wydziela delikatny grzybowo-owocowy zapach[5]\n" +
//                "\n" +
//                "Wysyp zarodników\n" +
//                "Biały. Zarodniki elipsoidalne, gładkie, o rozmiarach 15–20 × 10–13 μm[6].\n" +
//                "\n" +
//                "Gatunki podobne\n" +
//                "Najbardziej podobna jest tzw. czubajka czerwieniejąca (Chlorophyllum rhacodes). Różni się brakiem łusek na trzonie, a jej miąższ czerwienieje po uszkodzeniu[5]. Bardzo podobna jest również czubajka gwiaździsta (Macrolepiota konradii), która jest znacznie mniejsza, posiada mniej, za to większych łat na kapeluszu i inny wzór na trzonie. Najczęściej nie jest odróżniana przez grzybiarzy, ale taka pomyłka nie jest niebezpieczna. Przez niewprawnych grzybiarzy czubajka kania bywa mylona ze śmiertelnie trującym muchomorem zielonawym (sromotnikowym), głównie z jego białymi odmianami i z tego powodu przez wielu grzybiarzy nie jest zbierana. Notowane są przypadki poważnych zatruć muchomorem plamistym[7] oraz grzybami z rodzaju czubajeczka[8], omyłkowo wziętymi za czubajkę. Podobny i trujący jest także sinoblaszek trujący Chlorophyllum molybdites. Gatunek ten pochodzi z Ameryki Północnej, w Polsce nie występuje.\n" +
//                "\n" +
//                "Występowanie i siedlisko\n" +
//                "Występuje w Ameryce Północnej, Europie, Korei, Japonii i na Nowej Zelandii[9]. W Polsce jest dość pospolity na obszarze całego kraju[3].\n" +
//                "\n" +
//                "Rośnie na brzegach lasów liściastych i iglastych, na polanach leśnych i zrębach, na łąkach, w parkach, na poboczach szos, na cmentarzach. Unika siedlisk kwaśnych i wilgotnych, rośnie najczęściej na glebach gliniastych i zasobnych w wapń. Owocniki wytwarza od lata do późnej jesieni[10].\n" +
//                "\n" +
//                "Znaczenie\n" +
//                "Kulinarne\n" +
//                "Saprotrof[3]. Grzyb jadalny, uważany za bardzo smaczny. Jadalne są kapelusze. Dzięki silnemu aromatowi często jest używany jako grzyb przyprawowy. Najczęściej kanie przyrządza się poprzez panierowanie w formie kotleta. Można też jeść smażone kapelusze z chlebem[4].\n" +
//                "\n" +
//                "Czubajkę kanię łatwo uprawiać w ogrodzie. Preferuje miejsca słoneczne lub lekko zacienione i obniżenia terenu, w których zbiera się woda spływowa. Uprawia się ją na płytkiej pryzmie z odpadów drewnianych, trocin i liści, którą należy regularnie zasilać dodatkową biomasą, np. skoszoną trawą, gałęziami itp. Grzybnię zaszczepia się na pryzmie przy użyciu zarodników zebranych bezpośrednio z dojrzałych kapeluszy lub poprzez dolne części trzonu, zawierające fragmenty grzybni. Czubajka kania jest też przyjazna mrówkom i można w ten sam sposób zaszczepiać mrowiska gatunków z rodzaju Formica[11].\n" +
//                "\n" +
//                "Filatelistyka\n" +
//                "Poczta Polska wyemitowała 31 sierpnia 2012 r. znaczek pocztowy przedstawiający czubajkę kanię, o nominale 3 zł, w serii Grzyby w polskich lasach. Wydrukowano 300 000 sztuk, techniką offsetową, na papierze fluorescencyjnym. Autorem projektu znaczka była Marzanna Dąbrowska. Znaczek posiadał przywieszkę z muchomorem plamistym[12").imageURL("https://upload.wikimedia.org/wikipedia/commons/b/bf/Leccinum_aurantiacum_G4.JPG").build();
//        this.grzybService.saveGrzyb(test5);
//
//        Grzyb test6=Grzyb.builder().identifier(UUID.randomUUID()).name("Koźlarek grabowy").description("Gąska zielonka (Tricholoma equestre (L.) P. Kumm.) – gatunek grzybów należący do rodziny gąskowatych (Tricholomataceae)[1].\n" +
//                "\n" +
//                "Systematyka i nazewnictwo\n" +
//                "Pozycja w klasyfikacji według Index Fungorum: Tricholoma, Tricholomataceae, Agaricales, Agaricomycetidae, Agaricomycetes, Agaricomycotina, Basidiomycota, Fungi[1].\n" +
//                "\n" +
//                "Po raz pierwszy takson ten zdiagnozowany został w 1753 r. przez K. Linneusza, który nadał mu nazwę Agaricus equestre. Obecną, uznaną przez Index Fungorum nazwę nadał mu P. Kumm. w 1871 r[1].\n" +
//                "\n" +
//                "Ma ok. 20 synonimów. Niektóre z nich[2]:\n" +
//                "Agaricus auratus Paulet 1793\n" +
//                "Agaricus equestris L. 1753\n" +
//                "Agaricus flavovirens Pers. 1793\n" +
//                "Gyrophila equestris (L.) Quél. 1886\n" +
//                "Gyrophila equestris var. aurata (Paulet) Quél. 1886\n" +
//                "Melanoleuca equestris (L.) Murrill 1914\n" +
//                "Tricholoma auratum (Paulet) Gillet 1874\n" +
//                "Tricholoma flavovirens (Pers.) S. Lundell 1942\n" +
//                "Nazwę polską nadał Józef Jundziłł w 1830 r. W polskim piśmiennictwie mykologicznym ma też inne nazwy: bedłka zielonka, gąska żółta[3] i prośnianka[4].\n" +
//                "\n" +
//                "Morfologia\n" +
//                "Kapelusz\n" +
//                "Średnicy 4–10 cm, żółtozielony lub żółtobrązowy, pośrodku ciemniejszy, gładki, w młodym owocniku stożkowato wypukły, później płaski, często różnie powyginany. Skorka naga lub drobnołuskowata, mazista i dlatego często z ziarnami piasku, podczas wilgoci śliska[5].\n" +
//                "\n" +
//                "Blaszki\n" +
//                "Od bladożółtawych do siarkowożółtych, średnio gęste, cienkie, wycięte z ząbkiem, ale u nasady szeroko przyrośnięte[6].\n" +
//                "\n" +
//                "Trzon\n" +
//                "Osiąga długość od 3 do 9 cm i grubość do 3 cm. Jest cylindryczny, pełny. Powierzchnia najpierw z podłużnymi włóknami, później gładka, żółta albo żółtozielonkawa[7].\n" +
//                "\n" +
//                "Miąższ\n" +
//                "Twardy, kruchy, biały, po przekrojeniu nie zmienia zabarwienia. Smak słodkawoorzechowy, pachnie jak świeżo zmielona mąka[7].\n" +
//                "\n" +
//                "Wysyp zarodników\n" +
//                "Biały. Zarodniki o średnicy 6-8 × 3,5-5 µm, jajowate, gładkie, bezbarwne[5].\n" +
//                "\n" +
//                "Występowanie i siedlisko\n" +
//                "Gąska zielonka rozprzestrzeniona jest szeroko w Ameryce Północnej i Europie, ale podana też została z niektórych miejsc w Azji (Japonia), Ameryce Środkowej (Kostaryka) i Afryki[8]. W Polsce gatunek rzadki. Znajduje się na Czerwonej liście roślin i grzybów Polski. Ma status I – gatunek o nieokreślonym zagrożeniu[9]. Znajduje się na listach gatunków zagrożonych także w Niemczech, Holandii, Słowacji[3]. W krajach, gdzie jest gatunkiem zagrożonym – zabroniony jest zbiór tego gatunku[6].\n" +
//                "\n" +
//                "Rośnie od października do grudnia, w borach sosnowych na piaszczystej glebie z dużą ilością porostów, prawie zawsze gromadnie, czasami razem z gąską niekształtną (Tricholoma portentosum). Prawie cały rozwój owocnika przebiega pod ziemią, z mchu i igliwia wystaje zwykle tylko część kapelusza, dlatego też trudno ją znaleźć; miejscami jest częsta[5].\n" +
//                "\n" +
//                "Znaczenie\n" +
//                "Grzyb mikoryzowy[3]. Dawniej uważany za smaczny grzyb jadalny, jednak obecnie nie poleca się jego zbioru[10], w wielu krajach (np. Francja i Niemcy) uznany za toksyczny i niebezpieczny. We Francji w latach 2001–2003 odnotowano liczne przypadki zatruć, z tego kilka śmiertelnych[5][11]. W kraju tym zaczęło dochodzić do coraz częstszych przypadków zatruć po spożyciu gąski zielonej, najprawdopodobniej z powodu skażenia środowiska. Na obszarach o środowisku skażonym zaleca się spożywanie tego gatunku w ograniczonych ilościach[6]. W roku 2009 udokumentowano zatrucie zielonkami w Polsce u trzech osób, z tego jedno śmiertelne. O podstawowy mechanizm zatrucia podejrzewa się rabdomiolizę, która uszkadza błony komórkowe mięśni szkieletowych. W rezultacie tego białko mioglobina przenoszące tlen do mięśni jest uwalniane i pojawia się w moczu, co prowadzi do objawów takich jak ból mięśni i brązowawe zabarwienie moczu[11].\n" +
//                "\n" +
//                "Mimo wszystkich kontrowersji z nią związanych, zgodnie z rozporządzeniem z dnia 12 czerwca 2018 r. jest grzybem dopuszczonym do obrotu handlowego na terenie Polski[12].\n" +
//                "\n" +
//                "Przeprowadzony przez polskich naukowców krytyczny przegląd badań klinicznych i eksperymentalnych wskazujących na rzekomą toksyczność gąski zielonki podkreśla jednak stanowczo, iż gatunek ten nie stanowi większego zagrożenia dla zdrowia aniżeli gatunki grzybów bezsprzecznie uznawane za jadalne, a opisy przypadków zatruć i badań w modelu doświadczalnym cechuje szereg ograniczeń interpretacyjnych[13].").imageURL("https://upload.wikimedia.org/wikipedia/commons/2/21/Leccinum_pseudoscabrum_2020_G1.jpg").build();
//        this.grzybService.saveGrzyb(test6);
//        Grzyb test7=Grzyb.builder().identifier(UUID.randomUUID()).name("Lejkowiec dęty").description("Gąska zielonka (Tricholoma equestre (L.) P. Kumm.) – gatunek grzybów należący do rodziny gąskowatych (Tricholomataceae)[1].\n" +
//                "\n" +
//                "Systematyka i nazewnictwo\n" +
//                "Pozycja w klasyfikacji według Index Fungorum: Tricholoma, Tricholomataceae, Agaricales, Agaricomycetidae, Agaricomycetes, Agaricomycotina, Basidiomycota, Fungi[1].\n" +
//                "\n" +
//                "Po raz pierwszy takson ten zdiagnozowany został w 1753 r. przez K. Linneusza, który nadał mu nazwę Agaricus equestre. Obecną, uznaną przez Index Fungorum nazwę nadał mu P. Kumm. w 1871 r[1].\n" +
//                "\n" +
//                "Ma ok. 20 synonimów. Niektóre z nich[2]:\n" +
//                "Agaricus auratus Paulet 1793\n" +
//                "Agaricus equestris L. 1753\n" +
//                "Agaricus flavovirens Pers. 1793\n" +
//                "Gyrophila equestris (L.) Quél. 1886\n" +
//                "Gyrophila equestris var. aurata (Paulet) Quél. 1886\n" +
//                "Melanoleuca equestris (L.) Murrill 1914\n" +
//                "Tricholoma auratum (Paulet) Gillet 1874\n" +
//                "Tricholoma flavovirens (Pers.) S. Lundell 1942\n" +
//                "Nazwę polską nadał Józef Jundziłł w 1830 r. W polskim piśmiennictwie mykologicznym ma też inne nazwy: bedłka zielonka, gąska żółta[3] i prośnianka[4].\n" +
//                "\n" +
//                "Morfologia\n" +
//                "Kapelusz\n" +
//                "Średnicy 4–10 cm, żółtozielony lub żółtobrązowy, pośrodku ciemniejszy, gładki, w młodym owocniku stożkowato wypukły, później płaski, często różnie powyginany. Skorka naga lub drobnołuskowata, mazista i dlatego często z ziarnami piasku, podczas wilgoci śliska[5].\n" +
//                "\n" +
//                "Blaszki\n" +
//                "Od bladożółtawych do siarkowożółtych, średnio gęste, cienkie, wycięte z ząbkiem, ale u nasady szeroko przyrośnięte[6].\n" +
//                "\n" +
//                "Trzon\n" +
//                "Osiąga długość od 3 do 9 cm i grubość do 3 cm. Jest cylindryczny, pełny. Powierzchnia najpierw z podłużnymi włóknami, później gładka, żółta albo żółtozielonkawa[7].\n" +
//                "\n" +
//                "Miąższ\n" +
//                "Twardy, kruchy, biały, po przekrojeniu nie zmienia zabarwienia. Smak słodkawoorzechowy, pachnie jak świeżo zmielona mąka[7].\n" +
//                "\n" +
//                "Wysyp zarodników\n" +
//                "Biały. Zarodniki o średnicy 6-8 × 3,5-5 µm, jajowate, gładkie, bezbarwne[5].\n" +
//                "\n" +
//                "Występowanie i siedlisko\n" +
//                "Gąska zielonka rozprzestrzeniona jest szeroko w Ameryce Północnej i Europie, ale podana też została z niektórych miejsc w Azji (Japonia), Ameryce Środkowej (Kostaryka) i Afryki[8]. W Polsce gatunek rzadki. Znajduje się na Czerwonej liście roślin i grzybów Polski. Ma status I – gatunek o nieokreślonym zagrożeniu[9]. Znajduje się na listach gatunków zagrożonych także w Niemczech, Holandii, Słowacji[3]. W krajach, gdzie jest gatunkiem zagrożonym – zabroniony jest zbiór tego gatunku[6].\n" +
//                "\n" +
//                "Rośnie od października do grudnia, w borach sosnowych na piaszczystej glebie z dużą ilością porostów, prawie zawsze gromadnie, czasami razem z gąską niekształtną (Tricholoma portentosum). Prawie cały rozwój owocnika przebiega pod ziemią, z mchu i igliwia wystaje zwykle tylko część kapelusza, dlatego też trudno ją znaleźć; miejscami jest częsta[5].\n" +
//                "\n" +
//                "Znaczenie\n" +
//                "Grzyb mikoryzowy[3]. Dawniej uważany za smaczny grzyb jadalny, jednak obecnie nie poleca się jego zbioru[10], w wielu krajach (np. Francja i Niemcy) uznany za toksyczny i niebezpieczny. We Francji w latach 2001–2003 odnotowano liczne przypadki zatruć, z tego kilka śmiertelnych[5][11]. W kraju tym zaczęło dochodzić do coraz częstszych przypadków zatruć po spożyciu gąski zielonej, najprawdopodobniej z powodu skażenia środowiska. Na obszarach o środowisku skażonym zaleca się spożywanie tego gatunku w ograniczonych ilościach[6]. W roku 2009 udokumentowano zatrucie zielonkami w Polsce u trzech osób, z tego jedno śmiertelne. O podstawowy mechanizm zatrucia podejrzewa się rabdomiolizę, która uszkadza błony komórkowe mięśni szkieletowych. W rezultacie tego białko mioglobina przenoszące tlen do mięśni jest uwalniane i pojawia się w moczu, co prowadzi do objawów takich jak ból mięśni i brązowawe zabarwienie moczu[11].\n" +
//                "\n" +
//                "Mimo wszystkich kontrowersji z nią związanych, zgodnie z rozporządzeniem z dnia 12 czerwca 2018 r. jest grzybem dopuszczonym do obrotu handlowego na terenie Polski[12].\n" +
//                "\n" +
//                "Przeprowadzony przez polskich naukowców krytyczny przegląd badań klinicznych i eksperymentalnych wskazujących na rzekomą toksyczność gąski zielonki podkreśla jednak stanowczo, iż gatunek ten nie stanowi większego zagrożenia dla zdrowia aniżeli gatunki grzybów bezsprzecznie uznawane za jadalne, a opisy przypadków zatruć i badań w modelu doświadczalnym cechuje szereg ograniczeń interpretacyjnych[13].").imageURL("https://upload.wikimedia.org/wikipedia/commons/7/75/Craterellus_cornucopioides_a1.JPG").build();
//        this.grzybService.saveGrzyb(test7);
//        Grzyb test8=Grzyb.builder().identifier(UUID.randomUUID()).name("Lejkówka zielonawa").description("Gąska zielonka (Tricholoma equestre (L.) P. Kumm.) – gatunek grzybów należący do rodziny gąskowatych (Tricholomataceae)[1].\n" +
//                "\n" +
//                "Systematyka i nazewnictwo\n" +
//                "Pozycja w klasyfikacji według Index Fungorum: Tricholoma, Tricholomataceae, Agaricales, Agaricomycetidae, Agaricomycetes, Agaricomycotina, Basidiomycota, Fungi[1].\n" +
//                "\n" +
//                "Po raz pierwszy takson ten zdiagnozowany został w 1753 r. przez K. Linneusza, który nadał mu nazwę Agaricus equestre. Obecną, uznaną przez Index Fungorum nazwę nadał mu P. Kumm. w 1871 r[1].\n" +
//                "\n" +
//                "Ma ok. 20 synonimów. Niektóre z nich[2]:\n" +
//                "Agaricus auratus Paulet 1793\n" +
//                "Agaricus equestris L. 1753\n" +
//                "Agaricus flavovirens Pers. 1793\n" +
//                "Gyrophila equestris (L.) Quél. 1886\n" +
//                "Gyrophila equestris var. aurata (Paulet) Quél. 1886\n" +
//                "Melanoleuca equestris (L.) Murrill 1914\n" +
//                "Tricholoma auratum (Paulet) Gillet 1874\n" +
//                "Tricholoma flavovirens (Pers.) S. Lundell 1942\n" +
//                "Nazwę polską nadał Józef Jundziłł w 1830 r. W polskim piśmiennictwie mykologicznym ma też inne nazwy: bedłka zielonka, gąska żółta[3] i prośnianka[4].\n" +
//                "\n" +
//                "Morfologia\n" +
//                "Kapelusz\n" +
//                "Średnicy 4–10 cm, żółtozielony lub żółtobrązowy, pośrodku ciemniejszy, gładki, w młodym owocniku stożkowato wypukły, później płaski, często różnie powyginany. Skorka naga lub drobnołuskowata, mazista i dlatego często z ziarnami piasku, podczas wilgoci śliska[5].\n" +
//                "\n" +
//                "Blaszki\n" +
//                "Od bladożółtawych do siarkowożółtych, średnio gęste, cienkie, wycięte z ząbkiem, ale u nasady szeroko przyrośnięte[6].\n" +
//                "\n" +
//                "Trzon\n" +
//                "Osiąga długość od 3 do 9 cm i grubość do 3 cm. Jest cylindryczny, pełny. Powierzchnia najpierw z podłużnymi włóknami, później gładka, żółta albo żółtozielonkawa[7].\n" +
//                "\n" +
//                "Miąższ\n" +
//                "Twardy, kruchy, biały, po przekrojeniu nie zmienia zabarwienia. Smak słodkawoorzechowy, pachnie jak świeżo zmielona mąka[7].\n" +
//                "\n" +
//                "Wysyp zarodników\n" +
//                "Biały. Zarodniki o średnicy 6-8 × 3,5-5 µm, jajowate, gładkie, bezbarwne[5].\n" +
//                "\n" +
//                "Występowanie i siedlisko\n" +
//                "Gąska zielonka rozprzestrzeniona jest szeroko w Ameryce Północnej i Europie, ale podana też została z niektórych miejsc w Azji (Japonia), Ameryce Środkowej (Kostaryka) i Afryki[8]. W Polsce gatunek rzadki. Znajduje się na Czerwonej liście roślin i grzybów Polski. Ma status I – gatunek o nieokreślonym zagrożeniu[9]. Znajduje się na listach gatunków zagrożonych także w Niemczech, Holandii, Słowacji[3]. W krajach, gdzie jest gatunkiem zagrożonym – zabroniony jest zbiór tego gatunku[6].\n" +
//                "\n" +
//                "Rośnie od października do grudnia, w borach sosnowych na piaszczystej glebie z dużą ilością porostów, prawie zawsze gromadnie, czasami razem z gąską niekształtną (Tricholoma portentosum). Prawie cały rozwój owocnika przebiega pod ziemią, z mchu i igliwia wystaje zwykle tylko część kapelusza, dlatego też trudno ją znaleźć; miejscami jest częsta[5].\n" +
//                "\n" +
//                "Znaczenie\n" +
//                "Grzyb mikoryzowy[3]. Dawniej uważany za smaczny grzyb jadalny, jednak obecnie nie poleca się jego zbioru[10], w wielu krajach (np. Francja i Niemcy) uznany za toksyczny i niebezpieczny. We Francji w latach 2001–2003 odnotowano liczne przypadki zatruć, z tego kilka śmiertelnych[5][11]. W kraju tym zaczęło dochodzić do coraz częstszych przypadków zatruć po spożyciu gąski zielonej, najprawdopodobniej z powodu skażenia środowiska. Na obszarach o środowisku skażonym zaleca się spożywanie tego gatunku w ograniczonych ilościach[6]. W roku 2009 udokumentowano zatrucie zielonkami w Polsce u trzech osób, z tego jedno śmiertelne. O podstawowy mechanizm zatrucia podejrzewa się rabdomiolizę, która uszkadza błony komórkowe mięśni szkieletowych. W rezultacie tego białko mioglobina przenoszące tlen do mięśni jest uwalniane i pojawia się w moczu, co prowadzi do objawów takich jak ból mięśni i brązowawe zabarwienie moczu[11].\n" +
//                "\n" +
//                "Mimo wszystkich kontrowersji z nią związanych, zgodnie z rozporządzeniem z dnia 12 czerwca 2018 r. jest grzybem dopuszczonym do obrotu handlowego na terenie Polski[12].\n" +
//                "\n" +
//                "Przeprowadzony przez polskich naukowców krytyczny przegląd badań klinicznych i eksperymentalnych wskazujących na rzekomą toksyczność gąski zielonki podkreśla jednak stanowczo, iż gatunek ten nie stanowi większego zagrożenia dla zdrowia aniżeli gatunki grzybów bezsprzecznie uznawane za jadalne, a opisy przypadków zatruć i badań w modelu doświadczalnym cechuje szereg ograniczeń interpretacyjnych[13].").imageURL("https://upload.wikimedia.org/wikipedia/commons/b/b8/Clitocybe_odora_G2.jpg").build();
//        this.grzybService.saveGrzyb(test8);
//        Grzyb test9=Grzyb.builder().identifier(UUID.randomUUID()).name("Łuskwiak zmienny").description("Gąska zielonka (Tricholoma equestre (L.) P. Kumm.) – gatunek grzybów należący do rodziny gąskowatych (Tricholomataceae)[1].\n" +
//                "\n" +
//                "Systematyka i nazewnictwo\n" +
//                "Pozycja w klasyfikacji według Index Fungorum: Tricholoma, Tricholomataceae, Agaricales, Agaricomycetidae, Agaricomycetes, Agaricomycotina, Basidiomycota, Fungi[1].\n" +
//                "\n" +
//                "Po raz pierwszy takson ten zdiagnozowany został w 1753 r. przez K. Linneusza, który nadał mu nazwę Agaricus equestre. Obecną, uznaną przez Index Fungorum nazwę nadał mu P. Kumm. w 1871 r[1].\n" +
//                "\n" +
//                "Ma ok. 20 synonimów. Niektóre z nich[2]:\n" +
//                "Agaricus auratus Paulet 1793\n" +
//                "Agaricus equestris L. 1753\n" +
//                "Agaricus flavovirens Pers. 1793\n" +
//                "Gyrophila equestris (L.) Quél. 1886\n" +
//                "Gyrophila equestris var. aurata (Paulet) Quél. 1886\n" +
//                "Melanoleuca equestris (L.) Murrill 1914\n" +
//                "Tricholoma auratum (Paulet) Gillet 1874\n" +
//                "Tricholoma flavovirens (Pers.) S. Lundell 1942\n" +
//                "Nazwę polską nadał Józef Jundziłł w 1830 r. W polskim piśmiennictwie mykologicznym ma też inne nazwy: bedłka zielonka, gąska żółta[3] i prośnianka[4].\n" +
//                "\n" +
//                "Morfologia\n" +
//                "Kapelusz\n" +
//                "Średnicy 4–10 cm, żółtozielony lub żółtobrązowy, pośrodku ciemniejszy, gładki, w młodym owocniku stożkowato wypukły, później płaski, często różnie powyginany. Skorka naga lub drobnołuskowata, mazista i dlatego często z ziarnami piasku, podczas wilgoci śliska[5].\n" +
//                "\n" +
//                "Blaszki\n" +
//                "Od bladożółtawych do siarkowożółtych, średnio gęste, cienkie, wycięte z ząbkiem, ale u nasady szeroko przyrośnięte[6].\n" +
//                "\n" +
//                "Trzon\n" +
//                "Osiąga długość od 3 do 9 cm i grubość do 3 cm. Jest cylindryczny, pełny. Powierzchnia najpierw z podłużnymi włóknami, później gładka, żółta albo żółtozielonkawa[7].\n" +
//                "\n" +
//                "Miąższ\n" +
//                "Twardy, kruchy, biały, po przekrojeniu nie zmienia zabarwienia. Smak słodkawoorzechowy, pachnie jak świeżo zmielona mąka[7].\n" +
//                "\n" +
//                "Wysyp zarodników\n" +
//                "Biały. Zarodniki o średnicy 6-8 × 3,5-5 µm, jajowate, gładkie, bezbarwne[5].\n" +
//                "\n" +
//                "Występowanie i siedlisko\n" +
//                "Gąska zielonka rozprzestrzeniona jest szeroko w Ameryce Północnej i Europie, ale podana też została z niektórych miejsc w Azji (Japonia), Ameryce Środkowej (Kostaryka) i Afryki[8]. W Polsce gatunek rzadki. Znajduje się na Czerwonej liście roślin i grzybów Polski. Ma status I – gatunek o nieokreślonym zagrożeniu[9]. Znajduje się na listach gatunków zagrożonych także w Niemczech, Holandii, Słowacji[3]. W krajach, gdzie jest gatunkiem zagrożonym – zabroniony jest zbiór tego gatunku[6].\n" +
//                "\n" +
//                "Rośnie od października do grudnia, w borach sosnowych na piaszczystej glebie z dużą ilością porostów, prawie zawsze gromadnie, czasami razem z gąską niekształtną (Tricholoma portentosum). Prawie cały rozwój owocnika przebiega pod ziemią, z mchu i igliwia wystaje zwykle tylko część kapelusza, dlatego też trudno ją znaleźć; miejscami jest częsta[5].\n" +
//                "\n" +
//                "Znaczenie\n" +
//                "Grzyb mikoryzowy[3]. Dawniej uważany za smaczny grzyb jadalny, jednak obecnie nie poleca się jego zbioru[10], w wielu krajach (np. Francja i Niemcy) uznany za toksyczny i niebezpieczny. We Francji w latach 2001–2003 odnotowano liczne przypadki zatruć, z tego kilka śmiertelnych[5][11]. W kraju tym zaczęło dochodzić do coraz częstszych przypadków zatruć po spożyciu gąski zielonej, najprawdopodobniej z powodu skażenia środowiska. Na obszarach o środowisku skażonym zaleca się spożywanie tego gatunku w ograniczonych ilościach[6]. W roku 2009 udokumentowano zatrucie zielonkami w Polsce u trzech osób, z tego jedno śmiertelne. O podstawowy mechanizm zatrucia podejrzewa się rabdomiolizę, która uszkadza błony komórkowe mięśni szkieletowych. W rezultacie tego białko mioglobina przenoszące tlen do mięśni jest uwalniane i pojawia się w moczu, co prowadzi do objawów takich jak ból mięśni i brązowawe zabarwienie moczu[11].\n" +
//                "\n" +
//                "Mimo wszystkich kontrowersji z nią związanych, zgodnie z rozporządzeniem z dnia 12 czerwca 2018 r. jest grzybem dopuszczonym do obrotu handlowego na terenie Polski[12].\n" +
//                "\n" +
//                "Przeprowadzony przez polskich naukowców krytyczny przegląd badań klinicznych i eksperymentalnych wskazujących na rzekomą toksyczność gąski zielonki podkreśla jednak stanowczo, iż gatunek ten nie stanowi większego zagrożenia dla zdrowia aniżeli gatunki grzybów bezsprzecznie uznawane za jadalne, a opisy przypadków zatruć i badań w modelu doświadczalnym cechuje szereg ograniczeń interpretacyjnych[13].").imageURL("https://upload.wikimedia.org/wikipedia/commons/b/b2/Kuehneromyces_mutabilis_a2_%282%29.jpg").build();
//        this.grzybService.saveGrzyb(test9);
//        Grzyb test10=Grzyb.builder().identifier(UUID.randomUUID()).name("Maślak pstry").description("Gąska zielonka (Tricholoma equestre (L.) P. Kumm.) – gatunek grzybów należący do rodziny gąskowatych (Tricholomataceae)[1].\n" +
//                "\n" +
//                "Systematyka i nazewnictwo\n" +
//                "Pozycja w klasyfikacji według Index Fungorum: Tricholoma, Tricholomataceae, Agaricales, Agaricomycetidae, Agaricomycetes, Agaricomycotina, Basidiomycota, Fungi[1].\n" +
//                "\n" +
//                "Po raz pierwszy takson ten zdiagnozowany został w 1753 r. przez K. Linneusza, który nadał mu nazwę Agaricus equestre. Obecną, uznaną przez Index Fungorum nazwę nadał mu P. Kumm. w 1871 r[1].\n" +
//                "\n" +
//                "Ma ok. 20 synonimów. Niektóre z nich[2]:\n" +
//                "Agaricus auratus Paulet 1793\n" +
//                "Agaricus equestris L. 1753\n" +
//                "Agaricus flavovirens Pers. 1793\n" +
//                "Gyrophila equestris (L.) Quél. 1886\n" +
//                "Gyrophila equestris var. aurata (Paulet) Quél. 1886\n" +
//                "Melanoleuca equestris (L.) Murrill 1914\n" +
//                "Tricholoma auratum (Paulet) Gillet 1874\n" +
//                "Tricholoma flavovirens (Pers.) S. Lundell 1942\n" +
//                "Nazwę polską nadał Józef Jundziłł w 1830 r. W polskim piśmiennictwie mykologicznym ma też inne nazwy: bedłka zielonka, gąska żółta[3] i prośnianka[4].\n" +
//                "\n" +
//                "Morfologia\n" +
//                "Kapelusz\n" +
//                "Średnicy 4–10 cm, żółtozielony lub żółtobrązowy, pośrodku ciemniejszy, gładki, w młodym owocniku stożkowato wypukły, później płaski, często różnie powyginany. Skorka naga lub drobnołuskowata, mazista i dlatego często z ziarnami piasku, podczas wilgoci śliska[5].\n" +
//                "\n" +
//                "Blaszki\n" +
//                "Od bladożółtawych do siarkowożółtych, średnio gęste, cienkie, wycięte z ząbkiem, ale u nasady szeroko przyrośnięte[6].\n" +
//                "\n" +
//                "Trzon\n" +
//                "Osiąga długość od 3 do 9 cm i grubość do 3 cm. Jest cylindryczny, pełny. Powierzchnia najpierw z podłużnymi włóknami, później gładka, żółta albo żółtozielonkawa[7].\n" +
//                "\n" +
//                "Miąższ\n" +
//                "Twardy, kruchy, biały, po przekrojeniu nie zmienia zabarwienia. Smak słodkawoorzechowy, pachnie jak świeżo zmielona mąka[7].\n" +
//                "\n" +
//                "Wysyp zarodników\n" +
//                "Biały. Zarodniki o średnicy 6-8 × 3,5-5 µm, jajowate, gładkie, bezbarwne[5].\n" +
//                "\n" +
//                "Występowanie i siedlisko\n" +
//                "Gąska zielonka rozprzestrzeniona jest szeroko w Ameryce Północnej i Europie, ale podana też została z niektórych miejsc w Azji (Japonia), Ameryce Środkowej (Kostaryka) i Afryki[8]. W Polsce gatunek rzadki. Znajduje się na Czerwonej liście roślin i grzybów Polski. Ma status I – gatunek o nieokreślonym zagrożeniu[9]. Znajduje się na listach gatunków zagrożonych także w Niemczech, Holandii, Słowacji[3]. W krajach, gdzie jest gatunkiem zagrożonym – zabroniony jest zbiór tego gatunku[6].\n" +
//                "\n" +
//                "Rośnie od października do grudnia, w borach sosnowych na piaszczystej glebie z dużą ilością porostów, prawie zawsze gromadnie, czasami razem z gąską niekształtną (Tricholoma portentosum). Prawie cały rozwój owocnika przebiega pod ziemią, z mchu i igliwia wystaje zwykle tylko część kapelusza, dlatego też trudno ją znaleźć; miejscami jest częsta[5].\n" +
//                "\n" +
//                "Znaczenie\n" +
//                "Grzyb mikoryzowy[3]. Dawniej uważany za smaczny grzyb jadalny, jednak obecnie nie poleca się jego zbioru[10], w wielu krajach (np. Francja i Niemcy) uznany za toksyczny i niebezpieczny. We Francji w latach 2001–2003 odnotowano liczne przypadki zatruć, z tego kilka śmiertelnych[5][11]. W kraju tym zaczęło dochodzić do coraz częstszych przypadków zatruć po spożyciu gąski zielonej, najprawdopodobniej z powodu skażenia środowiska. Na obszarach o środowisku skażonym zaleca się spożywanie tego gatunku w ograniczonych ilościach[6]. W roku 2009 udokumentowano zatrucie zielonkami w Polsce u trzech osób, z tego jedno śmiertelne. O podstawowy mechanizm zatrucia podejrzewa się rabdomiolizę, która uszkadza błony komórkowe mięśni szkieletowych. W rezultacie tego białko mioglobina przenoszące tlen do mięśni jest uwalniane i pojawia się w moczu, co prowadzi do objawów takich jak ból mięśni i brązowawe zabarwienie moczu[11].\n" +
//                "\n" +
//                "Mimo wszystkich kontrowersji z nią związanych, zgodnie z rozporządzeniem z dnia 12 czerwca 2018 r. jest grzybem dopuszczonym do obrotu handlowego na terenie Polski[12].\n" +
//                "\n" +
//                "Przeprowadzony przez polskich naukowców krytyczny przegląd badań klinicznych i eksperymentalnych wskazujących na rzekomą toksyczność gąski zielonki podkreśla jednak stanowczo, iż gatunek ten nie stanowi większego zagrożenia dla zdrowia aniżeli gatunki grzybów bezsprzecznie uznawane za jadalne, a opisy przypadków zatruć i badań w modelu doświadczalnym cechuje szereg ograniczeń interpretacyjnych[13].").imageURL("https://upload.wikimedia.org/wikipedia/commons/f/f6/Suillus_variegatus_G28.jpg").build();
//        this.grzybService.saveGrzyb(test10);
//    }
//}
