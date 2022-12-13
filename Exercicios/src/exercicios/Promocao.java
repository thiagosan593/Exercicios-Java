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
public class Promocao {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        System.out.println("Qual o seu Nome? ");
        String nome = tec.nextLine();
        System.out.println("Qual o seu Sexo? ");
        String Sexo = tec.nextLine();
        System.out.println("Qual valor da Compra? ");
        float valor = tec.nextFloat();
        if (("F".equals(Sexo)) || ("f".equals(Sexo))) {
            float desc = valor - (valor * 13) / 100;
            System.out.println(" Valor a pagar " + desc);
        } else {
            float desc = valor - (valor * 5) / 100;
            System.out.println(" Valor a pagar " + desc);
        }

    }
}
