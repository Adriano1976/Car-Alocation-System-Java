package alocationsystem;

/**
 *
 * @author Adriano Santos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Aluguel aluguel = new Aluguel();
        aluguel.iniciarAluguel();
        aluguel.fecharLocacao();
        aluguel.mostrarResumoLocacao();
    }

}
