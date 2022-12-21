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
public class SomaRet {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num, num1, s;

        System.out.println("digite um Número ");
        num = tec.nextInt();
        System.out.println("Digite outro número ");
        num1 = tec.nextInt();
        s = soma(num, num1);
        System.out.println("A soma é  " + s);

    }

    public static int soma(int x, int y) {
        return x + y;
    }

}

