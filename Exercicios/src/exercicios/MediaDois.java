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
public class MediaDois {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Digite a 1ª Nota : ");
        float n1 = tec.nextFloat();
        System.out.print("Digite a 2ª Nota : ");
        float n2 = tec.nextFloat();
        float media = (n1 + n2) / 2;
        if (media > 7) {
            System.out.println(" Media " + media);
            System.out.println("APROVADO");
        } else if ((media < 7) || (media >= 5)) {
            System.out.println("Media " + media);
            System.out.println("Recuperação");
        } else {
            System.out.println("Media " + media);
            System.out.println("Reprovado");
        }

    }
}
