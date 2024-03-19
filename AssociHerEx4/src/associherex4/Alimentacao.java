/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associherex4;

/**
 *
 * @author 357510
 */
public class Alimentacao extends Setor {

    public int quantidadeLoja;
    public DeAlimentacao deAlimentacao;

    public int getQuantidadeLoja() {
        return quantidadeLoja;
    }

    public void setQuantidadeLoja(int quantidadeLoja) {
        this.quantidadeLoja = quantidadeLoja;
    }

    public DeAlimentacao getDeAlimentacao() {
        return deAlimentacao;
    }

    public void setDeAlimentacao(DeAlimentacao deAlimentacao) {
        this.deAlimentacao = deAlimentacao;
    }

    public Alimentacao(int numero, int quantidadeLoja, DeAlimentacao deAlimentacao) {
        super(numero);
        this.quantidadeLoja = quantidadeLoja;
        this.deAlimentacao = deAlimentacao;

    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS SETOR DE ALIMENTAÇÃO"
                + "\n-----------------------------------"
                + "\nNumero: " + getNumero()
                + "\nQuantidade de Lojas: " + getQuantidadeLoja()
                + "\nLoja de Alimentação: " + getDeAlimentacao();
    }
}
