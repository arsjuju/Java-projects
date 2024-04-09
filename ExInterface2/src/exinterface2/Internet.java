package exinterface2;

public class Internet extends Servico implements HoraExtra {

    private double valorHora;

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Internet(double valorHora, String nome) {
        super(nome);
        this.valorHora = valorHora;
    }

    @Override
    public double totalPagar() {
        return valorHora * QTDHORAEXTRA;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nINTERNET"
                + "\n-----------------------------------"
                + "\nTotal à Pagar: " + totalPagar();
    }
}
