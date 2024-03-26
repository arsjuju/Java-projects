package pkg3d_juliana_a1;

/**
 *
 * @author 357510
 */
public class Visitante extends Pessoa {

    public String rg;
    public String endereco;

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Visitante(String nome, String rg, String endereco) {
        super(nome);
        this.rg = rg;
        this.endereco = endereco;

    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO VISITANTE"
                + "\n-----------------------------------"
                + "\nNome: " + getNome()
                + "\nRG: " + getRg()
                + "\nEndereço: " + getEndereco()
                + "\n-----------------------------------";
    }
}
