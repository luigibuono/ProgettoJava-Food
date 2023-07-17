package org.gs.controller;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.locks.LockSupport;
import java.awt.Desktop;


import org.gs.model.Prodotti;
import org.gs.model.Utenti;
import org.gs.model.Vendite;
import org.gs.service.Service;

public class Management {

  public Management() {}

  public static void Comandi (ArrayList<Prodotti> listaProdotti, ArrayList<Utenti> listaUtenti, ArrayList<Vendite> listaVendite) {
  Service service = new Service();
  Scanner scanner = new Scanner (System.in);

  boolean loop = true;

  while(loop == true) {
    System.out.println("Inserisci Comando");
    System.out.println("comando 1: Visualizza tutti i prodotti");
    System.out.println("comando 2 : Compra un prodotto esistente");
    System.out.println("comando 3: Restituisci un prodotto");
    System.out.println("comando 4: Aggiungi un nuovo utente");
    System.out.println("comando 5 : Esporta file ");
    System.out.println("comando 0 : esci dal programma");

    String comando = scanner.nextLine();


    switch(comando){
      case "1":
      service.getListaProdotti(listaProdotti);
      break;

      case "2":
      CompraProdotto(listaProdotti,listaUtenti,listaVendite);
      break;

      case "3":
      RestituisciProdotto(listaProdotti,listaVendite);
      break;

      case "4":
      addUser(listaUtenti);
      break;

      case "5":
      EsportaFile(listaProdotti);
      break;

      case "0":
      System.out.println("Sei uscito correttamente");
      loop= false;
      break;

      default:
      System.out.println("Impossibile eseguire questa operazione selezionare uno dei comandi");
    }
  };
}


    
    public static void CompraProdotto(ArrayList<Prodotti> listaProdotti, ArrayList<Utenti> listaUtenti, ArrayList<Vendite> listaVendite){

        Service service = new Service();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il tuo id");
        int idUtente = scanner.nextInt();
        scanner.nextLine();
        if(idUtente < 0 || idUtente > listaUtenti.size()){ // check if the id entered is present in the data
            System.out.println("ID Utente non esistente!");
        }else{
            System.out.println("Inserisci l' id del prodotto che vuoi acquistare");
            int idProdotto = scanner.nextInt();
            scanner.nextLine();

            if(idProdotto < 0 || idProdotto > listaProdotti.size()){ // check if the product id entered is present in the data
                System.out.println("ID Prodotto non esistente!");
            }else{
                
                if (listaProdotti.get(idProdotto - 1).getDisponibile().equals("SI")){
                    listaProdotti.get(idProdotto - 1).setDisponibile("NO");

                    Vendite vendita = new Vendite(listaVendite.size() + 1, idProdotto, idUtente); 
                    listaVendite.add(vendita);
                    

                    System.out.println("Prodotto: " + listaProdotti.get(idProdotto - 1).getNome() + " acquistato corretamente.");

                }else{
                    System.out.println("Il prodotto non è disponibile");
                }
            }
        }
        

        

        
        
    }


    public static void RestituisciProdotto(ArrayList<Prodotti> listaProdotti, ArrayList<Vendite> listaVendite){

        Scanner scanner = new Scanner(System.in);
        Service service = new Service();

        System.out.println("Inserisci l' id del tuo acquisto"); 
        int idVendita = scanner.nextInt();
        scanner.nextLine();

        if(idVendita < 0 || idVendita > listaVendite.size()){ // check if the entered sales id is present in the data
            System.out.println("ID Acquisto non esistente!");
        }else{

            int idProdotto= listaVendite.get(idVendita-1).getIdProdotto();

            if (listaProdotti.get(idProdotto - 1).getDisponibile().equals("NO")){
                listaProdotti.get(idProdotto - 1).setDisponibile("SI");
            }
            
            listaVendite.remove(idVendita - 1); 

            System.out.println("Prodotto restituito correttamente.");

          

        }

        
    }


    public static void addUser(ArrayList<Utenti> listaUtenti){

        Scanner scanner = new Scanner(System.in);
        Service service = new Service();

        int id = listaUtenti.size() + 1;
        System.out.println("L' id di questo utente sarà: " + id);

        System.out.println("Inserisci il nome");
        String nome = scanner.nextLine();

        System.out.println("Inserisci il cognome");
        String cognome = scanner.nextLine();

        System.out.println("Inserisci la data di nascita");
        String dataDiNascita = scanner.nextLine();

        System.out.println("Inserisci l' indirizzo");
        String indirizzo = scanner.nextLine();

        System.out.println("Inserisci il documento ID");
        String documentoId = scanner.nextLine();

        Utenti utente = new Utenti(id, nome, cognome, dataDiNascita, indirizzo, documentoId);

        listaUtenti.add(utente);

        System.out.println("Utente inserito corretamente.");

     

    }

   
    public static void EsportaFile(ArrayList<Prodotti> listaProdotti){

        
        ArrayList<Prodotti> listaProdottiDisponibili = new ArrayList<>(); 

        for(int i = 0; i < listaProdotti.size(); i++ ){
            if (listaProdotti.get(i).getDisponibile().equals("SI")){
                listaProdottiDisponibili.add(listaProdotti.get(i));
            }
        }

        try {

            
            FileWriter writer = new FileWriter("prodottiDisponibili.csv");

            writer.write("Id;Nome;Data Inserimento;Prezzo;Marca;Disponibile\n");

            for(int i = 0; i < listaProdottiDisponibili.size(); i++ ){
                    writer.write(
                        listaProdottiDisponibili.get(i).getId() + ";" +
                        listaProdottiDisponibili.get(i).getNome() + ";" +
                        listaProdottiDisponibili.get(i).getDataInserimento() + ";" +
                        listaProdottiDisponibili.get(i).getPrezzo() + ";" +
                        listaProdottiDisponibili.get(i).getMarca() + ";" +
                        listaProdottiDisponibili.get(i).getDisponibile() + "\n" 
                    );
            }
            
            writer.close();

           
            File file = new File("prodottiDisponibili.csv");
            //check if Desktop is supported by Platform or not
            if(!Desktop.isDesktopSupported()){
                System.out.println("Desktop is not supported");
            }
            
            Desktop desktop = Desktop.getDesktop();
            if(file.exists()) desktop.open(file);


        } catch (IOException e) {
            e.printStackTrace();
        }



  } 
}