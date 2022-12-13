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
public class RaizQuadrada {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println(" Digite Um número para calcular a raiz quadrada");
        int num = tec.nextInt();
        double resul = Math.sqrt(num);
        System.out.println("Raiz quadrade de Nº" + num + " é " + resul);

    }
}
