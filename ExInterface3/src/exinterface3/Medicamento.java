package exinterface3;

public class Medicamento implements PrecoVenda, Icms {

    private String codigo;
    private String nome;
    private double precoFornecedor;
    private Fornecedor fornecedor;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoFornecedor() {
        return precoFornecedor;
    }

    public void setPrecoFornecedor(double precoFornecedor) {
        this.precoFornecedor = precoFornecedor;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Medicamento(String codigo, String nome, double precoFornecedor, Fornecedor fornecedor) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoFornecedor = precoFornecedor;
        this.fornecedor = fornecedor;
    }

    public double calculaIcms() {
        return precoFornecedor * ALIQUOTA;
    }

    @Override
    public double precoFinal() {
        return precoFornecedor * calculaIcms();
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nMEDICAMENTO"
                + "\n-----------------------------------"
                + "\nCódigo: " + getCodigo()
                + "\nNome: " + getNome()
                + "\nPreço do Fornecedor: " + getPrecoFornecedor()
                + "\nPreço Final: " + precoFinal()
                + getFornecedor();

    }
}
