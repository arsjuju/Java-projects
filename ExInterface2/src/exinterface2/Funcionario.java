/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exinterface2;

/**
 *
 * @author 357510
 */
public class Funcionario extends Pessoa implements Comissao {

    private int matr;
    private double valorComissao;

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public double getValorComissao() {
        return valorComissao;
    }

    public void setValorComissao(double valorComissao) {
        this.valorComissao = valorComissao;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Funcionario(int matr, double valorComissao, String cpf, String nome, Endereco endereco) {
        super(cpf, nome, endereco);
        this.matr = matr;
        this.valorComissao = valorComissao;
    }

    @Override
    public double calculaSalComissao() {
        return SAL + valorComissao;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nFUNCIONÁRIO"
                + "\n-----------------------------------"
                + "\nMatrícula: " + getMatr()
                + "\nValor da Comissão: " + calculaSalComissao()
                + "\nCpf: " + getCpf()
                + "\nNome: " + getNome()
                + getEndereco();
    }
}
