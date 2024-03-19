/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associherex4;

/**
 *
 * @author 357510
 */
public class DeCalcados extends Loja {

    public String tipoProduto;
    public Cliente cliente;

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public DeCalcados(int numero, String descricao, Atendente atendente, String tipoProduto, Cliente cliente) {
        super(numero, descricao, atendente);
        this.tipoProduto = tipoProduto;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DA LOJA DE CALÇADOS"
                + "\n-----------------------------------"
                + "\nNumero: " + getNumero()
                + "\nDescrição: " + getDescricao()
                + "\nAtendente: " + getAtendente()
                + "\nTipo de Produto: " + getTipoProduto()
                + "\n-----------------------------------"
                + "\nCliente: " + getCliente();
    }
}
