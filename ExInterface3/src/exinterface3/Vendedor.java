package exinterface3;

public class Vendedor extends Funcionario implements PercentInss, Pagamento {

    private int idade;
    private Cliente cliente;
    private Medicamento medicamento;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    @Override
    public String getMat() {
        return mat;
    }

    @Override
    public void setMat(String mat) {
        this.mat = mat;
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

    @Override
    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Vendedor(int idade, Cliente cliente, Medicamento medicamento, String mat, String nome, double salario, Endereco endereco) {
        super(mat, nome, salario, endereco);
        this.idade = idade;
        this.cliente = cliente;
        this.medicamento = medicamento;
    }

    public static double comissao() {
        return DoCliente.preco * PERCVENDEDOR;
    }

    @Override
    public double Inss() {
        return salario * PERCVENDEDOR;
    }

    @Override
    public double salarioFinal() {
        return salario + comissao() - (salario * PERCVENDEDOR);
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nVENDEDOR"
                + "\n-----------------------------------"
                + "\nIdade: " + getIdade()
                + "\nMatrícula: " + getMat()
                + "\nNome: " + getNome()
                + "\nINSS: " + Inss()
                + "\nSalário Final: " + salarioFinal()
                + getCliente()
                + getMedicamento()
                + getEndereco();
    }
}
