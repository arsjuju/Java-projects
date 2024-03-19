package associherex4;

import java.util.Scanner;

/**
 *
 * @author 357510
 */
public class TesteSetor {

    public static void main(String[] args) {

        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        while (loop) {
            System.out.println("SISTEMA DE GERENCIAMENTO DE LOJAS");
            System.out.println("----------------------------------");
            System.out.println("1)LOJAS DE UTILIDADES / CALÇADOS");
            System.out.println("2)LOJAS DE ALIMENTAÇÃO");
            System.out.println("3)Encerrar");
            System.out.println("Opção: ");
            int op = sc.nextInt();
            switch (op) {
                case 1:

                    DeLojas Loj = new DeLojas(10, "Lojas de Utilidades e Calçados",
                            new DeUtilidades(2, "Loja de Utilidades",
                                    new Atendente(321234, "Thiago", 2500), 500,
                                    new Box(150, "Uma caixa",
                                            new Locatorio("508231340", "Sebastião",
                                                    new Contrato(38, 10000),
                                                    new Endereco("Rua Limoeiro", "73607-50", 7)),
                                            new Produto(57, "Chave de Fenda", 37.88,
                                                    new Fornecedor("780313-20", "José",
                                                            new Endereco("Rua São Paulino", "782314-03", 10)))),
                                    new Cliente("66704923-00", "Janaína",
                                            new Endereco("Comercial Taguatinga", "895123-2", 23),
                                            new Produto(57, "Chave de Fenda", 37.88,
                                                    new Fornecedor("780313-20", "José",
                                                            new Endereco("Rua São Paulino", "782314-03", 10))))),
                            new DeCalcados(5, "Loja de Calçados",
                                    new Atendente(895023, "Júlia", 2500), "Tênis da melhor qualidade",
                                    new Cliente("77893245-50", "Paula",
                                            new Endereco("Rua Liberdade", "391309-32", 10),
                                            new Produto(88, "Tênis Preto Nike", 460.22,
                                                    new Fornecedor("321313-30", "Erick",
                                                            new Endereco("São Paulo", "2313213-3", 2))))));

                    System.out.println(Loj);

                    break;
                case 2:
                    Alimentacao Ali = new Alimentacao(6, 20,
                            new DeAlimentacao(15, "Lojas de Alimentação Brasileiras",
                                    new Atendente(695666, "Pedro", 1500), "Brasil",
                                    new Cliente("77824545-55", "Henrique",
                                            new Endereco("Rua Monjolo", "387824-2", 6),
                                            new Produto(53, "Jantinha de Churrasco", 27.23,
                                                    new Fornecedor("321313-30", "Erick",
                                                            new Endereco("São Paulo", "2313213-3", 2))))));

                    System.out.println(Ali);

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
