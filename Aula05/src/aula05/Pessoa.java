package aula05;

/**
 *
 * @author 357510
 */
public class Pessoa {

    public String nome;
    public String endereco;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Pessoa(String nome, String endereco) {

        this.nome = nome;
        this.endereco = endereco;

    }

}
