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
public abstract class Veiculo {

    private String placa;
    private String cor;
    private int ano;
    private double preco;
    private Proprietario proprietario;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public Veiculo(String placa, String cor, int ano, double preco, Proprietario proprietario) {
        this.placa = placa;
        this.cor = cor;
        this.ano = ano;
        this.preco = preco;
        this.proprietario = proprietario;
    }

    public abstract double ipva();

    public abstract double seguro();

    @Override
    public abstract String toString();
}
