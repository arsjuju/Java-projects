package exinterface1;

public class Retangulo extends FiguraGeometrica implements ObjetoGeometrico {

    private double ladoMenor;
    private double ladoMaior;

    public double getLadoMenor() {
        return ladoMenor;
    }

    public void setLadoMenor(double ladoMenor) {
        this.ladoMenor = ladoMenor;
    }

    public double getLadoMaior() {
        return ladoMaior;
    }

    public void setLadoMaior(double ladoMaior) {
        this.ladoMaior = ladoMaior;
    }

    public Retangulo(double ladoMenor, double ladoMaior, String nome) {
        super(nome);
        this.ladoMenor = ladoMenor;
        this.ladoMaior = ladoMaior;
    }

    @Override
    public double calculaArea() {
        return ladoMenor * ladoMaior;
    }

    @Override
    public double calculaPerimetro() {
        return ((2 * ladoMenor) + (2 * ladoMaior));

    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nRETÂNGULO"
                + "\n-----------------------------------"
                + "\nLado Menor: " + getLadoMenor()
                + "\nLado Maior: " + getLadoMaior()
                + "\nNome: " + getNome()
                + "\nCalculo da Área: " + calculaArea()
                + "\nCalculo do Perímetro: " + calculaPerimetro()
                + "\n-----------------------------------";
    }
}
