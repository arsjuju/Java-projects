package aula06;

/**
 *
 * @author 357510
 */
public class Porta {

    public double largura;
    public double altura;

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Porta(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;

    }

    @Override
    public String toString() {
        return "\nLargura: " + getLargura()
                + "\nAltura: " + getAltura();

    }

}
