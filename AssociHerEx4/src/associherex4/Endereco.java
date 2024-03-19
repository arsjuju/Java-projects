/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associherex4;

/**
 *
 * @author 357510
 */
public class Endereco {

    public String rua;
    public String cep;
    public int numero;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Endereco(String rua, String cep, int numero) {
        this.rua = rua;
        this.cep = cep;
        this.numero = numero;

    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO ENDEREÇO"
                + "\n-----------------------------------"
                + "\nRua: " + getRua()
                + "\nCep: " + getCep()
                + "\nNúmero: " + getNumero()
                + "\n-----------------------------------";
    }
}
