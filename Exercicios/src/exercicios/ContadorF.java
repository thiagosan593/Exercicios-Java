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
public class ContadorF {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        System.out.println("Deseja inicar a contagem em que Número ");
        int n1 = tec.nextInt();
        System.out.println("Desejeja contar ate quanto ? ");
        int n2 = tec.nextInt();
        System.out.println("Qual o Intervalo de Contagem ? ");
        int n3 = tec.nextInt();
        contador(n1, n2, n3);

    }

    public static void contador(int a, int b, int c) {

        for (int i = a; i <= b; i += c) {
            System.out.print(i + ">>>");
        }
        System.out.println("FIM");

    }
}


