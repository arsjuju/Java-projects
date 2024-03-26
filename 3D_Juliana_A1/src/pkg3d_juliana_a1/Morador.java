package pkg3d_juliana_a1;

/**
 *
 * @author 357510
 */
public class Morador extends Pessoa {

    public String rg;

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Morador(String nome, String rg) {
        super(nome);
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO MORADOR"
                + "\n-----------------------------------"
                + "\nNome: " + getNome()
                + "\nRG: " + getRg()
                + "\n-----------------------------------";
    }
}
