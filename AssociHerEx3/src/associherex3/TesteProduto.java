/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package associherex3;

import java.util.Scanner;

/**
 *
 * @author 357510
 */
public class TesteProduto {

    public static void main(String[] args) {

        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        while (loop) {
            System.out.println("SISTEMA DE COMPRAS");
            System.out.println("----------------------------------");
            System.out.println("1)Receita");
            System.out.println("2)Pedido");
            System.out.println("3)Compra");
            System.out.println("4)Encerrar");
            System.out.println("Opção: ");
            int op = sc.nextInt();
            switch (op) {
                case 1:

                    Receita rec = new Receita("Dia 1° de Março", 50,
                            new Medicamento("7897595605092", "Fluoxetina", 50,
                                    new Fornecedor("356986-590", "Asa Sul", "Roberto"), "Vermelha", "Depressão"),
                            new Farmaceutico(2050, "Isabela", 2500, "Farmácia"));

                    System.out.println(rec);
                    break;
                case 2:
                    Pedido ped = new Pedido(138, 140,
                            new Atendente(3614, "Janaína", 1500, 22),
                            new Perfumaria("80672", "Máscara de Cílios", 32,
                                    new Fornecedor("13125343-20", "Taguatinga", "Thiago"), 5, "Cosméticos"));
                    System.out.println(ped);
                    break;
                case 3:
                    Compra com = new Compra(132, "20 de Abril", 140,
                            new Pagamento("Cartão de Crédito"),
                            new Cliente("665984232-00", "Ana", "05/10/1995",
                                    new Pedido(138, 140,
                                            new Atendente(3614, "Janaína", 1500, 22),
                                            new Perfumaria("80672", "Máscara de Cílios", 32,
                                                    new Fornecedor("13125343-20", "Taguatinga", "Thiago"), 5, "Cosméticos"))));
                    System.out.println(com);
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
