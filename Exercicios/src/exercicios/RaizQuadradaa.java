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
public class RaizQuadradaa {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Cálculo da Raiz quadrada  ");
        System.out.println("Digite O número Desejado  ");
        int num = tec.nextInt();
        int raiz = num * num;
        System.out.println("A raiz quadrada é  " + raiz);

    }
}
