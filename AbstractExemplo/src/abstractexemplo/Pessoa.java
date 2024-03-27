package abstractexemplo;

/**
 *
 * @author 357510
 */
public abstract class Pessoa {

    private String nome;
    private double gratificacao, salario;
    private Filiacao filiacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Filiacao getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(Filiacao filiacao) {
        this.filiacao = filiacao;
    }

    public Pessoa(String nome, double gratificacao, double salario, Filiacao filiacao) {
        this.nome = nome;
        this.gratificacao = gratificacao;
        this.salario = salario;
        this.filiacao = filiacao;
    }

    public abstract double salarioFinal();

}
