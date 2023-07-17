
package org.gs.model;

public class Vendite {

    private int id;
    private int idProdotto;
    private int idUtente;

    public Vendite(int id, int idProdotto, int idUtente){

        this.id = id;
        this.idProdotto = idProdotto;
        this.idUtente = idUtente;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProdotto() {
        return this.idProdotto;
    }

    public void setIdProdotto(int idProdotto) {
        this.idProdotto = idProdotto;
    }

    public int getIdUtente() {
        return this.idUtente;
    }

    public void setIdUtente(int idUtente) {
        this.idUtente = idUtente;
    }
    
}