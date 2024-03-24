/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associherex3;

/**
 *
 * @author 357510
 */
public class Pagamento {

    public String forma;

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public Pagamento(String forma) {
        this.forma = forma;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO PAGAMENTO"
                + "\n-----------------------------------"
                + "\nForma de Pagamento: " + getForma()
                + "\n-----------------------------------";
    }
}
