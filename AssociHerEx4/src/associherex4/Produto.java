/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associherex4;

/**
 *
 * @author 357510
 */
public class Produto {

    public int codigo;
    public String nome;
    public double preco;
    public Fornecedor fornecedor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Produto(int codigo, String nome, double preco, Fornecedor fornecedor) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO PRODUTO"
                + "\n-----------------------------------"
                + "\nCódigo: " + getCodigo()
                + "\nNome: " + getNome()
                + "\nPreço: " + getPreco()
                + "\nFornecedor: " + getFornecedor();
    }
}
