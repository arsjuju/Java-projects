/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associherex3;

/**
 *
 * @author 357510
 */
public class Atendente extends Funcionario {

    public int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Atendente(int matricula, String nome, double salario, int idade) {
        super(matricula, nome, salario);

        this.idade = idade;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO ATENDENTE"
                + "\n-----------------------------------"
                + "\nMatrícula: " + getMatricula()
                + "\nNome: " + getNome()
                + "\nSalário: " + getSalario()
                + "\nIdade: " + getIdade()
                + "\n-----------------------------------";

    }
}
