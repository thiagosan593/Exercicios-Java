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
public class ParImpar {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Digite um Número ");
        int numero = tec.nextByte();
        if (numero % 2 == 0) {
            System.out.println("Número Par");
        } else {
            System.out.println("Numero Impar");
        }

    }
}
