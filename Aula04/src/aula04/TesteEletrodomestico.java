package aula04;

import java.util.Scanner;

/**
 * Escola Técnica de Brasília - ETB Cursos Técnico de Informática Linguagem
 * Técnica de Programação 1 Autor: Juliana Pereira da Rocha Data: 05.03.2024
 * Objetivo: Programar um diagrama.
 */
public class TesteEletrodomestico {

    /*O método "main" é considerada a classe principal 
    do programa e é o ponto de entrada para a execução do programa.*/
    public static void main(String[] args) {

        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        while (loop) {
            System.out.println("SISTEMA REGISTRO ELETRODOMÉSTICO");
            System.out.println("----------------------------------");
            System.out.println("1)Maquina de Lavar");
            System.out.println("2)Televisão");
            System.out.println("3)Fogão");
            System.out.println("4)Encerrar");
            System.out.println("Opção: ");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    Eletrodomestico maq = new MaquinaLavar(0, 0, null, null, null, null);
                    maq.cadastra();
                    maq.toString();
                    break;
                case 2:
                    Eletrodomestico tele = new Televisao(0, 0, null, null, 0, null);
                    tele.cadastra();
                    tele.toString();
                    break;
                case 3:
                    Eletrodomestico fog = new Fogao(0, 0, null, null, 0, 0);
                    Domestico dom = new Domestico(0, 0, null, null, 0, 0, null);
                    Industrial ind = new Industrial(0, 0, null, null, 0, 0, 0);
                    fog.cadastra();
                    dom.cadastra();
                    ind.cadastra();

                    dom.toString();
                    fog.toString();
                    ind.toString();
                    break;
                case 4:
                    System.out.println("\nPrograma Encerrado");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nOpção Inválida. Tente novamente!");
            }
        }
    }

}
