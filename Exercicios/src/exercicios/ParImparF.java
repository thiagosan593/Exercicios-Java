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
public class ParImparF {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite um Número ");
        int n1 = tec.nextInt();
        parouimpar(n1);

    }

    public static void parouimpar(int a) {

        if (a % 2 == 0) {
            System.out.println("Número par");
        } else {
            System.out.println("Número impar");
        }

    }

}
