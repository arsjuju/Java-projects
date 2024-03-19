/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associherex4;

/**
 *
 * @author 357510
 */
public class Contrato {

    public int numero;
    public double valor;

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

    public Contrato(int numero, double valor) {
        this.numero = numero;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO CONTRATO"
                + "\n-----------------------------------"
                + "\nNúmero: " + getNumero()
                + "\nValor: " + getValor()
                + "\n-----------------------------------";
    }
}
