package aula03;

/**
 *
 * @author 357510
 */
public class Veiculo {

    /* Declaração das variaveis de instancia da classe*/
    private int chassi;
    /* Declaração das variaveis de instancia da classe*/
    private int ano;

    /*Assinatura dos métodos de serviço (Classe Construtor)*/
    public Veiculo(int chassi, int ano) {

        /*Palavra-Chave para chamar construtores dentro de outros construtores, garantindo
         o acesso ao atributo*/
        this.chassi = chassi;
        this.ano = ano;
    }

    /**
     * @return the chassi
     */
    public int getChassi() {
        return chassi;
    }

    /**
     * @param chassi the chassi to set
     */
    public void setChassi(int chassi) {
        this.chassi = chassi;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }
}
