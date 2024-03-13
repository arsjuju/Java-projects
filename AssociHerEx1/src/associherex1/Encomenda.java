/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associherex1;

/**
 *
 * @author 357510
 */
public class Encomenda {

    public String descricao;
    public String dataEntrega;
    public double valor;
    Material material;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Encomenda(String descricao, String dataEntrega, double valor, Material material) {
        this.descricao = descricao;
        this.dataEntrega = dataEntrega;
        this.valor = valor;
        this.material = material;

    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DA ENCOMENDA"
                + "\n-----------------------------------"
                + "\nDescrição: " + getDescricao()
                + "\nData de Entrega: " + getDataEntrega()
                + "\nValor: " + getValor()
                + "\nMaterial: " + getMaterial()
                + "\n-----------------------------------";
    }
}
