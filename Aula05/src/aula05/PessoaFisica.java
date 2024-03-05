package aula05;

/**
 *
 * @author 357510
 */
public class PessoaFisica extends Cliente {

    public String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public PessoaFisica(String nome, String endereco, int idade, String cpf) {
        super(nome, endereco, idade);

        this.cpf = cpf;

    }

    @Override
    public String toString() {

        return "\nDADOS PESSOA FÍSICA"
                + "\nNOME: " + getNome()
                + "\nENDEREÇO: " + getEndereco()
                + "\nIDADE: " + getIdade()
                + "\nCPF: " + getCpf();
    }
}
