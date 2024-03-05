/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author 357510
 */

/*Palavra-chave extends é usada para indicar 
    que uma dada classe herda de outra.*/
public class Funcionario extends Pessoa {

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /* Declaração das variaveis de instancia da classe*/
    private String cargo;

    /*Assinatura dos métodos de serviço (Classe Construtor)*/
    public Funcionario(String nome, String cpf, String cargo) {

        /*Palavra-Chave usada para acessar a superclasse de uma classe*/
        super(nome, cpf);
        this.cargo = cargo;
    }

}
