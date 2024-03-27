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
public class DePasseio extends Veiculo {

    private String marca;
    private String descricao;
    private Montadora montadora;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }

    public DePasseio(String placa, String cor, int ano, double preco, Proprietario proprietario, String marca, String descricao, Montadora montadora) {
        super(placa, cor, ano, preco, proprietario);
        this.marca = marca;
        this.descricao = descricao;
        this.montadora = montadora;
    }

    @Override
    public double ipva() {
        return (getPreco() * 0.03);
    }

    @Override
    public double seguro() {
        return (getPreco() * 0.015);
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO VEÍCULO DE PASSEIO"
                + "\n-----------------------------------"
                + "\nPlaca: " + getPlaca()
                + "\nCor: " + getCor()
                + "\nAno: " + getAno()
                + "\nPreço: " + getPreco()
                + "\nIPVA: " + ipva()
                + "\nSeguro: " + seguro()
                + "\n-----------------------------------"
                + "\nProprietário: " + getProprietario()
                + "\nMarca: " + getMarca()
                + "\nDescrição: " + getDescricao()
                + "\n-----------------------------------"
                + "\nMontadora: " + getMontadora();
    }
}
