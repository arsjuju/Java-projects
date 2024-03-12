/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07;

/**
 *
 * @author 357510
 */
public class Infantil extends Livro {

    public String faixaEtaria;

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public Infantil(String nome, Autor autor, Editora editora, String faixaEtaria) {
        super(nome, autor, editora);
        this.faixaEtaria = faixaEtaria;

    }

@Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO LIVRO - INFANTIL"
                + "\n-----------------------------------"
                + "\nNome: " + getNome()
                + "\nAutor: " + getAutor()
                + "\nEditora: " + getEditora()
                + "\nFaixa Etária: " + getFaixaEtaria()
                + "\n-----------------------------------";
    }
}
