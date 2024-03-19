/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associherex4;

/**
 *
 * @author 357510
 */
public class DeLojas extends Setor {

    public String descricao;
    public DeUtilidades deUtilidades;
    public DeCalcados deCalcados;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public DeUtilidades getDeUtilidades() {
        return deUtilidades;
    }

    public void setDeUtilidades(DeUtilidades deUtilidades) {
        this.deUtilidades = deUtilidades;
    }

    public DeCalcados getDeCalcados() {
        return deCalcados;
    }

    public void setDeCalcados(DeCalcados deCalcados) {
        this.deCalcados = deCalcados;
    }

    public DeLojas(int numero, String descricao, DeUtilidades deUtilidades, DeCalcados deCalcados) {
        super(numero);
        this.descricao = descricao;
        this.deUtilidades = deUtilidades;
        this.deCalcados = deCalcados;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS SETOR DE LOJAS"
                + "\n-----------------------------------"
                + "\nNumero: " + getNumero()
                + "\nDescrição: " + getDescricao()
                + "\nLoja de Utilidades: " + getDeUtilidades()
                + "\nLoja de Calçados: " + getDeCalcados();
    }
}
