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
public class ValorAbsoluto {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Insira um Nº Negativo :");
        int num = tec.nextInt();
        int b = Math.abs(num);
        System.out.println(b);

    }
}
