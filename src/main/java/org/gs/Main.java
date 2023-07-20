package org.gs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.gs.controller.Management;
import org.gs.model.Prodotti;
import org.gs.model.Utenti;
import org.gs.model.Vendite;
import org.gs.service.Service;


public class Main {

    public static void main(String[] args) {

        Service service = new Service();
        Management management = new Management();

        
        ArrayList<ArrayList<String>> prodotti = new ArrayList<>();
        ArrayList<ArrayList<String>> utenti = new ArrayList<>();
        ArrayList<ArrayList<String>> vendite = new ArrayList<>();

       

        
        ArrayList<Prodotti> listaProdotti = new ArrayList<>();
        ArrayList<Utenti> listaUtenti = new ArrayList<>();
        ArrayList<Vendite> listaVendite = new ArrayList<>();

        service.copyInListaProdotti(prodotti, listaProdotti);
        service.copyInListaUtenti(utenti, listaUtenti);
        service.copyInListaVendite(vendite, listaVendite);

        
        management.Comandi(listaProdotti, listaUtenti, listaVendite);
        
    }
}
