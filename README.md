#7

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
  <li> aprire terminale e digitare mvn compile </li>
  <li> mvn package </li>
  <li> ora aprire il terminale dalla cartella del progetto e digitare java jar + percorso file jar generato da mvn package</li>


</ol>
*per un uso più rapido è disponibile il pulsante run nel Main.java* <br>
<br>
<h1> SCREEN FUNZIONAMENTO</h1>

![Screenshot 2023-07-25 104200](https://github.com/luigibuono/ProgettoJava-Food/assets/128727133/3fa7f1b9-a743-4899-9234-82ba5f498c0a)
![Screenshot 2023-07-25 104216](https://github.com/luigibuono/ProgettoJava-Food/assets/128727133/c712d9a2-1b73-4705-953d-16f7a720e0dc)

