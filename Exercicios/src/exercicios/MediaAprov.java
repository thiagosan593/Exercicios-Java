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
public class MediaAprov {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Digite Sua primeira nota ? ");
        float n1 = tec.nextFloat();
        System.out.print("Digite sua Segunda nota ?");
        float n2 = tec.nextFloat();
        float media = (n1 + n2) / 2;
        System.out.println("Media " + media);
        if (media >= 9) {
            System.out.println("Aproveitamento A");
        } else if ((media >= 7) && (media < 9)) {
            System.out.println("Aproveitamento B");
        } else if ((media >= 5) && (media < 7)) {
            System.out.println("Aproveitamento C");
        } else if ((media >= 3) && (media < 5)) {
            System.out.println("Aproveitamento D");
        } else if ((media >= 1) && (media < 3)) {
            System.out.println("Aproveitamento E");
        } else {
            System.out.println("Reprovado");
        }

    }
}
