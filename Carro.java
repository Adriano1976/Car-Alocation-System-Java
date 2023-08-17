package alocationsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author Adriano Santos
 */
public class Carro {

    private int id;
    private String modelo;
    private String marca;
    private double valorPorKm;

    public Carro() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValorPorKm() {
        return valorPorKm;
    }

    public void setValorPorKm(double valorPorKm) {
        this.valorPorKm = valorPorKm;
    }

    public void cadastrarCarro() {
        modelo = JOptionPane.showInputDialog("Digite o modelo do carro:");
        marca = JOptionPane.showInputDialog("Digite a marca do carro:");
        valorPorKm = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por km do carro:"));
    }

    public String mostrarDadosCarro() {
        String dadosCarro = "Modelo: " + modelo + "\nMarca: " + marca + "\nValor por Km: " + valorPorKm;
        return dadosCarro;
    }
}
