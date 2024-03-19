/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associherex4;

/**
 *
 * @author 357510
 */
public class Fornecedor {

    public String cnpj;
    public String nome;
    public Endereco endereco;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Fornecedor(String cnpj, String nome, Endereco endereco) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.endereco = endereco;

    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO FORNECEDOR"
                + "\n-----------------------------------"
                + "\nCnpj: " + getCnpj()
                + "\nNome: " + getNome()
                + "\nEndereço do Fornecedor: " + getEndereco();
    }
}
