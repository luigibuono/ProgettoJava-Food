package org.gs.controller;



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.Desktop;

import org.gs.model.Prodotti;
import org.gs.model.Utenti;
import org.gs.model.Vendite;
import org.gs.service.Service;

public class management {
    
    public management(){}

    public static void comandMenu (ArrayList<Prodotti> listaProdotti, ArrayList<Utenti> listaUtenti, ArrayList<Vendite> listaVendite) {

       Scanner scanner = new Scanner(System.in);
            boolean loop = true;

            while(loop == true){

                System.out.println();
                System.out.println("Inserisci il numero del comando da eseguire:");
                System.out.println("1 Visualizzare tutti i prodotti all'interno del sistema");
                System.out.println("2 Comprare un prodotto esistente");
                System.out.println("3 Restituire un prodotto");
                System.out.println("4 Aggiungere un nuovo utente");
                System.out.println("5 Esportare un file con i prodotti disponibili");
                System.out.println("0 Uscire dal programma");

                String comando = scanner.nextLine();

                switch (comando) {
                    case "1":
                    Service.getListaProdotti(listaProdotti);
                    break;

                    case "2":
                    CompraProdotto(listaProdotti, listaUtenti , listaVendite);
                    break;

                    case "3":
                    RestituisciProdotto(listaProdotti, listaVendite);
                    break;

                    case "4":
                    AggiungiUtente(listaUtenti);
                    break;

                    case "5":
                    EsportaFile(listaProdotti);
                    break;

                    case "0":
                    System.out.println("L'utente ha abbandonato");
                    loop = false;
                    break;

                    default:
                    System.out.println("Devi selezionare uno dei comandi!");
                }

            }
        }  
    

     
    public static void CompraProdotto (ArrayList<Prodotti> listaProdotti, ArrayList<Utenti> listaUtenti, ArrayList<Vendite> listaVendite){

            Scanner scanner = new Scanner(System.in);


            System.out.println("Inserisci id");
            int idUtente = scanner.nextInt();
            scanner.nextLine();
            if(idUtente < 0 || idUtente > listaUtenti.size()){ 
                System.out.println("ID Utente non esiste");
            }else{
                System.out.println("Inserisci l'id del prodotto che vuoi acquistare");
                int idProdotto = scanner.nextInt();
                scanner.nextLine();

                if(idProdotto < 0 || idProdotto > listaProdotti.size()){ 
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
        

        

        
        
    

   
    public static void RestituisciProdotto (ArrayList<Prodotti> listaProdotti, ArrayList<Vendite> listaVendite){

        Scanner scanner = new Scanner(System.in);
            System.out.println("Inserisci l' id del tuo acquisto"); 
            int idVendita = scanner.nextInt();
            scanner.nextLine();

            if(idVendita < 0 || idVendita > listaVendite.size()){ 
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

        
    

    
    public static void AggiungiUtente(ArrayList<Utenti> listaUtenti){

        Scanner scanner = new Scanner(System.in);
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

            System.out.println("Inserisci il numero ID");
            String numeroId = scanner.nextLine();

            Utenti utente = new Utenti(id, nome, cognome, dataDiNascita, indirizzo, numeroId);

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
