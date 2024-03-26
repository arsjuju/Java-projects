package pkg3d_juliana_a1;

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
            System.out.println("SISTEMA IMOBILIÁRIO");
            System.out.println("----------------------------------");
            System.out.println("1)Apartamento");
            System.out.println("2)Loja");
            System.out.println("3)Encerrar");
            System.out.println("Opção: ");
            int op = sc.nextInt();
            switch (op) {
                case 1:

                    Apartamento apa = new Apartamento(25, 2,
                            new Contrato(27853, "O Cliente deverá pagar o aluguel até o dia 5 de cada mês.", 700.00),
                            new Porteiro("Fabrício", "Noturno", 4000.00,
                                    new ContraCheque("26/03", 3675.00)),
                            new Morador("Júlia", "99864-304"),
                            new Visitante("Carlos", "21312-202", "Taguatinga"));

                    System.out.println(apa);

                    break;
                case 2:
                    Loja loj = new Loja("MustBuy", 27,
                            new Contrato(69875, "O Inquilino deve pagar o valor até dias 10 de cada mês, atraso é sujeito a juros.", 2500.00),
                            new Produto(772, "Alimento no Geral", 75.00),
                            new Vendedor("Ana Lúcia", 235.00,
                                    new ContraCheque("30/02", 1995.00),
                                    new Produto(772, "Alimento no Geral", 75.00)),
                            new Cliente("José", "662554231-00",
                                    new NotaFiscalCliente(10, 362.86,
                                            new Produto(772, "Alimento no Geral", 75.00))));

                    System.out.println(loj);

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
