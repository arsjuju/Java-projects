/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associherex4;

/**
 *
 * @author 357510
 */
public class Box {

    public int numero;
    public String descricao;
    public Locatorio locatorio;
    public Produto produto;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Locatorio getLocatorio() {
        return locatorio;
    }

    public void setLocatorio(Locatorio locatorio) {
        this.locatorio = locatorio;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Box(int numero, String descricao, Locatorio locatorio, Produto produto) {
        this.numero = numero;
        this.descricao = descricao;
        this.locatorio = locatorio;
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DA BOX"
                + "\n-----------------------------------"
                + "\nNúmero: " + getNumero()
                + "\nDescrição: " + getDescricao()
                + "\nLocatório: " + getLocatorio()
                + "\nProduto: " + getProduto();
    }
}
