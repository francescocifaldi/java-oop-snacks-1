import org.lessons.java.snacks.Studente;
import org.lessons.java.snacks.ContoBancario;

public class App {
    public static void main(String[] args) throws Exception {
        Studente studente = new Studente("Mario", "Rossi", 20);
        System.out.println("Informazioni sullo studente: " + studente.getFullName());

        ContoBancario conto = new ContoBancario(12345);
        System.out.println("Numero di conto: " + conto.getNumeroConto());
        System.out.println("Saldo iniziale: " + conto.getSaldo());
        conto.versa(1000);
        System.out.println("Saldo dopo il versamento: " + conto.getSaldo());
        conto.preleva(500);
        System.out.println("Saldo dopo il prelievo: " + conto.getSaldo());
        conto.preleva(600);
        System.out.println("Saldo dopo il tentativo di prelievo eccessivo: " + conto.getSaldo());
        conto.versa(-200);
        System.out.println("Saldo dopo il versamento negativo: " + conto.getSaldo());
        conto.preleva(-100);
        System.out.println("Saldo dopo il prelievo negativo: " + conto.getSaldo());
        conto.versa(0);
        System.out.println("Saldo dopo il versamento di zero: " + conto.getSaldo());
        conto.preleva(0);
        System.out.println("Saldo dopo il prelievo di zero: " + conto.getSaldo());
        conto.versa(500);
        System.out.println("Saldo dopo il versamento di 500: " + conto.getSaldo());
    }
}
