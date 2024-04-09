package exinterface1;

public class Circulo extends FiguraGeometrica implements ObjetoGeometrico {

    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circulo(double raio, String nome) {
        super(nome);
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return Math.PI * (raio * raio);

    }

    @Override
    public double calculaPerimetro() {
        return (2 * Math.PI) * raio;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nCÍRCULO"
                + "\n-----------------------------------"
                + "\nRaio: " + getRaio()
                + "\nNome: " + getNome()
                + "\nCalculo da Área: " + calculaArea()
                + "\nCalculo do Perímetro: " + calculaPerimetro()
                + "\n-----------------------------------";
    }
}
