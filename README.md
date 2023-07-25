# ProgettoJava-Food

<h1> Ho realizzato questo progetto per il corso Start2Impact Java Basics </h1>
<br><br>
<h2>Il funzionamento dell'app è disponibile a fine pagina </h2>

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


<h1> Come far funzionare l'applicazione</h1> <br> <h2>POST FEEDBACK</h2>
<ol>
  <li> clonare progetto con gitdesktop: https://github.com/luigibuono/ProgettoJava-Food</li>
  <li> aprire terminale node e digitare mvn compile </li>
  <li> mvn package </li>
  <li> java -jar target/application </li>

  Nel caso dovesse dare qualche errore o non visualizzare prodotti provare così:
  <ul>
    <li>Aprire cartella progetto</li>
    <li> dalla cartella click del mouse apri terminale</li>
    <li> dal terminale java -jar "C:\Users\user\Desktop\Progetti S2I\ProgettoJava food\File jar e PDF\application.jar"</li>
    *attenzione questo percorso è il mio percorso del file jar,il vostro è stato inviato nella cartella zippata con pdf
  </ul>
</ol>
*per un uso più rapido è disponibile il pulsante run nel Main.java* <br>

https://github.com/luigibuono/ProgettoJava-Food/issues/2#issue-1819840203




