/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package associherex2;

/**
 *
 * @author 357510
 */
public class Terceirizado extends Funcionario {

    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Terceirizado(String nome, Formacao formacao, Endereco endereco, String cargo) {
        super(nome, formacao, endereco);
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO FUNCIONÁRIO TERCEIRIZADO"
                + "\n-----------------------------------"
                + "\nNome: " + getNome()
                + "\nFormação: " + getFormacao()
                + "\nEndereço: " + getEndereco()
                + "\nCargo: " + getCargo()
                + "\n-----------------------------------";
    }
}
