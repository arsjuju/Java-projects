package exinterface1;

public class TesteMatematica {

    public static void main(String[] args) {
        Matematica m = new Matematica(133,
                new AplicacaoPratica("Parte da matemática que se destina ao estudo das medidas, posições e propriedades "
                        + "\nDas coisas que existem e suas diversas formas.",
                        new Circulo(2.59, "Círculo"),
                        new Retangulo(20.0, 30.0, "Retângulo"),
                        new Quadrado(4, "Quadrado")), "Geometrica");

        System.out.println(m);
    }

}
