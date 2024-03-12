/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package associex1;

/**
 *
 * @author Dell
 */
public class Parafuso {

    public String tamanho;
    public String tipoMaterial;
    public Fornecedor fornecedor;

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Parafuso(String tamanho, String tipoMaterial, Fornecedor fornecedor) {
        this.tamanho = tamanho;
        this.tipoMaterial = tipoMaterial;
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return "\nTamanho: " + getTamanho()
                + "\nTipo de Material: " + getTipoMaterial()+
                "\n------------------------------------"
                + "\nFornecedor: " + getFornecedor();
    }
}
