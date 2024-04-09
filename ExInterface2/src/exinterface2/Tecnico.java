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
public class Tecnico extends Pessoa implements Salario, HoraExtra {

    private String matr;
    private double gratificacao;
    Equipamento equipamento;

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
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

    public Tecnico(String matr, double gratificacao, Equipamento equipamento, String cpf, String nome, Endereco endereco) {
        super(cpf, nome, endereco);
        this.matr = matr;
        this.gratificacao = gratificacao;
        this.equipamento = equipamento;
    }

    @Override
    public double calculaSalario() {
        return SAL + gratificacao + (QTDHORAEXTRA * VALORHORAEXTRA);
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nTÉCNICO"
                + "\n-----------------------------------"
                + "\nMatrícula: " + getMatr()
                + "\nGratificação: " + getGratificacao()
                + getEquipamento()
                + "\nCpf: " + getCpf()
                + "\nNome: " + getNome()
                + getEndereco()
                + "\nSalário Final: " + calculaSalario()
                + "\n-----------------------------------";
    }
}
