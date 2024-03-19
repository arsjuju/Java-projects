/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associherex4;

/**
 *
 * @author 357510
 */
public class DeUtilidades extends Loja {

    public int quantidadeProduto;
    public Box box;
    public Cliente cliente;

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public DeUtilidades(int numero, String descricao, Atendente atendente, int quantidadeProduto, Box box, Cliente cliente) {
        super(numero, descricao, atendente);
        this.quantidadeProduto = quantidadeProduto;
        this.box = box;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DA LOJA DE UTILIDADES"
                + "\n-----------------------------------"
                + "\nNumero: " + getNumero()
                + "\nDescrição: " + getDescricao()
                + "\nAtendente: " + getAtendente()
                + "\nBox: " + getBox()
                + "\nQuantidade de Produto: " + getQuantidadeProduto()
                + "\n-----------------------------------"
                + "\nCliente: " + getCliente();
    }
}
