/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package associherex2;

import java.util.Scanner;

/**
 *
 * @author 357510
 */
public class TesteFuncionario {

    public static void main(String[] args) {
        
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        while (loop) {
            System.out.println("SISTEMA FUNCIONÁRIO");
            System.out.println("----------------------------------");
            System.out.println("1)Terceirizado");
            System.out.println("2)Analista");
            System.out.println("3)Técnico");
            System.out.println("4)Encerrar");
            System.out.println("Opção: ");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    Terceirizado ter = new Terceirizado("Roberto",
                            new Formacao("Ensino Médio Completo"),
                            new Endereco("Quadra 406", 3),
                            "Operador Excel");

                    System.out.println(ter);
                    break;
                case 2:
                    Analista ana = new Analista("James",
                            new Formacao("Análise e Desenvolvimento de Sistemas"),
                            new Endereco("Quadra 302", 5),
                            new OrgaoPublico("Gov"),
                            10000, "Análise de Requisitos", 15);
                    System.out.println(ana);
                    break;
                case 3:
                    Tecnico tec = new Tecnico("Carlos",
                            new Formacao("Engenharia de Software"),
                            new Endereco("Quadra 201", 2),
                            new OrgaoPublico("Gov"),
                            20000, "Programador", 200);
                    System.out.println(tec);
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
