/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package associex1;

/**
 *
 * @author Dell
 */
public class Roda {

    public int diametro;
    public String fabricante;
    public String cor;
    public Parafuso parafuso;

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Parafuso getParafuso() {
        return parafuso;
    }

    public void setParafuso(Parafuso parafuso) {
        this.parafuso = parafuso;
    }

    public Roda(int diametro, String fabricante, String cor, Parafuso parafuso) {
        this.diametro = diametro;
        this.fabricante = fabricante;
        this.cor = cor;
        this.parafuso = parafuso;
    }

    @Override
    public String toString() {
        return "\nDiâmetro: " + getDiametro()
                + "\nFabricante: " + getFabricante()
                + "\nCor: " + getCor()+
                "\n------------------------------------"
                + "\nParafuso: " + getParafuso();
    }
}
