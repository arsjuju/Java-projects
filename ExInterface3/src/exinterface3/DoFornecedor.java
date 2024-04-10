package exinterface3;

public class DoFornecedor extends NotaFiscal {

    private String descricao;
    private String data;
    private double preco;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public DoFornecedor(String descricao, String data, double preco, int numero) {
        super(numero);
        this.descricao = descricao;
        this.data = data;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nNOTA FISCAL DO FORNECEDOR"
                + "\n-----------------------------------"
                + "\nDescrição: " + getDescricao()
                + "\nData: " + getData()
                + "\nPreço: " + getPreco()
                + "\nNúmero: " + getNumero()
                + "\n-----------------------------------";
    }
}
