/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Thiago Faculdade
 */
public class media {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Digite a Primeira nota ");
        float n1 = tec.nextFloat();
        System.out.print("Digite a Segunda Nota ");
        float n2 = tec.nextFloat();
        float media = (n1 + n2) / 2;
        System.out.println(" A média entre " + n1 + " e " + n2 + " é igual a " + media);

    }
}
