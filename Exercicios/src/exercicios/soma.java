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
public class soma {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print(" Digite um valor ");
        int v1 = tec.nextInt();
        System.out.print("Digite outro valor ");
        int v2 = tec.nextInt();

        int soma = v1 + v2;

        System.out.println(" A soma entre " + v1 + " e " + v2 + " é igual  " + soma);

    }
}
