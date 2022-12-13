/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class MultaVelocidade {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println(" qual a velocidade do carro : ");
        float velocidade = tec.nextFloat();
        if (velocidade > 80) {
            float multa = velocidade * 5;
            System.out.println("O carro foi multado em " + multa + " R$ ");
        } else {
            System.out.println("Carro Não Multado");
        }
    }

}
