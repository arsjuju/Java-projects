/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associherex1;

/**
 *
 * @author 357510
 */
public class Obra {

    public String descricao;
    public String endereco;
    public Material material;
    Cliente cliente;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Obra(String descricao, String endereco, Material material, Cliente cliente) {
        this.descricao = descricao;
        this.endereco = endereco;
        this.material = material;
        this.cliente = cliente;
    }

@Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DA OBRA"
                + "\n-----------------------------------"
                + "\nDescrição: " + getDescricao()
                + "\nEndereço: " + getEndereco()
                + "\nMaterial: " + getMaterial()
                + "\nCliente: " + getCliente()
                + "\n-----------------------------------";

    }
}
