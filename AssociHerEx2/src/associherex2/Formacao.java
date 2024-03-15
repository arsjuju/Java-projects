/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package associherex2;

/**
 *
 * @author 357510
 */
public class Formacao {

    public String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Formacao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DA FORMAÇÃO"
                + "\n-----------------------------------"
                + "\nDescrição: " + getDescricao()
                + "\n-----------------------------------";
    }
}
