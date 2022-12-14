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
public class AguaIdeal {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        float ml = (float) 0.35;
        System.out.println(" Qual o seu Peso :");
        float peso = tec.nextFloat();
        float total = (float) (0.035 * peso);
        System.out.println(" A quantidade ideal é de " + total + " Ml");

    }
}
