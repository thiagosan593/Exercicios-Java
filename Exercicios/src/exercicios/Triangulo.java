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
public class Triangulo {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int l1, l2, l3;
        boolean eq, es;
        System.out.print("Digite o lado 1 :  ");
        l1 = tec.nextInt();
        System.out.print("Digite o lado 2 :");
        l2 = tec.nextInt();
        System.out.print("Digite o lado 3 ");
        l3 = tec.nextInt();
        eq = (l1 == l2) || (l2 == l3);
        es = (l1 != l2) || (l2 != 3) || (l3 != l1);
        System.out.println("O Triangulo é Equilatero : " + eq);
        System.out.println("O Triângulo é escaleno :  " + es);

    }
}
