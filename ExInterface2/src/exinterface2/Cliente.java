package exinterface2;

public class Cliente extends Pessoa {

    private double horasGastas;
    protected static int qtdPaginaImpressa;
    Internet internet;
    Impressao impressao;

    public double getHorasGastas() {
        return horasGastas;
    }

    public void setHorasGastas(double horasGastas) {
        this.horasGastas = horasGastas;
    }

    public int getQtdPaginaImpressa() {
        return qtdPaginaImpressa;
    }

    public void setQtdPaginaImpressa(int qtdPaginaImpressa) {
        this.qtdPaginaImpressa = qtdPaginaImpressa;
    }

    public Internet getInternet() {
        return internet;
    }

    public void setInternet(Internet internet) {
        this.internet = internet;
    }

    public Impressao getImpressao() {
        return impressao;
    }

    public void setImpressao(Impressao impressao) {
        this.impressao = impressao;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Cliente(double horasGastas, int qtdPaginaImpressa, Internet internet, Impressao impressao, String cpf, String nome, Endereco endereco) {
        super(cpf, nome, endereco);
        this.horasGastas = horasGastas;
        this.qtdPaginaImpressa = qtdPaginaImpressa;
        this.internet = internet;
        this.impressao = impressao;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nCLIENTE"
                + "\n-----------------------------------"
                + "\nHoras Gastas: " + getHorasGastas()
                + "\nQuantidade de Páginas Impressas: " + getQtdPaginaImpressa()
                + getImpressao()
                + "\nCpf: " + getCpf()
                + "\nNome: " + getNome()
                + getEndereco();
    }
}
