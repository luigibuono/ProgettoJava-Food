# ProgettoJava-Food

#CorrezionePost-feedback

Per aprire il file jar 
terminale node digitare java -jar "percorso file jar"
si visualizzerà il menu senza errori 


Aggiungere a Main.java

        service.FetchDataFromFile(prodotti, "src/main/java/org/gs/files/prodotti.csv");
        service.FetchDataFromFile(utenti, "src/main/java/org/gs/files/utenti.csv");
        service.FetchDataFromFile(vendite, "src/main/java/org/gs/files/vendite.csv");

        Per l'uso su vscode 



<h1> Ho realizzato questo progetto per il corso Start2Impact Java Basics </h1>

Mi sono aiutato con i consigli trovati nel progetto 'Risorse utili'. <br>
Per il funzionamento dell'app bisogna installare  Apache Maven (https://maven.apache.org/download.cgi) apache-maven-3.9.3-bin.zip <br>
Come editor di testo Eclipse IDE o Visual Studio Code . <br>

<hr>

Cartella principale src/main/java <br>
Dove si trovano tutti i file : org/gs <br>
-files- In questa cartella ho salvato le tabelle messe a disposizione dalla traccia :  utenti.csv, prodotti.csv e vendite.csv, <br>
-model- Tramite i metodi get e set leggo e assegno i valori dei files (get restituisco il valore ) (set imposto il nuovo valore) <br>
-service- importo i modelli, creo un servizio che può essere utilizzato da tutte le classi in questo caso da controller per la visualizzazione delle liste compilate e non. <br>
-controller- importo i modelli , creo il menu dei comandi e tramite uno switch assegno i casi possibili(i comandi da 0 a 5), e per ogni comando  <br>
assegno un metodo sempre con una condizione if(; < 0 || ; > ;.size()) per verificare che l'utente inserisca i comandi corretti. <br>
-main- collego i files utenti.csv, prodotti.csv e vendite.csv e gli array list per le liste <br>

<hr>


<h1> Come far funzionare l'applicazione</h1> <br>
Nel terminale digitare : mvn compile      => per la compilazione del codice <br>
Nel terminale digitare : mvn package      => creazione del pacchetto  <br>
Si genererà la cartella target  <br>
Nel terminale digitare : java -jar target/application.jar    => creazione file jar <br>

*per un uso più rapido è disponibile il pulsante run nel Main.java* <br>




