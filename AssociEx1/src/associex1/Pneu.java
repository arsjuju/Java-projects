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
public class Pneu {

    public int diametro;
    public String fabricante;
    public Fornecedor fornecedor;

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

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Pneu(int diametro, String fabricante, Fornecedor fornecedor) {
        this.diametro = diametro;
        this.fabricante = fabricante;
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return "\nDiâmetro: " + getDiametro()
                + "\nFabricante: " + getFabricante()+
                "\n------------------------------------"
                + "\nFornecedor: " + getFornecedor();
    }
}
