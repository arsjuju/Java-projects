/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07;

/**
 *
 * @author 357510
 */
public class Suspense extends Livro {

    private int qtdPaginas;

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public Suspense(String nome, Autor autor, Editora editora, int qtdPaginas) {
        super(nome, autor, editora);
        this.qtdPaginas = qtdPaginas;

    }

@Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO LIVRO - Suspense"
                + "\n-----------------------------------"
                + "\nNome: " + getNome()
                + "\nAutor: " + getAutor()
                + "\nEditora: " + getEditora()
                + "\nQuantidade de Páginas: " + getQtdPaginas()
                + "\n-----------------------------------";

    }
}
