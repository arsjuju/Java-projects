/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associherex4;

/**
 *
 * @author 357510
 */
public class Atendente {

    public int matricula;
    public String nome;
    public double salario;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Atendente(int matricula, String nome, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO ATENDENTE"
                + "\n-----------------------------------"
                + "\nMatrícula: " + getMatricula()
                + "\nNome: " + getNome()
                + "\nSalário: " + getSalario()
                + "\n-----------------------------------";
    }
}
