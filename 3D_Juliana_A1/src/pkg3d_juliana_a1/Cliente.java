package pkg3d_juliana_a1;

/**
 *
 * @author 357510
 */
public class Cliente extends Pessoa {

    public String cpf;
    public NotaFiscalCliente notaFiscalCliente;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public NotaFiscalCliente getNotaFiscalCliente() {
        return notaFiscalCliente;
    }

    public void setNotaFiscalCliente(NotaFiscalCliente notaFiscalCliente) {
        this.notaFiscalCliente = notaFiscalCliente;
    }

    public Cliente(String nome, String cpf, NotaFiscalCliente notaFiscalCliente) {
        super(nome);
        this.cpf = cpf;
        this.notaFiscalCliente = notaFiscalCliente;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO CLIENTE"
                + "\n-----------------------------------"
                + "\nNome:: " + getNome()
                + "\nCPF: " + getCpf()
                + "\nNota Fiscal: " + getNotaFiscalCliente();
    }
}
