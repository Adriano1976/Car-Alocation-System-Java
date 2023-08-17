package alocationsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author Adriano Santos
 */
public class Cliente {

    private int id;
    private String nome;
    private String cpf;
    private String telefone;

    public Cliente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void cadastrarUsuario() {
        nome = JOptionPane.showInputDialog("Digite o nome do usuário:");
        cpf = JOptionPane.showInputDialog("Digite o CPF do usuário:");
        telefone = JOptionPane.showInputDialog("Digite o telefone do usuário:");
    }

    public String mostrarDadosUsuario() {
        String dadosUsuario = "Nome: " + nome + "\nCPF: " + cpf + "\nTelefone: " + telefone;
        return dadosUsuario;
    }

}
