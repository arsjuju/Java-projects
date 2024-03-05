package aula03;

/**
 *
 * @author 357510
 */

/*Palavra-chave extends é usada para indicar 
    que uma dada classe herda de outra.*/
public class Leve extends Veiculo {

    /* Declaração das variaveis de instancia da classe*/
    private String nome;
    private int capacidadeCarga;

    /*Assinatura dos métodos de serviço (Classe Construtor)*/
    public Leve(int chassi, int ano, String nome, int capacidadeCarga) {

        /*Palavra-Chave usada para acessar a superclasse de uma classe*/
        super(chassi, ano);

        /*Palavra-Chave para chamar construtores dentro de outros construtores, garantindo
         o acesso ao atributo*/
        this.nome = nome;
        this.capacidadeCarga = capacidadeCarga;
    }

    public String toString() {
        return "\nDADOS VEÍCULO LEVE"
                + "\nCHASSI: " + getChassi()
                + "\nANO: " + getAno()
                + "\nNOME: " + getNome()
                + "\nCAPACIDADE DE CARGA: " + getCapacidadeCarga();
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the capacidadeCarga
     */
    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    /**
     * @param capacidadeCarga the capacidadeCarga to set
     */
    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
}
