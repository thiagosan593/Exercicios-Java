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
public class TercaParte {

    public static void main(String[] args) {
         Scanner tec = new Scanner (System.in);
        System.out.print("Digite um numero  ");
        float n = tec.nextFloat();
        float dobro = n * 2;
        float terparte = n / 3;
        System.out.println(" o dobro  de  " + n + " e " + dobro);
        System.out.println(" A terça parte  de " + n + " e " + terparte);

    }

}
