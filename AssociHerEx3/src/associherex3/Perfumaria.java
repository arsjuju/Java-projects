/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associherex3;

/**
 *
 * @author 357510
 */
public class Perfumaria extends Produto {

    public double desconto;
    public String secao;

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public Perfumaria(String codigo, String nome, double preco, Fornecedor fornecedor, double desconto, String secao) {
        super(codigo, nome, preco, fornecedor);
        this.desconto = desconto;
        this.secao = secao;

    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO MEDICAMENTO"
                + "\n-----------------------------------"
                + "\nCódigo: " + getCodigo()
                + "\nNome: " + getNome()
                + "\nPreço: " + getPreco()
                + "\nFornecedor: " + getFornecedor()
                + "\nDesconto: " + getDesconto()
                + "\nSeção: " + getSecao()
                + "\n-----------------------------------";

    }
}
