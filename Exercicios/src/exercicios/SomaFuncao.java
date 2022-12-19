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
public class SomaFuncao {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Digite um Número ");
        int n1 = tec.nextInt();
        System.out.println("Digite outro Número ");
        int n2 = tec.nextInt();
        soma(n1, n2);

    }

    public static void soma(int a, int b) {

        System.out.println("A SOMA DE " + a + " + " + b + " é igual a " + (a + b));

    }

}
