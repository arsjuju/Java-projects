package exjavabd1;

public class Juridica extends Pessoa {

    private int id_juridica;
    private String cnpj;
    private Atendente atendente;

    public int getId_juridica() {
        return id_juridica;
    }

    public void setId_juridica(int id_juridica) {
        this.id_juridica = id_juridica;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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

    public Juridica(String nome, int idade, int id_juridica, String cnpj, Atendente atendente) {
        super(nome, idade);
        this.id_juridica = id_juridica;
        this.cnpj = cnpj;
        this.atendente = atendente;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DA PESSOA JURÍDICA"
                + "\n-----------------------------------"
                + "\nNome: " + getNome()
                + "\nIdade " + getIdade()
                + "\nID: " + getId_juridica()
                + "\nCnpj: " + getCnpj()
                + getAtendente();
    }
}
