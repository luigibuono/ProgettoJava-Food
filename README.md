# ProgettoJava-Food

<h1> Ho realizzato questo progetto per il corso Start2Impact Java Basics </h1>

Mi sono aiutato con i consigli trovati nel progetto 'Risorse utili'.
Per il funzionamento dell'app bisogna installare  Apache Maven (https://maven.apache.org/download.cgi) apache-maven-3.9.3-bin.zip
Come editor di testo Eclipse IDE o Visual Studio Code .



Cartella principale src/main/java 
Dove si trovano tutti i file : org/gs
-files- In questa cartella ho salvato le tabelle messe a disposizione dalla traccia :  utenti.csv, prodotti.csv e vendite.csv,
-model- Tramite i metodi get e set leggo e assegno i valori dei files (get restituisco il valore ) (set imposto il nuovo valore)
-service- importo i modelli, creo un servizio che può essere utilizzato da tutte le classi in questo caso da controller per la visualizzazione delle liste compilate e non.
-controller- importo i modelli , creo il menu dei comandi e tramite uno switch assegno i casi possibili(i comandi da 0 a 5), e per ogni comando 
assegno un metodo sempre con una condizione if(; < 0 || ; > ;.size()) per verificare che l'utente inserisca i comandi corretti.
-main- collego i files utenti.csv, prodotti.csv e vendite.csv e gli array list per le liste 


<h1> Come far funzionare l'applicazione</h1>
Nel terminale digitare : mvn compile      => per la compilazione del codice
Nel terminale digitare : mvn package      => creazione del pacchetto 
Si genererà la cartella target 
Nel terminale digitare : java -jar target/application.jar    => creazione file jar

*per un uso più rapido è disponibile il pulsante run nel Main.java*




