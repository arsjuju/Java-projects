package aula02;

/**
 *
 * @author 357510
 */

/*Palavra-chave extends é usada para indicar 
    que uma dada classe herda de outra.*/
public class Professor extends Pessoa {

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /* Declaração das variaveis de instancia da classe*/
    private double salario;

    /*Assinatura dos métodos de serviço (Classe Construtor)*/
    public Professor(String nome, String cpf, double salario) {

        /*Palavra-Chave usada para acessar a superclasse de uma classe*/
        super(nome, cpf);
        this.salario = salario;

    }

}
