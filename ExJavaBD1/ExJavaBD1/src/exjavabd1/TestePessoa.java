package exjavabd1;

import java.util.Scanner;

public class TestePessoa {

    public static void main(String[] args) {
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        while (loop) {
            System.out.println("SISTEMA CADASTRO PESSOA");
            System.out.println("----------------------------------");
            System.out.println("1)PESSOA FÍSICA");
            System.out.println("2)PESSOA JURÍDICA");
            System.out.println("3)Encerrar");
            System.out.println("Opção: ");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    Fisica f = new Fisica("Arthur", 24, 26325, "772633522-30",
                            new Atendente(203, 2030, "Amanda"));
                    System.out.println(f);
                    break;
                case 2:
                    Juridica j = new Juridica("Samantha", 34, 26853, "15485645",
                            new Atendente(163, 1256, "Rafael"));
                    System.out.println(j);
                    break;

                case 3:
                    System.out.println("\nPrograma Encerrado");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nOpção Inválida. Tente novamente!");
            }
        }

    }

}
