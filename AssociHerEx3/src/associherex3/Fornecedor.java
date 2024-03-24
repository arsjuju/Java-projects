/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associherex3;

/**
 *
 * @author 357510
 */
public class Fornecedor {

    public String cnpj;
    public String endereco;
    public String nome;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Fornecedor(String cnpj, String endereco, String nome) {
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO FORNECEDOR"
                + "\n-----------------------------------"
                + "\nCnpj: " + getCnpj()
                + "\nEndereço: " + getEndereco()
                + "\nNome: " + getNome()
                + "\n-----------------------------------";
    }
}
