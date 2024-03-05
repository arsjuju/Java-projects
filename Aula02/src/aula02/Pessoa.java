package aula02;

/**
 *
 * @author 357510
 */
public class Pessoa {

    /* Declaração das variaveis de instancia da classe*/
    private String nome;
    /* Declaração das variaveis de instancia da classe*/
    private String cpf;

    /*Assinatura dos métodos de serviço (Classe Construtor)*/
    public Pessoa(String nome, String cpf) {

        /*Palavra-Chave para chamar construtores dentro de outros construtores, garantindo
         o acesso ao atributo*/
        this.nome = nome;
        this.cpf = cpf;
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
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
