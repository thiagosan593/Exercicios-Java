/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Thiago Santos
 */
public class Votacao {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Calendar anoAtual = Calendar.getInstance();
        int year = anoAtual.get(Calendar.YEAR);
        System.out.println("Qual seu ano de nascimento ? ");
        int ano = tec.nextInt();
        int idade = year - ano;
        System.out.println("Sua idade é " + idade);
        if (idade >= 18) {
            System.out.println(" Pode votar");
        } else {
            System.out.println("Não pode Votar");
        }

    }
}
