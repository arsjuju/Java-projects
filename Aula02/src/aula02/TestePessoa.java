package aula02;

/**
 * Escola Técnica de Brasília - ETB Cursos Técnico de Informática Linguagem
 * Técnica de Programação 1 Autor: Juliana Pereira da Rocha Data: 27.02.2024
 * Objetivo: Programar um diagrama.
 */
public class TestePessoa {

    /*O método "main" é considerada a classe principal 
    do programa e é o ponto de entrada para a execução do programa.*/
    public static void main(String[] args) {

        /* Criar a instância do objeto na Classe Pessoa Aluno*/
        Pessoa pes = new Pessoa("Juliana", "1234567");
        Aluno alu = new Aluno(null, null, 1234);
        Professor pro = new Professor(null, null, 20000);
        Funcionario func = new Funcionario(null, null, "Admistrador");

        /*Invocação dos serviços da Classe Aluno*/
        System.out.println("NOME: " + pes.getNome()
                + "\nMATRICULA: " + alu.getMatricula()
                + "\nCPF: " + pes.getCpf()
                + "\nSALÁRIO: " + pro.getSalario()
                + "\nCARGO: " + func.getCargo());

    }

}
