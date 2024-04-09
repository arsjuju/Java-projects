package exinterface2;

import java.util.Scanner;

public class TestePessoa {

    public static void main(String[] args) {
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        while (loop) {
            System.out.println("SISTEMA DE DADOS EMPRESA");
            System.out.println("----------------------------------");
            System.out.println("1)FUNCIONÁRIO");
            System.out.println("2)TÉCNICO");
            System.out.println("3)CLIENTE");
            System.out.println("4)Encerrar");
            System.out.println("Opção: ");
            int op = sc.nextInt();
            switch (op) {
                case 1:

                    Funcionario f = new Funcionario(3425, 650.00, "632515478", "João",
                            new Endereco("Rua 403", 5));

                    System.out.println(f);

                    break;
                case 2:

                    Tecnico t = new Tecnico("TC-5468", 780.43,
                            new Equipamento("Logitech", "800DPS"), "774564564", "Janaína",
                            new Endereco("Rua 604", 3));

                    System.out.println(t);

                    break;

                case 3:
                    Cliente c = new Cliente(125.30, 16,
                            new Internet(9.43, "Vivo"),
                            new Impressao(2.50, "A4"), "216545412", "Carlos",
                            new Endereco("Rua 202", 11));

                    System.out.println(c);
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
