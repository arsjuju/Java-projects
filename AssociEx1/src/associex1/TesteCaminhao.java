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
public class TesteCaminhao {

    public static void main(String[] args) {
        Caminhao cam = new Caminhao("Fiat", "Toyota",
                new Motor(70, 5, "Gasolina",
                        new Parafuso("Grande", "Latão",
                                new Fornecedor("35553-3", "José"))),
                new Roda(20, "Carlos", "Prata",
                        new Parafuso("Pequeno", "Prata",
                                new Fornecedor("36546-1", "Carlos"))),
                new Pneu(30, "Carlos",
                        new Fornecedor("36546-1", "Carlos")));
        
        System.out.println(cam);
    }

}
