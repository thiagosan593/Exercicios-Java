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
public class MaiorF {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite um Número ");
        int n1 = tec.nextInt();
        System.out.println("Digite outro Número ");
        int n2 = tec.nextInt();
        maior(n1, n2);

    }

    public static void maior(int a, int b) {

        if (a > b) {
            System.out.println("O número " + a + " é maior");
        } else if (a < b) {
            System.out.println("o número " + b + " é maior ");
        } else {
            System.out.println("Os 2 números são iguias ");
        }

    }
}

