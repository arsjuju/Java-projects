/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06;

/**
 *
 * @author 357510
 */
public class Funcionario {

    public String matricula;
    public String nome;
    public Veiculo veiculo;
    private Residencia residencia;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Residencia getResidencia() {
        return residencia;
    }

    public void setResidencia(Residencia residencia) {
        this.residencia = residencia;
    }

    public Funcionario(String matricula, String nome, Veiculo veiculo, Residencia residencia) {
        this.matricula = matricula;
        this.nome = nome;
        this.veiculo = veiculo;
        this.residencia = residencia;

    }

    public String toString() {
        return "DADOS DO FUNCIONÁRIO"
                + "\n----------------------------------"
                + "\nMatricula: " + getMatricula()
                + "\nNome: " + getNome()
                + "\n----------------------------------"
                + "\nVeiculo: " + getVeiculo()
                + "\n----------------------------------"
                + "\nResidência: " + getResidencia()
                + "\n----------------------------------";

    }

}
