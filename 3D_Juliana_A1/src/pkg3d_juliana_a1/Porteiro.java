package pkg3d_juliana_a1;

/**
 *
 * @author 357510
 */
public class Porteiro extends Pessoa {

    public String turno;
    public double salario;
    public ContraCheque contraCheque;

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ContraCheque getContraCheque() {
        return contraCheque;
    }

    public void setContraCheque(ContraCheque contraCheque) {
        this.contraCheque = contraCheque;
    }

    public Porteiro(String nome, String turno, double salario, ContraCheque contraCheque) {
        super(nome);
        this.turno = turno;
        this.salario = salario;
        this.contraCheque = contraCheque;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO PORTEIRO"
                + "\n-----------------------------------"
                + "\nNome: " + getNome()
                + "\nTurno: " + getTurno()
                + "\nSalário: " + getSalario()
                + "\nContra-Cheque:: " + getContraCheque();
    }
}
