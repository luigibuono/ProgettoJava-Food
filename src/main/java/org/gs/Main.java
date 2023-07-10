
package org.gs;


import java.util.ArrayList;

import org.gs.controller.management;
import org.gs.model.Prodotti;
import org.gs.model.Utenti;
import org.gs.model.Vendite;
import org.gs.service.Service;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {


        Service service = new Service();
        management management = new management();


        ArrayList<ArrayList<String>> prodotti = new ArrayList<>();
        ArrayList<ArrayList<String>> utenti = new ArrayList<>();
        ArrayList<ArrayList<String>> vendite = new ArrayList<>();




        Service.FetchData(prodotti, "src/main/java/org/gs/files/prodotti.csv");
        Service.FetchData(utenti, "src/main/java/org/gs/files/utenti.csv");
        Service.FetchData(vendite, "src/main/java/org/gs/files/vendite.csv");

            
        ArrayList<Prodotti> listaProdotti = new ArrayList<>();
        ArrayList<Utenti> listaUtenti = new ArrayList<>();
        ArrayList<Vendite> listaVendite = new ArrayList<>();

        
        Service.ListaProdotti(prodotti, listaProdotti);
        Service.ListaUtenti(utenti, listaUtenti);
        Service.ListaVendite(vendite, listaVendite);

       

        org.gs.controller.management.comandMenu(listaProdotti, listaUtenti, listaVendite);
        
    }
}