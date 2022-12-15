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
public class TrianguloF {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int a, b, c;
        boolean total;
        System.out.print("Digite o lado 1: ");
        a = tec.nextInt();
        System.out.print("Digite o lado 2 : ");
        b = tec.nextInt();
        System.out.print("Digite o lado 3 : ");
        c = tec.nextInt();
        total = (a + b != c) && (a + c != b) && (b + c != a);
        System.out.println("É possível formar Um triangulo : " + total);

    }
}
