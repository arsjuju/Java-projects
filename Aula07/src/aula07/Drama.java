/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07;

/**
 *
 * @author 357510
 */
public class Drama extends Livro {

    public String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Drama(String nome, Autor autor, Editora editora, String descricao) {
        super(nome, autor, editora);
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO LIVRO - Drama"
                + "\n-----------------------------------"
                + "\nNome: " + getNome()
                + "\nAutor: " + getAutor()
                + "\nEditora: " + getEditora()
                + "\nDescrição: " + getDescricao()
                + "\n-----------------------------------";

    }
}
