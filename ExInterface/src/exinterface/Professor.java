package exinterface;

public class Professor extends Pessoa implements Imprimivel, EstadoOrigem {

    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Professor(String titulo, String nome, double salario) {
        super(nome, salario);
        this.titulo = titulo;
    }

    @Override
    public double calculaSalario() {
        return salario + GRATIFICACAO;
    }

    @Override
    public String toString() {
        return "\nDados:"
                + "\nNome: " + getNome()
                + "\nSalário: " + getSalario()
                + "\nTítulo: " + getTitulo()
                + "\nValor Salário: " + calculaSalario()
                + "\nCidade: " + CIDADE
                + "\nEstado: " + ESTADO;
    }
}
