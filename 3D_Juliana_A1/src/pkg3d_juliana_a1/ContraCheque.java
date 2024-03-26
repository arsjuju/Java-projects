package pkg3d_juliana_a1;

/**
 *
 * @author 357510
 */
public class ContraCheque {

    public String data;
    public double valor;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ContraCheque(String data, double valor) {
        this.data = data;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO CONTRA-CHEQUE"
                + "\n-----------------------------------"
                + "\nData: " + getData()
                + "\nValor: " + getValor()
                + "\n-----------------------------------";

    }
}
