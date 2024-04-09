package exinterface1;

public class Quadrado extends FiguraGeometrica implements ObjetoGeometrico {

    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Quadrado(double lado, String nome) {
        super(nome);
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return lado * lado;
    }

    @Override
    public double calculaPerimetro() {
        return (4 * lado);
    }

    @Override
    public String toString() {

        return "\n-----------------------------------"
                + "\nQUADRADO"
                + "\n-----------------------------------"
                + "\nLado: " + getLado()
                + "\nNome: " + getNome()
                + "\nCalculo da Área: " + calculaArea()
                + "\nCalculo do Perímetro: " + calculaPerimetro()
                + "\n-----------------------------------";
    }
}
