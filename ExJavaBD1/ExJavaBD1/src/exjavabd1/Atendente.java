package exjavabd1;

public class Atendente {

    private int id_atendente, matricula;
    private String nome;

    public int getId_atendente() {
        return id_atendente;
    }

    public void setId_atendente(int id_atendente) {
        this.id_atendente = id_atendente;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Atendente(int id_atendente, int matricula, String nome) {
        this.id_atendente = id_atendente;
        this.matricula = matricula;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO ATENDENTE"
                + "\n-----------------------------------"
                + "\nID: " + getId_atendente()
                + "\nMatrícula: " + getMatricula()
                + "\nNome: " + getNome()
                + "\n-----------------------------------";
    }
}
