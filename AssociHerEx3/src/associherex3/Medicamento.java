/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associherex3;

/**
 *
 * @author 357510
 */
public class Medicamento extends Produto {

    public String tarja;
    public String doenca;

    public String getTarja() {
        return tarja;
    }

    public void setTarja(String tarja) {
        this.tarja = tarja;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    public Medicamento(String codigo, String nome, double preco, Fornecedor fornecedor, String tarja, String doenca) {
        super(codigo, nome, preco, fornecedor);
        this.tarja = tarja;
        this.doenca = doenca;

    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DO MEDICAMENTO"
                + "\n-----------------------------------"
                + "\nCódigo: " + getCodigo()
                + "\nNome: " + getNome()
                + "\nPreço: " + getPreco()
                + "\nFornecedor: " + getFornecedor()
                + "\nTarja: " + getTarja()
                + "\nDoença: " + getDoenca()
                + "\n-----------------------------------";
    }
}
