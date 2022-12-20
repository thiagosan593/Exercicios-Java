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
public class SomaRept {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int soma = 0, num;
        for (int i = 0; i < 7; ++i) {
            System.out.print("Digite um Numero :" + (i + 1) + " ");
            num = tec.nextInt();
            soma += num;
        }
        System.out.println("\n Soma " + soma);

    }
}
