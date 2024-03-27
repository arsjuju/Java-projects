/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractexemplo;

/**
 *
 * @author 357510
 */
public class Filiacao {

    private String nomePai;
    private String nomeMae;

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public Filiacao(String nomePai, String nomeMae) {
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DA FILIAÇÃO"
                + "\n-----------------------------------"
                + "\nNome do Pai: " + getNomePai()
                + "\nNome da Mãe: " + getNomeMae();
    }

}
