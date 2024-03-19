/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associherex3;

/**
 *
 * @author 357510
 */
public class Pedido {

    public int numero;
    public double valor;
    public Atendente atendente;
    public Perfumaria perfumaria;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }

    public Perfumaria getPerfumaria() {
        return perfumaria;
    }

    public void setPerfumaria(Perfumaria perfumaria) {
        this.perfumaria = perfumaria;
    }

    public Pedido(int numero, double valor, Atendente atendente, Perfumaria perfumaria) {
        this.numero = numero;
        this.valor = valor;
        this.atendente = atendente;
        this.perfumaria = perfumaria;

    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO PEDIDO"
                + "\n-----------------------------------"
                + "\nNúmero: " + getNumero()
                + "\nValor: " + getValor()
                + "\nAtendente: " + getAtendente()
                + "\nPerfumaria: " + getPerfumaria()
                + "\n-----------------------------------";
    }
}
