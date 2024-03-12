/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package associex1;

/**
 *
 * @author Dell
 */
public class Fornecedor {

    public String cnpj;
    public String nome;

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

    public Fornecedor(String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nCpnj: " + getCnpj()
                + "\nNome: " + getNome();
    }
}
