/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exabstract;

/**
 *
 * @author 357510
 */
public class Moto extends Veiculo {

    private int cilindrada;

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Moto(String placa, String cor, int ano, double preco, Proprietario proprietario, int cilindrada) {
        super(placa, cor, ano, preco, proprietario);
        this.cilindrada = cilindrada;
    }

    @Override
    public double ipva() {
        return (getPreco() * 0.08);
    }

    @Override
    public double seguro() {
        return (getPreco() * 0.05);
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DA MOTO"
                + "\n-----------------------------------"
                + "\nPlaca: " + getPlaca()
                + "\nCor: " + getCor()
                + "\nAno: " + getAno()
                + "\nPreço: " + getPreco()
                + "\nIPVA: " + ipva()
                + "\nSeguro: " + seguro()
                + "\n-----------------------------------"
                + "\nProprietário: " + getProprietario()
                + "\nMarca: " + getCilindrada()
                + "\n-----------------------------------";
    }
}
