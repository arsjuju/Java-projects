package aula07;

import java.util.Scanner;

/**
 *
 * @author 357510
 */
public class TesteLivro {

    public static void main(String[] args) {

        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        while (loop) {
            System.out.println("SISTEMA REGISTRO BIBLIOTECA");
            System.out.println("----------------------------------");
            System.out.println("1)Livro Infantil");
            System.out.println("2)Livro de Drama");
            System.out.println("3)Livro de Suspense");
            System.out.println("4)Encerrar");
            System.out.println("Opção: ");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    Infantil inf = new Infantil("O Pequeno Príncipe",
                            new Autor("663987452-50", "Antoine de Saint"),
                            new Editora("HarperCollins", "Rio de Janeiro"), "6-8 Anos");
                    System.out.println(inf);
                    break;
                case 2:
                    Drama dra = new Drama("Tudo pelo Jogo",
                            new Autor("879954465-60", "Nora Sakavic"),
                            new Editora("Galera", "Rio de Janeiro"), "Só o que Neil Josten quer é fugir de um"
                            + "\n passado sangrento que o assombra aonde quer que vá. "
                            + "\n Escondido em uma cidade pequena, o único escape que tem é jogar Exy, o violento e"
                            + "\n popular esporte que atrai multidões. "
                            + "\n Mas Neil parece não ter apagado os seus rastros tão bem quanto imagina já que foi"
                            + "\n abordado por ninguém menos do que o treinador das Raposas,"
                            + "\n a infame equipe da universidade Palmetto State.");
                    System.out.println(dra);
                    break;
                case 3:
                    Suspense sus = new Suspense("Sherlock Holmes - Casos Extraordinários",
                            new Autor("696596487-20", "Arthur Conan Doyle"),
                            new Editora("FTD Educação", "Brasília"), 128);
                    System.out.println(sus);
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
