/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

/**
 *
 * @author 357510
 */
public class Vendedor extends Funcionario {

    public String setorVendas;
    public double comissao;
    public double totalVendido;

    public String getSetorVendas() {
        return setorVendas;
    }

    public void setSetorVendas(String setorVendas) {
        this.setorVendas = setorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(double totalVendido) {
        this.totalVendido = totalVendido;
    }

    public Vendedor(String nome, String endereco, int matr, double salario, String setorVendas, double comissao, double totalVendido) {
        super(nome, endereco, matr, salario);
        this.setorVendas = setorVendas;
        this.comissao = comissao;
        this.totalVendido = totalVendido;
    }

    @Override
    public String toString() {

        return "\nDADOS PESSOA FÍSICA"
                + "\nNOME: " + getNome()
                + "\nENDEREÇO: " + getEndereco()
                + "\nMATRICULA: " + getMatr()
                + "\nSALARIO: " + getSalario()
                + "\nSETOR DE VENDAS: " + getSetorVendas()
                + "\nCOMISSAO: " + getComissao()
                + "\nTOTAL VENDIDO: " + getTotalVendido();
    }

}
