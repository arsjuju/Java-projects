/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package associherex2;

/**
 *
 * @author 357510
 */
public class Efetivo extends Funcionario {

    public double salario;
    public OrgaoPublico orgaoPublico;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public OrgaoPublico getOrgaoPublico() {
        return orgaoPublico;
    }

    public void setOrgaoPublico(OrgaoPublico orgaoPublico) {
        this.orgaoPublico = orgaoPublico;
    }

    public Efetivo(String nome, Formacao formacao, Endereco endereco, OrgaoPublico orgaoPublico, double salario) {
        super(nome, formacao, endereco);
        this.salario = salario;
        this.orgaoPublico = orgaoPublico;
    }
}
