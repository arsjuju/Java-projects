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
public class Caminhao {

    public String modelo;
    public String fabricante;
    public Motor motor;
    public Roda roda;
    public Pneu pneu;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Roda getRoda() {
        return roda;
    }

    public void setRoda(Roda roda) {
        this.roda = roda;
    }

    public Pneu getPneu() {
        return pneu;
    }

    public void setPneu(Pneu pneu) {
        this.pneu = pneu;
    }

    public Caminhao(String modelo, String fabricante, Motor motor, Roda roda, Pneu pneu) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.motor = motor;
        this.roda = roda;
        this.pneu = pneu;
    }

    @Override
    public String toString() {
        return "\n------------------------------------"
                + "\nModelo: " + getModelo()
                + "\nFabricante: " + getFabricante()
                + "\n------------------------------------"
                + "\nMotor: " + getMotor()
                + "\n------------------------------------"
                + "\nRoda: " + getRoda()
                + "\n------------------------------------"
                + "\nPneu: " + getPneu()
                + "\n------------------------------------";
    }
}
