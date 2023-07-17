package org.gs.model;

public class Prodotti {

    private int id;
    private String nome;
    private String dataInserimento;
    private float prezzo;
    private String marca;
    private String disponibile;

    public Prodotti(int id, String nome, String dataInserimento, float prezzo, String marca, String disponibile){

        this.id = id;
        this.nome = nome;
        this.dataInserimento = dataInserimento;
        this.prezzo = prezzo;
        this.marca = marca;
        this.disponibile = disponibile;
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

    public String getDataInserimento() {
        return this.dataInserimento;
    }

    public void setDataInserimento(String dataInserimento) {
        this.dataInserimento = dataInserimento;
    }

    public float getPrezzo() {
        return this.prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDisponibile() {
        return this.disponibile;
    }

    public void setDisponibile(String disponibile) {
        this.disponibile = disponibile;
    }

    

    
}