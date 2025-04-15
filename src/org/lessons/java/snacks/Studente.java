package org.lessons.java.snacks;

public class Studente {
    // attributi
    private String nome;
    private String cognome;
    private int eta;

    // costruttore
    public Studente(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    // metodi
    public String getFullName() {
        return this.nome + " " + this.cognome + ", " + this.eta + " anni";
    }
}
