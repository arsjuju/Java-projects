package abstractexemplo;

/**
 *
 * @author 357510
 */
public class Professor extends Pessoa {

    private String titulo, areaAtuacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public Professor(String titulo, String areaAtuacao, String nome, double gratificacao, double salario, Filiacao filiacao) {
        super(nome, gratificacao, salario, filiacao);
        this.titulo = titulo;
        this.areaAtuacao = areaAtuacao;
    }

    @Override
    public double salarioFinal() {
        return (getSalario() + (getSalario() * 0.1) + getGratificacao());
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO PROFESSOR"
                + "\n-----------------------------------"
                + "\nNome: " + getNome()
                + "\nGratificação: " + getGratificacao()
                + "\nSalário: " + getSalario()
                +"\nSalario Final: "+salarioFinal()
                + "\n-----------------------------------"
                + "\nFiliação: " + getFiliacao()
                + "\nTítulo: " + getTitulo()
                + "\nÁrea de Atuação: " + getAreaAtuacao()
                + "\n-----------------------------------";
    }
}
