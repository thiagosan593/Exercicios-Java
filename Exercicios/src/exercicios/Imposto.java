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
public class Imposto {

    public static void main(String[] args) {
        Scanner tec= new Scanner(System.in);
        System.out.print(" Qual a % de Taxa :");
        int taxa = tec.nextInt();
        System.out.print("Qual valor da Compra : ");
        float compra = tec.nextInt();
        float imposto = compra + (taxa * compra) / 100;
        System.out.println(" com valor da taxa " + taxa + "% o valor a pagar é de " + imposto);

    }
}
