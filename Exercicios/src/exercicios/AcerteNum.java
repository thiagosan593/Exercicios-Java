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
public class AcerteNum {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int comp = (int) (Math.random() * (5 - 0));
        //  System.out.println(comp);
        System.out.println("Tente Adivinhar o número:  ");
        int num = tec.nextInt();
        if (num == comp) {
            System.out.println("Parabéns Você acertou");
        } else {
            System.out.println("Voce errou");
        }

    }
}
