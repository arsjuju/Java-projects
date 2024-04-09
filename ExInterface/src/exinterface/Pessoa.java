package exinterface;

public abstract class Pessoa {

    protected String nome;
    protected double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Pessoa(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract double calculaSalario();
}
