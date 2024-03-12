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
public class Motor {

    public int potencia;
    public int cilindrada;
    public String tipoCombustivel;
    public Parafuso parafuso;

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public Parafuso getParafuso() {
        return parafuso;
    }

    public void setParafuso(Parafuso parafuso) {
        this.parafuso = parafuso;
    }

    public Motor(int potencia, int cilindrada, String tipoCombustivel, Parafuso parafuso) {
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.tipoCombustivel = tipoCombustivel;
        this.parafuso = parafuso;
    }

    @Override
    public String toString() {
        return "\nPotência: " + getPotencia()
                + "\nCilindrada: " + getCilindrada()
                + "\nTipo de Combustível: " + getTipoCombustivel()+
                "\n------------------------------------"
                + "\nParafuso: " + getParafuso();
    }
}
