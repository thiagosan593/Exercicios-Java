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
public class ComparacaoNum {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Digie um Número :");
        int n1 = tec.nextInt();
        System.out.print("Digite outro Numero :");
        int n2 = tec.nextInt();
        if (n1 > n2) {
            System.out.println(" Número 1 é maior ");
        } else if (n2 > n1) {
            System.out.println("Numero 2 é maior");
        } else {
            System.out.println("Os Números são Iguais ");
        }

    }
}
