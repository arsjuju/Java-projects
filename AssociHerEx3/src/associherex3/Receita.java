/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package associherex3;

/**
 *
 * @author 357510
 */
public class Receita {

    public String data;
    public double valor;
    public Medicamento medicamento;
    public Farmaceutico farmaceutico;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public Farmaceutico getFarmaceutico() {
        return farmaceutico;
    }

    public void setFarmaceutico(Farmaceutico farmaceutico) {
        this.farmaceutico = farmaceutico;
    }

    public Receita(String data, double valor, Medicamento medicamento, Farmaceutico farmaceutico) {
        this.data = data;
        this.valor = valor;
        this.medicamento = medicamento;
        this.farmaceutico = farmaceutico;

    }

    @Override
    public String toString() {
        return "\n-----------------------------------"
                + "\nDADOS DA RECEITA"
                + "\n-----------------------------------"
                + "\nData: " + getData()
                + "\nValor: " + getValor()
                + "\nMedicamento: " + getMedicamento()
                + "\nFarmaceutico: " + getFarmaceutico()
                + "\n-----------------------------------";
    }
}
