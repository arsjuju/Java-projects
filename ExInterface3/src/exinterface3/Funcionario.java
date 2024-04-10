package exinterface3;

public abstract class Funcionario {

    protected String mat;
    protected String nome;
    protected double salario;
    protected Endereco endereco;

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Funcionario(String mat, String nome, double salario, Endereco endereco) {
        this.mat = mat;
        this.nome = nome;
        this.salario = salario;
        this.endereco = endereco;
    }

    @Override
    public abstract String toString();

    public abstract double Inss();
}
