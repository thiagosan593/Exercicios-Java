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
public class Locadora {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("         Bem vindo A LocalHertz   ");
        System.out.println("----------------------------------");
        System.out.println("Informe a quantidade de Kms percorridos :");
        float km = tec.nextFloat();
        System.out.println("quantidade de dias Alugados : ");
        int dias = tec.nextInt();
        int valor_d = dias * 90;
        float valor_km = (float) (km * 0.20);
        float tot_pagar = valor_km + valor_d;

        System.out.println("O Total a pagar é  de  " + tot_pagar + " R$");

    }
}
