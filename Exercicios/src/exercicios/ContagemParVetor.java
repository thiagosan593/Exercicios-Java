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
public class ContagemParVetor {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int contpar = 0;
        int vetorparimpar[] = new int[7];

        for (int i = 0; i < vetorparimpar.length; i++) {
            System.out.println("Digite seu " + (i + 1) + "º Número");
            vetorparimpar[i] = tec.nextInt();
        }

        for (int i = 0; i < vetorparimpar.length; i++) {
            if (vetorparimpar[i] % 2 == 0) {
                System.out.println("Número Par na Posição " + i + " = " +  vetorparimpar[i] );

                contpar++;
            }
        }
        System.out.println("A quantidade de Números pares são " + contpar);
    }

}
