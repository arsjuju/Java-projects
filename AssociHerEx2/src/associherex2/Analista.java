
package associherex2;

/**
 *
 * @author 357510
 */
public class Analista extends Efetivo {

    public String funcao;
    public double gratificacao;

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }

    public Analista(String nome, Formacao formacao, Endereco endereco, OrgaoPublico orgaoPublico, double salario, String funcao, double gratificacao) {
        super(nome, formacao, endereco, orgaoPublico, salario);
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO FUNCIONARIO ANALISTA"
                + "\n-----------------------------------"
                + "\nNome: " + getNome()
                + "\nFormação: " + getFormacao()
                + "\nEndereço: " + getEndereco()
                + "\nOrgão Público: " + getOrgaoPublico()
                + "\nSalário: " + getSalario()
                + "\nFunção: " + getFuncao()
                + "\nGratificação: " + getGratificacao()
                + "\n-----------------------------------";
    }
}
