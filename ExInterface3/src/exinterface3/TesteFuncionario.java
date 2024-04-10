package exinterface3;

import java.util.Scanner;

public class TesteFuncionario {

    public static void main(String[] args) {
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        while (loop) {
            System.out.println("SISTEMA DE DADOS FUNCIPNÁRIOS");
            System.out.println("----------------------------------");
            System.out.println("1)VENDEDOR");
            System.out.println("2)ENTREGADOR");
            System.out.println("3)Encerrar");
            System.out.println("Opção: ");
            int op = sc.nextInt();
            switch (op) {
                case 1:

                    Vendedor v = new Vendedor(25,
                            new Cliente("12544513515", "Letícia", 23,
                                    new Endereco("Quadra 403", 6),
                                    new Medicamento("C21231", "Dipirona", 32.30,
                                            new Fornecedor("Fornece à 20 anos.", "Carlinhos",
                                                    new Endereco("Quadra 103", 11),
                                                    new DoFornecedor("Dipirona", "2024-02-12", 96.90, 3))),
                                    new DoCliente("Duas caixas de Dipirona", 32.30, 2)),
                            new Medicamento("D-4542", "Dipirona", 32.30,
                                    new Fornecedor("Fornece à 20 anos.", "Carlinhos",
                                            new Endereco("Quadra 103", 11),
                                            new DoFornecedor("Dipirona", "2024-02-12", 96.90, 3))), "V-65645", "Jorge", 2000.00,
                            new Endereco("Quadra 206", 9));

                    System.out.println(v);

                    break;
                case 2:

                    Entregador e = new Entregador("Moto",
                            new Medicamento("C21231", "Dipirona", 32.30,
                                    new Fornecedor("Fornece à 20 anos.", "Carlinhos",
                                            new Endereco("Quadra 103", 11),
                                            new DoFornecedor("Dipirona", "2024-02-12", 96.90, 3))), "E-21323", "Jonathan", 1500.00,
                            new Endereco("Quadra 101", 16));

                    System.out.println(e);

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
