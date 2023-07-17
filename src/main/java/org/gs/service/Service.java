package org.gs.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.sound.sampled.SourceDataLine;

import org.gs.model.Prodotti;
import org.gs.model.Utenti;
import org.gs.model.Vendite;


public class Service {

    public Service(){}

   
    public static void FetchDataFromFile(ArrayList arraylist, String filePath){

        try {

            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            String line = reader.readLine();
            line = reader.readLine(); //skip the first line

            while (line != null) {
               
                String[] parts = line.split(";");

                ArrayList<String> row = new ArrayList<>();
                for(String part : parts){
                    row.add(part);
                }

                arraylist.add(row);
                
        
              
                line = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

 
    public static void printArraylistOfArraylist(ArrayList<ArrayList<String>> arraylist){
        for(int i = 0; i < arraylist.size(); i++){
            System.out.println();

            for(int j=0; j < arraylist.get(i).size(); j++ ){
                System.out.print(arraylist.get(i).get(j) + " ");
            }
        }
    }

    
    public static void copyInListaProdotti(ArrayList<ArrayList<String>> prodotti, ArrayList<Prodotti> listaProdotti){

        for(int i = 0; i < prodotti.size(); i++){

            ArrayList<String> parts = new ArrayList<>();

            for(int j=0; j < prodotti.get(i).size(); j++ ){
                parts.add(prodotti.get(i).get(j));
            }

            Prodotti prodotto = new Prodotti( 
                Integer.parseInt(parts.get(0)), 
                parts.get(1), 
                parts.get(2), 
                Float.parseFloat(parts.get(3).substring(0, parts.get(3).length() -3).replace("," , ".")), 
                parts.get(4), 
                parts.get(5)
            );

            listaProdotti.add(prodotto);
        }
    }

    public static void getListaProdotti(ArrayList<Prodotti> listaProdotti){
        System.out.println();
        System.out.println("Id Nome Data inserimento Prezzo Marca Disponibile");
        for(int i = 0; i < listaProdotti.size(); i++){
            System.out.println(
                listaProdotti.get(i).getId() + " " + 
                listaProdotti.get(i).getNome() + " " + 
                listaProdotti.get(i).getDataInserimento() + " " + 
                listaProdotti.get(i).getPrezzo() + " " + 
                listaProdotti.get(i).getMarca() + " " + 
                listaProdotti.get(i).getDisponibile() + " "
            );
        }
        System.out.println();
    }

    
    public static void copyInListaUtenti(ArrayList<ArrayList<String>> utenti, ArrayList<Utenti> listaUtenti){

        for(int i = 0; i < utenti.size(); i++){

            ArrayList<String> parts = new ArrayList<>();

            for(int j=0; j < utenti.get(i).size(); j++ ){
                parts.add(utenti.get(i).get(j));
            } 

            Utenti utente = new Utenti( 
                Integer.parseInt(parts.get(0)), 
                parts.get(1), 
                parts.get(2), 
                parts.get(3), 
                parts.get(4), 
                parts.get(5)
            );

            listaUtenti.add(utente);
        }
    }

    public static void getListaUtenti(ArrayList<Utenti> listaUtenti){
        for(int i = 0; i < listaUtenti.size(); i++){
            System.out.println(
                listaUtenti.get(i).getId() + " " + 
                listaUtenti.get(i).getNome() + " " + 
                listaUtenti.get(i).getCognome() + " " + 
                listaUtenti.get(i).getDataDiNascita() + " " + 
                listaUtenti.get(i).getIndirizzo() + " " + 
                listaUtenti.get(i).getDocumentoId() + " "
            );
        }
    }

   
    public static void copyInListaVendite(ArrayList<ArrayList<String>> vendite, ArrayList<Vendite> listaVendite){

        for(int i = 0; i < vendite.size(); i++){

            ArrayList<String> parts = new ArrayList<>();

            for(int j=0; j < vendite.get(i).size(); j++ ){
                parts.add(vendite.get(i).get(j));
            }

            Vendite vendita = new Vendite( 
                Integer.parseInt(parts.get(0)), 
                Integer.parseInt(parts.get(1)), 
                Integer.parseInt(parts.get(2))
            );

            listaVendite.add(vendita);
        }
    }

   
    public static void getListaVendite(ArrayList<Vendite> listaVendite){
        for(int i = 0; i < listaVendite.size(); i++){
            System.out.println(
                listaVendite.get(i).getId() + " " + 
                listaVendite.get(i).getIdProdotto() + " " + 
                listaVendite.get(i).getIdUtente() + " " 
            );
        }
    }
    
}