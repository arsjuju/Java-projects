package abstractexemplo;

/**
 *
 * @author 357510
 */
public class Empregado extends Pessoa {

    private String matr, setor;

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Empregado(String matr, String setor, String nome, double gratificacao, double salario, Filiacao filiacao) {
        super(nome, gratificacao, salario, filiacao);
        this.matr = matr;
        this.setor = setor;
    }

    @Override
    public double salarioFinal() {
        return (getSalario() + getGratificacao());
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO EMPREGADO"
                + "\n-----------------------------------"
                + "\nNome: " + getNome()
                + "\nGratificação: " + getGratificacao()
                + "\nSalário: " + getSalario()
                + "\nSalario Final: " + salarioFinal()
                + "\n-----------------------------------"
                + "\nFiliação: " + getFiliacao()
                + "\nMatrícula: " + getMatr()
                + "\nSetor: " + getSetor()
                + "\n-----------------------------------";
    }
}
