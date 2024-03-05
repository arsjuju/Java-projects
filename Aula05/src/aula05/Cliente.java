/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

/**
 *
 * @author 357510
 */
public class Cliente extends Pessoa {

    public int idade;


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Cliente(String nome, String endereco, int idade) {
        super(nome, endereco);

        this.idade = idade;

    }
}
