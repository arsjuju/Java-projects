/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

/**
 *
 * @author 357510
 */
public class Diretor extends Funcionario {

    public double gratificacao;

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }

    public Diretor(String nome, String endereco, int matr, double salario, double gratificacao) {
        super(nome, endereco, matr, salario);
        this.gratificacao = gratificacao;
    }
 @Override
    public String toString() {

        return "\nDADOS PESSOA FÍSICA"
                + "\nNOME: " + getNome()
                + "\nENDEREÇO: " + getEndereco()
                + "\nMATRICULA: " + getMatr()
                + "\nSALARIO: " + getSalario()
                + "\nGRATIFICAÇÃO: " + getGratificacao();
    }
}
