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
public class Mediac {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("----------------------");
        System.out.println("  UNIVERSIDADE UNISAL ");
        System.out.println("-----------------------");
        System.out.print("Digite Sua Primeira Nota :  ");
        float nota1 = tec.nextFloat();
        System.out.print("Digite sua Segunda nota : ");
        float nota2 = tec.nextFloat();
        float media = (nota1 + nota2) / 2;
        if (media >= 7) {
            System.out.println("----------------------");
            System.out.println("   Média " + media + "  ");
            System.out.println("     Aluno Aprovado    ");
            System.out.println("----------------------");

        } else {
            System.out.println("----------------------");
            System.out.println("    Média " + media + "  ");
            System.out.println("     Aluno Reprovado    ");
            System.out.println("----------------------");
        }

    }
}
