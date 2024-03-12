package aula07;

/**
 *
 * @author 357510
 */
public class Editora {

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

    public Editora(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;

    }

@Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DA EDITORA"
                + "\n-----------------------------------"
                + "\nNome: " + getNome()
                + "\nEndereço: " + getEndereco()
                + "\n-----------------------------------";
    }
}
