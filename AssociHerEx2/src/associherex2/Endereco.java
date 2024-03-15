/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package associherex2;

/**
 *
 * @author 357510
 */
public class Endereco {

    public String rua;
    public int numero;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Endereco(String rua, int numero) {
        this.rua = rua;
        this.numero = numero;
    }

@Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO ENDEREÇO"
                + "\n-----------------------------------"
                + "\nRua: " + getRua()
                + "\nNúmero: " + getNumero()
                + "\n-----------------------------------";
    }
}
