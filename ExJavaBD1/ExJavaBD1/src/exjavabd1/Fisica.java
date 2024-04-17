package exjavabd1;

public class Fisica extends Pessoa {

    private int id_fisica;
    private String cpf;
    private Atendente atendente;

    public int getId_fisica() {
        return id_fisica;
    }

    public void setId_fisica(int id_fisica) {
        this.id_fisica = id_fisica;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
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
    public int getIdade() {
        return idade;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Fisica(String nome, int idade, int id_fisica, String cpf, Atendente atendente) {
        super(nome, idade);
        this.id_fisica = id_fisica;
        this.cpf = cpf;
        this.atendente = atendente;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DA PESSOA FÍSICA"
                + "\n-----------------------------------"
                + "\nNome: " + getNome()
                + "\nIdade " + getIdade()
                + "\nID: " + getId_fisica()
                + "\nCpf: " + getCpf()
                + getAtendente();
    }
}
