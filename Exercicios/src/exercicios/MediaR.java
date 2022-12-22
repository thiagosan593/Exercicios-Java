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
public class MediaR {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        float num1, num2, md;
        String status;
        System.out.print("Digite Sua nota 1: ");
        num1 = tec.nextInt();
        System.out.print("Digite Sua nota 2: ");
        num2 = tec.nextInt();
        md = media(num1, num2);
        status = resultado(md);
        System.out.println("Sua média é " + md);
        System.out.println("STATUS " + status);

    }

    public static float media(float a, float b) {
        return (a + b) / 2;
    }

    public static String resultado(float n) {
        if (n >= 7) {
            return "APROVADO";
        } else if (n >= 5 && n < 7) {
            return "RECUPERAÇÃO";
        } else {
            return "reprovado";
        }

    }

}

