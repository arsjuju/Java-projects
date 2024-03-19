/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associherex4;

/**
 *
 * @author 357510
 */
public class Locatorio {

    public String codigo;
    public String nome;
    public Contrato contrato;
    private Endereco endereco;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Locatorio(String codigo, String nome, Contrato contrato, Endereco endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.contrato = contrato;
        this.endereco=endereco;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO LOCATORIO"
                + "\n-----------------------------------"
                + "\nCódigo: " + getCodigo()
                + "\nNome: " + getNome()
                + "\nContrato: " + getContrato()
                 + "\nEndereço do Locatorio: " + getEndereco();
    }

}
