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
public class Tecnico extends Efetivo {

    private String setor;
    private double auxTransporte;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getAuxTransporte() {
        return auxTransporte;
    }

    public void setAuxTransporte(double auxTransporte) {
        this.auxTransporte = auxTransporte;
    }

    public Tecnico(String nome, Formacao formacao, Endereco endereco, OrgaoPublico orgaoPublico, double salario, String setor, double auxTransporte) {
        super(nome, formacao, endereco, orgaoPublico, salario);
        this.setor = setor;
        this.auxTransporte = auxTransporte;
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
                + "\nSetor: " + getSetor()
                + "\nAuxílio Transporte: " + getAuxTransporte()
                + "\n-----------------------------------";
    }

}
