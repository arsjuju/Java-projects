package associherex2;

/**
 *
 * @author 357510
 */
public class OrgaoPublico {

    public String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public OrgaoPublico(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO ORGÃO PÚBLICO"
                + "\n-----------------------------------"
                + "\nNome: " + getNome()
                + "\n-----------------------------------";
    }
}
