package exinterface3;

public class Fornecedor {

    private String descricao;
    private String nome;
    Endereco endereco;
    DoFornecedor doFornecedor;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public DoFornecedor getDoFornecedor() {
        return doFornecedor;
    }

    public void setDoFornecedor(DoFornecedor doFornecedor) {
        this.doFornecedor = doFornecedor;
    }

    public Fornecedor(String descricao, String nome, Endereco endereco, DoFornecedor doFornecedor) {
        this.descricao = descricao;
        this.nome = nome;
        this.endereco = endereco;
        this.doFornecedor = doFornecedor;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nFORNECEDOR"
                + "\n-----------------------------------"
                + "\nDescrição: " + getDescricao()
                + "\nNome: " + getNome()
                + getEndereco()
                + getDoFornecedor();
    }
}
