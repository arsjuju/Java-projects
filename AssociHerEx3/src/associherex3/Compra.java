/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associherex3;

/**
 *
 * @author 357510
 */
public class Compra {

    public int numero;
    public String data;
    public double valor;
    public Pagamento pagamento;
    public Cliente cliente;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Compra(int numero, String data, double valor, Pagamento pagamento, Cliente cliente) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.pagamento = pagamento;
        this.cliente = cliente;

    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DA COMPRA"
                + "\n-----------------------------------"
                + "\nNúmero da Compra: " + getNumero()
                + "\nData da Compra: " + getData()
                + "\nValor: " + getValor()
                + "\nPagamento: " + getPagamento()
                + "\nCliente: " + getCliente()
                + "\n-----------------------------------";

    }
}
