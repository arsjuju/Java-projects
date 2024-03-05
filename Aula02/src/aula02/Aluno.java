package aula02;

/**
 *
 * @author 357510
 */

/*Palavra-chave extends é usada para indicar 
    que uma dada classe herda de outra.*/
public class Aluno extends Pessoa {

    /* Declaração das variaveis de instancia da classe*/
    private int matricula;

    /*Assinatura dos métodos de serviço (Classe Construtor)*/
    public Aluno(String nome, String cpf, int matricula) {

        /*Palavra-Chave usada para acessar a superclasse de uma classe*/
        super(nome, cpf);

        /*Palavra-Chave para chamar construtores dentro de outros construtores, garantindo
         o acesso ao atributo*/
        this.matricula = matricula;
    }

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
