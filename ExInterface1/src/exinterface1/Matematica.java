package exinterface1;

public class Matematica extends Disciplina {

    private double cargaHoraria;
    AplicacaoPratica aplicacaoPratica;

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public AplicacaoPratica getAplicacaoPratica() {
        return aplicacaoPratica;
    }

    public void setAplicacaoPratica(AplicacaoPratica aplicacaoPratica) {
        this.aplicacaoPratica = aplicacaoPratica;
    }

    public Matematica(double cargaHoraria, AplicacaoPratica aplicacaoPratica, String nome) {
        super(nome);
        this.cargaHoraria = cargaHoraria;
        this.aplicacaoPratica = aplicacaoPratica;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nMATEMÁTICA"
                + "\n-----------------------------------"
                + "\nNome: " + getNome()
                + "\nCarga Horária: " + getCargaHoraria()
                + "\nAplicação Prática: " + getAplicacaoPratica();

    }
}
