/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associherex4;

/**
 *
 * @author 357510
 */
public class DeAlimentacao extends Loja {

    public String pais;
    public Cliente cliente;

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public DeAlimentacao(int numero, String descricao, Atendente atendente, String pais, Cliente cliente) {
        super(numero, descricao, atendente);
        this.pais = pais;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DA LOJA DE ALIMENTAÇÃO"
                + "\n-----------------------------------"
                + "\nNumero: " + getNumero()
                + "\nDescrição: " + getDescricao()
                + "\nAtendente: " + getAtendente()
                + "\nPaís: " + getPais()
                + "\n-----------------------------------"
                + "\nCliente: " + getCliente();
    }
}
