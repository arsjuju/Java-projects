/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associherex1;

/**
 *
 * @author 357510
 */
public class Engenheiro extends Pessoa {

    public String CREA;
    public Obra obra;

    public String getCREA() {
        return CREA;
    }

    public void setCREA(String CREA) {
        this.CREA = CREA;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public Engenheiro(String nome, String CREA, Obra obra) {
        super(nome);
        this.CREA = CREA;
        this.obra = obra;

    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO ENGENHEIRO"
                + "\n-----------------------------------"
                + "\nNome: " + getNome()
                + "\nCREA: " + getCREA()
                + "\nObra: " + getObra()
                + "\n-----------------------------------";
    }
}
