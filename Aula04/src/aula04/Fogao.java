package aula04;

/**
 *
 * @author 357510
 */
public class Fogao extends Eletrodomestico {

    /* Declaração das variaveis de instancia da classe*/
    private int qtdBocas;
    /* Declaração das variaveis de instancia da classe*/
    private double largura;


    /*Assinatura dos métodos de serviço (Classe Construtor)*/
    public Fogao(int numeSerie, int peso, String marca, String nome, int qtdBocas, double largura) {

        /*Palavra-Chave usada para acessar a superclasse de uma classe*/
        super(numeSerie, peso, marca, nome);

        /*Palavra-Chave para chamar construtores dentro de outros construtores, garantindo
         o acesso ao atributo*/
        this.qtdBocas = qtdBocas;
        this.largura = largura;
    }

    @Override
    public void cadastra() {
        super.cadastra();
        System.out.println("Entre com a Quantidade de Bocas: ");
        int qtdBocas = sc.nextInt();
        System.out.println("Entre com a Largura: ");
        double largura = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "\nQUANTIDADE DE BOCAS: " + getQtdBocas()
                + "\nLARGURA: " + getLargura();
    }

    /**
     * @return the qtdBocas
     */
    public int getQtdBocas() {
        return qtdBocas;
    }

    /**
     * @param qtdBocas the qtdBocas to set
     */
    public void setQtdBocas(int qtdBocas) {
        this.qtdBocas = qtdBocas;
    }

    /**
     * @return the largura
     */
    public double getLargura() {
        return largura;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(double largura) {
        this.largura = largura;
    }

}
