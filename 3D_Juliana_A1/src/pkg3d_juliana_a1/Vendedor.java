package pkg3d_juliana_a1;

/**
 *
 * @author 357510
 */
public class Vendedor extends Pessoa {

    public double comissao;
    public ContraCheque contraCheque;
    Produto produto;

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public ContraCheque getContraCheque() {
        return contraCheque;
    }

    public void setContraCheque(ContraCheque contraCheque) {
        this.contraCheque = contraCheque;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Vendedor(String nome, double comissao, ContraCheque contraCheque, Produto produto) {
        super(nome);
        this.comissao = comissao;
        this.contraCheque = contraCheque;
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO VENDEDOR"
                + "\n-----------------------------------"
                + "\nNome: " + getNome()
                + "\nComissão: " + getComissao()
                + "\nContra-Cheque:" + getContraCheque()
                + "\nProduto:" + getProduto();
    }
}
