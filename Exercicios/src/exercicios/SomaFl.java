/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Thiago Faculdade
 */
public class SomaFl {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println( "Digite 1 valor : ");
        int v1 = tec.nextInt();

        System.out.println("Digite Outro valor");
        int v2 = tec.nextInt();
        int s = soma(v1, v2);

        System.out.println("O resultado da Soma é " + s);

    }

    public static int soma(int x, int y) {

        return x + y;

    }
}
