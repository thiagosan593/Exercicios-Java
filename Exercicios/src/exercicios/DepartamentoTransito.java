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
public class DepartamentoTransito {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Calendar anoAtual = Calendar.getInstance();
        int year = anoAtual.get(Calendar.YEAR);

        System.out.println("-----------------------------");
        System.out.println("  DEPARTAMENTO DE TRÂNSITO   ");
        System.out.println("------------------------------");
        System.out.println("");
        System.out.print("Data de Nascimento : ");
        int data = tec.nextInt();
        int idade = year - data;
        System.out.println("----------STATUS-----------");
        System.out.println("    IDADE " + idade + "     ");
        if (idade >= 18) {
            System.out.println("    APTO A TIRAR CARTEIRA   ");
            System.out.println("----------------------------");
        } else {
            System.out.println("    INAPTO A TIRAR CARTEIRA  ");
            System.out.println("----------------------------");
        }

        System.out.println("Obrigado!");

    }

}
