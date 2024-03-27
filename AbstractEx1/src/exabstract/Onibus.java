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
public class Onibus extends Veiculo {

    private int qtdePassageiros;
    private Montadora montadora;

    public int getQtdePassageiros() {
        return qtdePassageiros;
    }

    public void setQtdePassageiros(int qtdePassageiros) {
        this.qtdePassageiros = qtdePassageiros;
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }

    public Onibus(String placa, String cor, int ano, double preco, Proprietario proprietario, int qtdePassageiros, Montadora montadora) {
        super(placa, cor, ano, preco, proprietario);
        this.qtdePassageiros = qtdePassageiros;
        this.montadora = montadora;
    }

    @Override
    public double ipva() {
        return (getPreco() * 0.05);
    }

    @Override
    public double seguro() {
        return (getPreco() * 0.025);
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO ÔNIBUS"
                + "\n-----------------------------------"
                + "\nPlaca: " + getPlaca()
                + "\nCor: " + getCor()
                + "\nAno: " + getAno()
                + "\nPreço: " + getPreco()
                + "\nIPVA: " + ipva()
                + "\nSeguro: " + seguro()
                + "\n-----------------------------------"
                + "\nProprietário: " + getProprietario()
                + "\nQuantidade de Passageiros: " + getQtdePassageiros()
                + "\n-----------------------------------"
                + "\nMontadora: " + getMontadora();
    }
}
