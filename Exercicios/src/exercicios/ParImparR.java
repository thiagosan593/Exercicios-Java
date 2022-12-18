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
public class ParImparR {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num1, num2;
        System.out.println("Deseja Fazer quantas Repeticoes ?");
        int cont = tec.nextInt();
        for (int i = 0; i < cont; i++) {
            System.out.println("Digite um numero : ");
            num1 = tec.nextInt();
            parouimpar(num1);
        }
    }

    static void parouimpar(int a) {
        if (a % 2 == 0) {
            System.out.println("O Número " + a + " é par");
        } else {
            System.out.println("O Número " + a + " é impar");
        }

    }

}
