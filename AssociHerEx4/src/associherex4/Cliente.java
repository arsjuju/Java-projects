/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associherex4;

/**
 *
 * @author 357510
 */
public class Cliente {

    public String cpf;
    public String nome;
    public Endereco endereco;
    public Produto produto;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Cliente(String cpf, String nome, Endereco endereco, Produto produto) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO CLIENTE"
                + "\n-----------------------------------"
                + "\nCpf: " + getCpf()
                + "\nNome: " + getNome()
                + "\nEndereço do Cliente: " + getEndereco()
                + "\nProduto: " + getProduto();
    }
}
