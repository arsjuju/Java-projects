package exinterface3;

public class Entregador extends Funcionario implements PercentInss, Pagamento {

    private String veiculoUtilizado;
    private Medicamento medicamento;

    public String getVeiculoUtilizado() {
        return veiculoUtilizado;
    }

    public void setVeiculoUtilizado(String veiculoUtilizado) {
        this.veiculoUtilizado = veiculoUtilizado;
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

    public Entregador(String veiculoUtilizado, Medicamento medicamento, String mat, String nome, double salario, Endereco endereco) {
        super(mat, nome, salario, endereco);
        this.veiculoUtilizado = veiculoUtilizado;
        this.medicamento = medicamento;
    }

    @Override
    public double Inss() {
        return salario * PERCENTREGADOR;
    }

    @Override
    public double salarioFinal() {
        return salario - (salario * PERCENTREGADOR);
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nVENDEDOR"
                + "\n-----------------------------------"
                + "\nVeículo Utilizado: " + getVeiculoUtilizado()
                + "\nMatrícula: " + getMat()
                + "\nNome: " + getNome()
                + "\nINSS: " + Inss()
                + "\nSalário Final: " + salarioFinal()
                + getMedicamento()
                + getEndereco();
    }
}
