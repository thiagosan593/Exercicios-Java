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
public class PrecoKM {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Quantos Km deseja Percorrer");
        float km = tec.nextFloat();
        if (km <= 200) {
            float tot = (float) (km * 0.50);
            System.out.println("Total a pagar " + tot + "R$");
        } else {
            float tot2 = (float) (km * 0.45);
            System.out.println("Total a pagar " + tot2 + "R$");
        }

    }
}
