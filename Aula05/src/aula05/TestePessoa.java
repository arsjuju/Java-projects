package aula05;

import java.util.Scanner;

/**
 *
 * @author 357510
 */
public class TestePessoa {

    public static void main(String[] args) {

        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        while (loop) {
            System.out.println("SISTEMA REGISTRO EMPRESA");
            System.out.println("----------------------------------");
            System.out.println("1)Pessoa Física");
            System.out.println("2)Pessoa Jurídica");
            System.out.println("3)Vendedor");
            System.out.println("4)Diretor");
            System.out.println("5)Fornecedor");
            System.out.println("6)Encerrar");
            System.out.println("Opção: ");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    PessoaFisica pfi = new PessoaFisica("Juliana", "Recanto", 17, "9999999-1");
                    System.out.println(pfi);
                    break;
                case 2:
                    PessoaJuridica pju = new PessoaJuridica("Micaelllla", "Recanto", 16, "9999999-2");
                    System.out.println(pju);
                    break;
                case 3:
                    Vendedor ven = new Vendedor("Ketlen", "Guará", 38961, 10000, "Sapatos", 150, 1500);
                    System.out.println(ven);
                    break;
                case 4:
                    Diretor dir = new Diretor("Jackes", "Taguatinga", 32133, 20000, 0.35);
                    System.out.println(dir);
                    break;
                case 5:
                    Fornecedor frn = new Fornecedor("Janaina", "Recanto", "32354-3", "Brasil");

                    System.out.println(frn);
                    break;
                case 6:
                    System.out.println("\nPrograma Encerrado");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nOpção Inválida. Tente novamente!");
            }
        }
    }
}
