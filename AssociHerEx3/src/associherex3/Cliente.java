/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associherex3;

/**
 *
 * @author 357510
 */
public class Cliente {

    public String cpf;
    public String nome;
    public String dataNasc;
    public Pedido pedido;

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

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Cliente(String cpf, String nome, String dataNasc, Pedido pedido) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO CLIENTE"
                + "\n-----------------------------------"
                + "\nCpf: " + getCpf()
                + "\nNome: " + getNome()
                + "\nData de Nascimento: " + getDataNasc()
                + "\nPedido: " + getPedido()
                + "\n-----------------------------------";

    }
}
