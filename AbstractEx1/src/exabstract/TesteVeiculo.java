package exabstract;

import java.util.Scanner;

/**
 *
 * @author 357510
 */
public class TesteVeiculo {

    public static void main(String[] args) {

        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        while (loop) {
            System.out.println("SISTEMA DE VEÍCULOS");
            System.out.println("----------------------------------");
            System.out.println("1)VEÍCULOS DE PASSEIO");
            System.out.println("2)ÔNIBUS");
            System.out.println("3)MOTOS");
            System.out.println("4)Encerrar");
            System.out.println("Opção: ");
            int op = sc.nextInt();
            switch (op) {
                case 1:

                    DePasseio dep = new DePasseio("POAC-5214", "Amarelo", 2020, 50000.00,
                            new Proprietario("6625871950-10", "James",
                                    new Endereco("Rua 304", 5)), "Fiat", "Um carro de 6 portas",
                            new Montadora("958948-2", "Mom Montador",
                                    new Endereco("Rua 205", 2)));

                    System.out.println(dep);

                    break;
                case 2:
                    Onibus oni = new Onibus("KAKC-5640", "Preto", 2019, 70000.00,
                            new Proprietario("6625871950-10", "James",
                                    new Endereco("Rua 304", 5)), 100,
                            new Montadora("958948-2", "Mom Montador",
                                    new Endereco("Rua 205", 2)));
                    System.out.println(oni);

                    break;

                case 3:
                    Moto mot = new Moto("LOUP-9965", "Verde", 2022, 80000.00,
                            new Proprietario("6625871950-10", "James",
                                    new Endereco("Rua 304", 5)),
                            20);
                    System.out.println(mot);
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
