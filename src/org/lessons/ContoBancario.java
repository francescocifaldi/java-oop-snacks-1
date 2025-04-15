package org.lessons;

public class ContoBancario {
    // attributi
    private int numeroConto;
    private double saldo;

    // costruttore
    public ContoBancario(int numeroConto) {
        this.numeroConto = numeroConto;
        this.saldo = 0;
    }

    // getter e setter
    public double getSaldo() {
        return this.saldo;
    }

    // metodi
    public void versa(double importo) {
        if (importo < 0) {
            this.saldo += 0;
        } else {
            this.saldo += importo;
        }
    }

    public void preleva(double importo) {
        if (importo < 0) {
            this.saldo -= 0;
        } else if (importo > this.saldo) {
            System.out.println("Impossibile prelevare l'importo richiesto, saldo insufficiente.");
        } else {
            this.saldo -= importo;
        }
    }
}
