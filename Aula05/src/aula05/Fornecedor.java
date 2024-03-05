/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

/**
 *
 * @author 357510
 */
public class Fornecedor extends Pessoa {

    public String cnpj;
    public String pais;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Fornecedor(String nome, String endereco, String cnpj, String pais) {
        super(nome, endereco);
        this.cnpj = cnpj;
        this.pais = pais;

    }
@Override
    public String toString() {

        return "\nDADOS PESSOA FÍSICA"
                + "\nNOME: " + getNome()
                + "\nENDEREÇO: " + getEndereco()
                + "\nCNPJ: " + getCnpj()
                + "\nPAÍS: " + getPais();
    }
}
