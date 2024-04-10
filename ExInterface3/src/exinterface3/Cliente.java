package exinterface3;

public class Cliente {

    private String cpf;
    private String nome;
    private int idade;
    private Endereco endereco;
    private Medicamento medicamento;
    private DoCliente doCliente;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public DoCliente getDoCliente() {
        return doCliente;
    }

    public void setDoCliente(DoCliente doCliente) {
        this.doCliente = doCliente;
    }

    public Cliente(String cpf, String nome, int idade, Endereco endereco, Medicamento medicamento, DoCliente doCliente) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.medicamento = medicamento;
        this.doCliente = doCliente;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nCLIENTE"
                + "\n-----------------------------------"
                + "\nCpf: " + getCpf()
                + "\nNome: " + getNome()
                + "\nIdade " + getIdade()
                + getEndereco()
                + getMedicamento()
                + getDoCliente();

    }
}
