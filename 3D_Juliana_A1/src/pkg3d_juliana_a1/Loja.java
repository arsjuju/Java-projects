package pkg3d_juliana_a1;

/**
 *
 * @author 357510
 */
public class Loja {

    public String nome;
    public int numero;
    public Contrato contrato;
    public Produto produto;
    public Vendedor vendedor;
    public Cliente cliente;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Loja(String nome, int numero, Contrato contrato, Produto produto, Vendedor vendedor, Cliente cliente) {
        this.nome = nome;
        this.numero = numero;
        this.contrato = contrato;
        this.produto = produto;
        this.vendedor = vendedor;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DA LOJA"
                + "\n-----------------------------------"
                + "\nNome: " + getNome()
                + "\nNúmero: " + getNumero()
                + "\nContrato: " + getContrato()
                + "\nProduto: " + getProduto()
                + "\nVendedor: " + getVendedor()
                + "\nCliente: " + getCliente();
    }
}
