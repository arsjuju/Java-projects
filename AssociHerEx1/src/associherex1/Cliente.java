/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associherex1;

/**
 *
 * @author 357510
 */
public class Cliente extends Pessoa {

    public String cpf;
    public String endereco;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Cliente(String nome, String cpf, String endereco) {
        super(nome);
        this.cpf = cpf;
        this.endereco = endereco;

    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO CLIENTE"
                + "\n-----------------------------------"
                + "\nNome: " + getNome()
                + "\nCpf: " + getCpf()
                + "\nEndereço: " + getEndereco()
                + "\n-----------------------------------";

    }
}
