package associherex1;

/**
 *
 * @author 357510
 */
public class Marceneiro extends Pessoa {

    public String cnpj;
    public String areaAtuacao;
    public Encomenda encomenda;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public Encomenda getEncomenda() {
        return encomenda;
    }

    public void setEncomenda(Encomenda encomenda) {
        this.encomenda = encomenda;
    }

    public Marceneiro(String nome, String cnpj, String areaAtuacao, Encomenda encomenda) {
        super(nome);
        this.cnpj = cnpj;
        this.areaAtuacao = areaAtuacao;
        this.encomenda = encomenda;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO FUNCIONÁRIO - MARCENEIRO"
                + "\n-----------------------------------"
                + "\nNome: " + getNome()
                + "\nCpnj: " + getCnpj()
                + "\nArea de Atuação: " + getAreaAtuacao()
                + "\nEncomenda: " + getEncomenda()
                + "\n-----------------------------------";
    }

}
