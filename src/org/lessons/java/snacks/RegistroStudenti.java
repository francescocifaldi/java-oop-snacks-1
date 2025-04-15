package org.lessons.java.snacks;

public class RegistroStudenti {
    // attributi
    private Studente[] studenti;

    // costruttore
    public RegistroStudenti() {
        this.studenti = new Studente[0];
    }

    // metodi
    public void aggiungiStudente(Studente studente) {
        Studente[] nuoviStudenti = new Studente[this.studenti.length + 1];
        for (int i = 0; i < this.studenti.length; i++) {
            nuoviStudenti[i] = this.studenti[i];
        }
        nuoviStudenti[this.studenti.length] = studente;
        this.studenti = nuoviStudenti;
    }

    public void stampaStudenti() {

        if (studenti.length == 0) {
            System.out.println("Nessuno studente registrato.");
            return;
        } else {
            System.out.println("Elenco studenti registrati:");
            for (int i = 0; i < studenti.length; i++) {
                System.out.println(studenti[i].getFullName());
            }
        }
    }
}
