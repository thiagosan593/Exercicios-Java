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
public class Idade {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Em que anos estamos :");
        int ano = tec.nextInt();
        System.out.println("Em que Ano nasci :");
        int ano_nasc = tec.nextInt();
        int idade = ano - ano_nasc;
        System.out.println("Minha idade é " + idade);

    }

}
