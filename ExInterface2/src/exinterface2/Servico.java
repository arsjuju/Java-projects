package exinterface2;

public abstract class Servico {

    protected String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Servico(String nome) {
        this.nome = nome;
    }

    public abstract double totalPagar();

    @Override
    public abstract String toString();
}
