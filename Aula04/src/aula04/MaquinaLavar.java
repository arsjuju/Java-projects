package aula04;

/**
 *
 * @author 357510
 */
public class MaquinaLavar extends Eletrodomestico {

    /* Declaração das variaveis de instancia da classe*/
    private String tipo;
    /* Declaração das variaveis de instancia da classe*/
    private String cor;

    /*Assinatura dos métodos de serviço (Classe Construtor)*/
    public MaquinaLavar(int numeSerie, int peso, String marca, String nome, String tipo, String cor) {

        /*Palavra-Chave usada para acessar a superclasse de uma classe*/
        super(numeSerie, peso, marca, nome);

        /*Palavra-Chave para chamar construtores dentro de outros construtores, garantindo
         o acesso ao atributo*/
        this.tipo = tipo;
        this.cor = cor;

    }

    @Override
    public void cadastra() {
        super.cadastra();
        System.out.println("Entre com o Tipo: ");
        String tipo = sc.next();
        System.out.println("Entre com a Cor: ");
        String cor = sc.next();
    }

    @Override
    public String toString() {
        return "\nTIPO: " + getTipo()
                + "\nCOR: " + getCor();
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

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }
}
