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
public class ConverterTemp {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Conversor de Temperatura");
        System.out.println("[1] Cº em Fº");
        System.out.println("[2] Fº em Cº");
        System.out.println("Escolha uma opção");
        int opc = tec.nextInt();
        System.out.println("Qual a temperatura : ");
        float temp = tec.nextInt();
        switch (opc) {
            case 1:
                 temp =(temp * 9 / 5) + 32;
                 System.out.println("A temperatura " + temp + "Cº Equivale a " + temp + " Fº");

                break;
            case 2:
                int celss = 32;
                float fah = (float) ((temp - celss) / 1.80);
                System.out.printf(" A temperatura de " + temp + "Fº equivale a %2.2f  ", fah);

                break;
        }

    }
}
