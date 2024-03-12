package aula06;

/**
 *
 * @author 357510
 */
public class Residencia {

    public String endereco;
    public Porta porta;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Porta getPorta() {
        return porta;
    }

    public void setPorta(Porta porta) {
        this.porta = porta;
    }

    public Residencia(String endereco, Porta porta) {
        this.endereco = endereco;
        this.porta = porta;
    }

    @Override
    public String toString() {
        return "\nEndereço: " + getEndereco()
                + "\nPorta: " + getPorta();

    }
}
