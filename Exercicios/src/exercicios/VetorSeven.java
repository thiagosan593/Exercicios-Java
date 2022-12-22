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
public class VetorSeven {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int vetor[] = new int[7];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º Valor: ");
            vetor[i] = tec.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("{" + vetor[i] + "}  ");
        }

    }

}
