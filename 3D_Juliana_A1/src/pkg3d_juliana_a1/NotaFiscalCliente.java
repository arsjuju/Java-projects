package pkg3d_juliana_a1;

/**
 *
 * @author 357510
 */
public class NotaFiscalCliente {

    public int numero;
    public double valor;
    public Produto produto;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public NotaFiscalCliente(int numero, double valor, Produto produto) {
        this.numero = numero;
        this.valor = valor;
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DA NOTA FISCAL"
                + "\n-----------------------------------"
                + "\nNúmero: " + getNumero()
                + "\nValor: " + getValor()
                + "\nProduto: " + getProduto();
    }
}
