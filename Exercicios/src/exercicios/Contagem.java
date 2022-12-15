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

public class Contagem {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int cont = 0;
        for (int cc = 0; cc <= 6; cc++) {
            System.out.print(" Digite o N" + cc + "º");
            int num = tec.nextInt();
            if ((num > 0) && (num <= 10)) {
                cont++;
            }
        }
        System.out.println("Foram digitados " + cont + " Números entre 0 e 10 ");
    }
}
