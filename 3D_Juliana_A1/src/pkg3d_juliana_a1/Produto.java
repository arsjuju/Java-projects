package pkg3d_juliana_a1;

/**
 *
 * @author 357510
 */
public class Produto {

    public int codigo;
    public String nome;
    public double valor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Produto(int codigo, String nome, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO PRODUTO"
                + "\n-----------------------------------"
                + "\nCódigo: " + getCodigo()
                + "\nNome: " + getNome()
                + "\nValor: " + getValor()
                + "\n-----------------------------------";

    }
}
