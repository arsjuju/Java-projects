/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07;

/**
 *
 * @author 357510
 */
public class Autor {

    public String cpf;
    public String nome;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Autor(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;

    }

@Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO AUTOR"
                + "\n-----------------------------------"
                + "\nCpf: " + getCpf()
                + "\nNome: " + getNome()
                + "\n-----------------------------------";
    }
}
