package aula04;

import java.util.Scanner;

/**
 *
 * @author 357510
 */
public class Eletrodomestico {

    private int numeSerie;
    private int peso;
    private String marca;
    private String nome;
    Scanner sc = new Scanner(System.in);

    /*Assinatura dos métodos de serviço (Classe Construtor)*/
    public Eletrodomestico(int numeSerie, int peso, String marca, String nome) {

        /*Palavra-Chave para chamar construtores dentro de outros construtores, garantindo
         o acesso ao atributo*/
        this.numeSerie = numeSerie;
        this.peso = peso;
        this.marca = marca;
        this.nome = nome;
    }

    public void cadastra() {
        System.out.println("Entre com o Número de Série: ");
        int numeSerie = getSc().nextInt();
        System.out.println("Entre com o Peso: ");
        int peso = getSc().nextInt();
        System.out.println("Entre com a Marca: ");
        String marca = getSc().next();
        System.out.println("Entre com o Nome: ");
        String nome = getSc().next();

    }

    @Override
    public String toString() {
        return "\nNUMERO DE SÉRIE: " + getNumeSerie()
                + "\nPESO: " + getPeso()
                + "\nMARCA: " + getMarca()
                + "\nNOME: " + getNome();
    }

    /**
     * @return the numeSerie
     */
    public int getNumeSerie() {
        return numeSerie;
    }

    /**
     * @param numeSerie the numeSerie to set
     */
    public void setNumeSerie(int numeSerie) {
        this.numeSerie = numeSerie;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sc
     */
    public Scanner getSc() {
        return sc;
    }

    /**
     * @param sc the sc to set
     */
    public void setSc(Scanner sc) {
        this.sc = sc;
    }

}
