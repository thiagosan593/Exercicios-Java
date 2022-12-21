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
public class AcerteNumero {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num;
        num = (int) (Math.random() * (11 - 1));
        System.out.println(num);
        int i = 0, tent = 0;

        System.out.println("Tente Adivinhar o Número entre 1 e 10");
        System.out.println("3 TENTATIVAS");
        while (i < 3 && tent != num) {
            i++;
            System.out.println("Digite sua " + (i) + "ª Tenatativa");
            tent = tec.nextInt();
            if (tent == num) {
                System.out.println("Voce Acertou");
            } else if (tent > num) {
                System.out.println("O Número é maior");
            } else {
                System.out.println("o número é menor");
            }
        }
        if (tent != i ) {
            System.out.println("\"Tentativas esgotadas \"");
        }

    }

}
}
