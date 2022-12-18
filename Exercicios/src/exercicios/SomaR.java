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
public class SomaR {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int num1, num2;
        System.out.println("Digite o primeiro número : ");
        num1 = tec.nextInt();
        System.out.println("Digite o segundo Número ");
        num2 = tec.nextInt();
        soma(num1, num2);

    }

    static void soma(int a, int b) {
        System.out.println("RECEBI O VALOR DE A " + a);
        System.out.println("Recebi o valor de B " + b);
        System.out.println("A SOMA DE A + B É " + (a + b));
    }

}


