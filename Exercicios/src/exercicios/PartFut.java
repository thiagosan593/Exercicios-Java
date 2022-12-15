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
public class PartFut {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int dif;
        System.out.print(" Digite o Nome do Time 1 : ");
        String t1 = tec.nextLine();
        System.out.print(" Digite o Nome do Time 2 : ");
        String t2 = tec.nextLine();
        System.out.print("Qual a Quantidade de Gols do  " + t1 + " ");
        int gt1 = tec.nextInt();
        System.out.print("Qual a Quantidade de Gols do  " + t2 + " ");
        int gt2 = tec.nextInt();
        if (gt1 > gt2) {
            dif = gt1 - gt2;
        } else {
            dif = gt2 - gt1;
        }
        System.out.println("-------------------------");
        System.out.println(" DIFERENÇA : " + dif);
        if (dif == 0) {
            System.out.println(" STATUS: EMPATE ");
            System.out.println("-------------------------");
        } else if ((dif >= 1) && (dif <= 3)) {
            System.out.println(" STATUS  NORMAL ");
            System.out.println("-------------------------");
        } else {
            System.out.println(" STATUS  GOLEADA ");
            System.out.println("-------------------------");

        }
    }
}
