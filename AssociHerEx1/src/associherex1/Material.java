/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associherex1;

/**
 *
 * @author 357510
 */
public class Material {

    public String nome;
    public int quantidade;
    public Fornecedor fornecedor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Material(String nome, int quantidade, Fornecedor fornecedor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;

    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO MATERIAL"
                + "\n-----------------------------------"
                + "\nNome: " + getNome()
                + "\nQuantidade: " + getQuantidade()
                + "\nFornecedor: " + getFornecedor()
                + "\n-----------------------------------";

    }
}
