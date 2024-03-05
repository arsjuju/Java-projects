package aula04;

/**
 *
 * @author 357510
 */
public class Domestico extends Fogao {

    /* Declaração das variaveis de instancia da classe*/
    private String tipo;

    /*Assinatura dos métodos de serviço (Classe Construtor)*/
    public Domestico(int numeSerie, int peso, String marca, String nome, int qtdBocas, double largura, String tipo) {

        /*Palavra-Chave usada para acessar a superclasse de uma classe*/
        super(numeSerie, peso, marca, nome, qtdBocas, largura);

        /*Palavra-Chave para chamar construtores dentro de outros construtores, garantindo
         o acesso ao atributo*/
        this.tipo = tipo;

    }

    @Override
    public void cadastra() {
        System.out.println("Entre com o Tipo: ");
        String tipo = sc.next();
    }

    @Override
    public String toString() {
        return "\nTIPO: " + getTipo();
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
