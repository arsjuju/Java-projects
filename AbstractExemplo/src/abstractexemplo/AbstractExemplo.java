package abstractexemplo;

import java.util.Scanner;

/**
 *
 * @author 357510
 */
public class AbstractExemplo {
   
    public static void main(String[] args) {
        
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        while (loop) {
            System.out.println("SISTEMA DE GERENCIAMENTO DE FUNCIONÁRIOS");
            System.out.println("----------------------------------");
            System.out.println("1)PROFESSOR");
            System.out.println("2)EMPREGADO");
            System.out.println("3)Encerrar");
            System.out.println("Opção: ");
            int op = sc.nextInt();
            switch (op) {
                case 1:

                    Professor pro = new Professor("Mestre", "Matemática", "Carlos", 250.00, 5000.00,
        new Filiacao("Roberto", "Joana"));
        
        System.out.println(pro);

                    break;
                case 2:
                    Empregado emp = new Empregado("654654", "Suporte", "Charles", 150.00, 3000.00,
        new Filiacao("Pedro", "Samira"));
        
        System.out.println(emp);

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
