/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associherex3;

/**
 *
 * @author 357510
 */
public class Farmaceutico extends Funcionario {

    public String formacao;

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public Farmaceutico(int matricula, String nome, double salario, String formacao) {
        super(matricula, nome, salario);
        this.formacao = formacao;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO FARMACEUTICO"
                + "\n-----------------------------------"
                + "\nMatrícula: " + getMatricula()
                + "\nNome: " + getNome()
                + "\nSalário: " + getSalario()
                + "\nFormação: " + getFormacao()
                + "\n-----------------------------------";
    }
}
