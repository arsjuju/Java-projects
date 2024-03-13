package associherex1;

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
            System.out.println("SISTEMA FUNCIONÁRIO");
            System.out.println("----------------------------------");
            System.out.println("1)Marceneiro");
            System.out.println("2)Engenheiro");
            System.out.println("3)Encerrar");
            System.out.println("Opção: ");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    Marceneiro mar = new Marceneiro("Roberto", "555673-2", "Decoração",
                            new Encomenda("Uma mesa de jantar", "Dia: 20/03", 500,
                                    new Material("Mogno", 20,
                                            new Fornecedor("Carlos", "656031-3")
                                    )));
                    System.out.println(mar);
                    break;
                case 2:
                    Engenheiro eng = new Engenheiro("Marcela", "000002-1",
                            new Obra("Uma pequena loja de 2 andares", "Pistão Sul",
                                    new Material("Tijolo", 1000,
                                            new Fornecedor("0531231-2", "Amanda")),
                                    new Cliente("Letícia", "667423401-1", "Taguatinga")));
                    System.out.println(eng);
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
