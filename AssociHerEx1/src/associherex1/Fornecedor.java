/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associherex1;

/**
 *
 * @author 357510
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
        return "\n-----------------------------------"
                + "\nDADOS DO FORNECEDOR"
                + "\n-----------------------------------"
                + "\nNome: " + getNome()
                + "\nCpnj: " + getCnpj()
                + "\n-----------------------------------";

    }
}
