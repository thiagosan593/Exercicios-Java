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
public class ParImparReturn {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num;
        String r;

        System.out.println("digite um Número ");
        num = tec.nextInt();
        r = parimpar(num);
        System.out.println("O Número " + num + " é " + r);

    }

    public static String parimpar(int x) {
        if (x % 2 == 0) {
            return "Par";
        } else {
            return "Impar";
        }

    }
}
