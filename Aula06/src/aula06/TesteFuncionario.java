package aula06;

/**
 *
 * @author 357510
 */
public class TesteFuncionario {

    public static void main(String[] args) {
        Funcionario fun = new Funcionario("123", "Juliana",
                new Veiculo("Fiat",
                        new Porta(2.10, 2)),
                new Residencia("Quadra 403, Conjunto 3",
                        new Porta(2.10, 0.60)));

        System.out.println(fun);
    }

}
