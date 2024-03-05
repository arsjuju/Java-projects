package aula04;

/**
 *
 * @author 357510
 */
public class Televisao extends Eletrodomestico {

    /* Declaração das variaveis de instancia da classe*/
    private int polegadas;

    /* Declaração das variaveis de instancia da classe*/
    private String tipo;

    /*Assinatura dos métodos de serviço (Classe Construtor)*/
    public Televisao(int numeSerie, int peso, String marca, String nome, int polegadas, String tipo) {

        /*Palavra-Chave usada para acessar a superclasse de uma classe*/
        super(numeSerie, peso, marca, nome);

        /*Palavra-Chave para chamar construtores dentro de outros construtores, garantindo
         o acesso ao atributo*/
        this.polegadas = polegadas;
        this.tipo = tipo;
    }

    @Override
    public void cadastra() {
        super.cadastra();
        System.out.println("Entre com as Polegadas: ");
        int polegadas = sc.nextInt();
        System.out.println("Entre com o Tipo: ");
        String tipo = sc.next();
    }

    @Override
    public String toString() {
        return "\nTIPO: " + getTipo()
                + "\nPOLEGADAS: " + getPolegadas();
    }

    /**
     * @return the polegadas
     */
    public int getPolegadas() {
        return polegadas;
    }

    /**
     * @param polegadas the polegadas to set
     */
    public void setPolegadas(int polegadas) {
        this.polegadas = polegadas;
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
