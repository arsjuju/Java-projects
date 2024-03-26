package pkg3d_juliana_a1;

/**
 *
 * @author 357510
 */
public class Contrato {

    public int numero;
    public String descricao;
    public double valor;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Contrato(int numero, String descricao, double valor) {
        this.numero = numero;
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO CONTRATO"
                + "\n-----------------------------------"
                + "\nNumero: " + getNumero()
                + "\nDescrição: " + getDescricao()
                + "\nValor: " + getValor()
                + "\n-----------------------------------";

    }
}
