package exinterface2;

public class Impressao extends Servico {

    double valorImpressao;

    public double getValorImpressao() {
        return valorImpressao;
    }

    public void setValorImpressao(double valorImpressao) {
        this.valorImpressao = valorImpressao;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Impressao(double valorImpressao, String nome) {
        super(nome);
        this.valorImpressao = valorImpressao;
    }

    @Override
    public double totalPagar() {
        return valorImpressao * Cliente.qtdPaginaImpressa;

    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nIMPRESSÃO"
                + "\n-----------------------------------"
                + "\nTotal à Pagar: " + totalPagar()
                + "\n-----------------------------------";
    }
}
