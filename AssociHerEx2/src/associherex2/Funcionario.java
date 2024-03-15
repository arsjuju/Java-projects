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
public class Funcionario {

    public String nome;
    public Formacao formacao;
    public Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Formacao getFormacao() {
        return formacao;
    }

    public void setFormacao(Formacao formacao) {
        this.formacao = formacao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Funcionario(String nome, Formacao formacao, Endereco endereco) {
        this.nome = nome;
        this.formacao = formacao;
        this.endereco = endereco;
    }
}
