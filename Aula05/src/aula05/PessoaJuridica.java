/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

/**
 *
 * @author 357510
 */
public class PessoaJuridica extends Cliente {

    public String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public PessoaJuridica(String nome, String endereco, int idade, String cpnj) {
        super(nome, endereco, idade);

        this.cnpj = cnpj;

    }

@Override
    public String toString() {

        return "\nDADOS PESSOA JURÍDICA"
                + "\nNOME: " + getNome()
                + "\nENDEREÇO: " + getEndereco()
                + "\nIDADE: " + getIdade()
                + "\nCNPJ: " + getCnpj();
    }
}

