package exinterface1;

public class AplicacaoPratica {

    private String descricao;
    Circulo circulo;
    Retangulo retangulo;
    Quadrado quadrado;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Circulo getCirculo() {
        return circulo;
    }

    public void setCirculo(Circulo circulo) {
        this.circulo = circulo;
    }

    public Retangulo getRetangulo() {
        return retangulo;
    }

    public void setRetangulo(Retangulo retangulo) {
        this.retangulo = retangulo;
    }

    public Quadrado getQuadrado() {
        return quadrado;
    }

    public void setQuadrado(Quadrado quadrado) {
        this.quadrado = quadrado;
    }

    public AplicacaoPratica(String descricao, Circulo circulo, Retangulo retangulo, Quadrado quadrado) {
        this.descricao = descricao;
        this.circulo = circulo;
        this.retangulo = retangulo;
        this.quadrado = quadrado;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nAPLICAÇÃO PRÁTICA"
                + "\n-----------------------------------"
                + "\nDescrição: " + getDescricao()
                + getCirculo()
                + getRetangulo()
                + getQuadrado();

    }
}
