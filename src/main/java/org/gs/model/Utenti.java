package org.gs.model;

public class Utenti {

    private int id;
    private String nome;
    private String cognome;
    private String dataDiNascita;
    private String indirizzo;
    private String documentoId;

    public Utenti(int id, String nome, String cognome, String dataDiNascita, String indirizzo, String documentoId){

        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
        this.indirizzo = indirizzo;
        this.documentoId = documentoId;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getDataDiNascita() {
        return this.dataDiNascita;
    }

    public void setDataDiNascita(String dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public String getIndirizzo() {
        return this.indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getDocumentoId() {
        return this.documentoId;
    }

    public void setDocumentoId(String documentoId) {
        this.documentoId = documentoId;
    }
    
}