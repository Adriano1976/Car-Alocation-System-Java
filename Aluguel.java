package alocationsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author Adriano Santos
 */
public class Aluguel {

    private int id;
    private Cliente usuario;
    private Carro carro;
    private int quantidadeDias;
    private int kmInicial;
    private int kmFinal;
    private double valorTotalAluguel;

    public Aluguel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getUsuario() {
        return usuario;
    }

    public void setUsuario(Cliente usuario) {
        this.usuario = usuario;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }

    public int getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(int kmInicial) {
        this.kmInicial = kmInicial;
    }

    public int getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(int kmFinal) {
        this.kmFinal = kmFinal;
    }

    public double getValorTotalAluguel() {
        return valorTotalAluguel;
    }

    public void setValorTotalAluguel(double valorTotalAluguel) {
        this.valorTotalAluguel = valorTotalAluguel;
    }

    public void iniciarAluguel() {
        usuario = new Cliente();
        usuario.cadastrarUsuario();

        carro = new Carro();
        carro.cadastrarCarro();

        quantidadeDias = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dias do aluguel:"));
        kmInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o km inicial do veículo:"));
    }

    public void fecharLocacao() {
        kmFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite o km final do veículo:"));
        double valorPorKm = carro.getValorPorKm();
        double valorBase = quantidadeDias * valorPorKm * (kmFinal - kmInicial);

        if (quantidadeDias > 20) {
            valorTotalAluguel = valorBase * 0.8; // 20% de desconto
        } else if (quantidadeDias > 10) {
            valorTotalAluguel = valorBase * 0.9; // 10% de desconto
        } else {
            valorTotalAluguel = valorBase;
        }
    }

    public void mostrarResumoLocacao() {
        String resumo = """
                        Resumo do Aluguel
                        
                        Cliente
                        """ + usuario.mostrarDadosUsuario() + "\n\n"
                + "Carro\n" + carro.mostrarDadosCarro() + "\n\n"
                + "Aluguel\n"
                + "Quantidade de dias: " + quantidadeDias + "\n"
                + "Km Inicial: " + kmInicial + "\n"
                + "Km Final: " + kmFinal + "\n"
                + "Valor Total: R$" + valorTotalAluguel;

        JOptionPane.showMessageDialog(null, resumo);
    }
}
