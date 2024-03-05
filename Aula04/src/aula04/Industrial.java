package aula04;

/**
 *
 * @author 357510
 */
public class Industrial extends Fogao {

    /* Declaração das variaveis de instancia da classe*/
    private double profundidade;

    /*Assinatura dos métodos de serviço (Classe Construtor)*/
    public Industrial(int numeSerie, int peso, String marca, String nome, int qtdBocas, double largura, double profundidade) {

        /*Palavra-Chave usada para acessar a superclasse de uma classe*/
        super(numeSerie, peso, marca, nome, qtdBocas, largura);

        /*Palavra-Chave para chamar construtores dentro de outros construtores, garantindo
         o acesso ao atributo*/
        this.profundidade = profundidade;

    }

    @Override
    public void cadastra() {
        System.out.println("Entre com a Profundidade: ");
        double Profundidade = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "\nPROFUNDIDADE: " + getProfundidade();
    }

    /**
     * @return the profundidade
     */
    public double getProfundidade() {
        return profundidade;
    }

    /**
     * @param profundidade the profundidade to set
     */
    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }
}
