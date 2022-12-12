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
public class SucessorAntecessor {

    public static void main(String[] args) {
         Scanner tec = new Scanner (System.in);

        System.out.print("Digite um número  ");
        int n = tec.nextInt();
        int a = n;
        int s = n;
        System.out.println(" o sucessor de  " + n + " e " + ++s);
        System.out.println(" o Antecessor de " + n + " e " + --a);

    }

}
