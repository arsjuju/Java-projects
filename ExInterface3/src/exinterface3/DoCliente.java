package exinterface3;

public class DoCliente extends NotaFiscal {

    private String descricao;
    protected static double preco;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int getNumero() {
        return numero;
    }

    @Override
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public DoCliente(String descricao, double preco, int numero) {
        super(numero);
        this.descricao = descricao;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nNOTA FISCAL DO CLIENTE"
                + "\n-----------------------------------"
                + "\nDescrição: " + getDescricao()
                + "\nPreço: " + getPreco()
                + "\nNúmero: " + getNumero()
                + "\n-----------------------------------";
    }
}
