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
public class MediaFor {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        float nota1 = 0, nota, media;
        System.out.println("Quantas Notas Compõe a média ? ");
        int comp = tec.nextInt();
        for (int cc = 1; cc <= comp; cc++) {
            System.out.println("Digite a sua Nota  " + cc);
            nota = tec.nextFloat();
            nota1 += nota;

        }
        media = nota1 / comp;
        System.out.println("Sua média é " + media);

    }
}
