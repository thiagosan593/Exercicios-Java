/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Thiago Santos
 */
public class Viagem {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Quantos reais eu tenho");
        float real = tec.nextFloat();
        if (real > 1000) {
            System.out.println("Posso ir pra Disney");
        } else {
            System.out.println("Terei q Ficar em casa");
        }

    }
}
