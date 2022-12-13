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
public class AlunoMedia {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print(" Qual o seu Nome ");
        String nome = tec.next();
        System.out.println("----------------------------");
        System.out.println("         BEM VINDO          ");
        System.out.println("           " + nome + "         ");
        System.out.println("----------------------------");
        System.out.print("Digite sua Primeira Nota : ");
        float n1 = tec.nextFloat();
        System.out.print("Digite sua Segunda Nota : ");
        float n2 = tec.nextFloat();
        float media = (n1 + n2) / 2;
        if (media > 7) {
            System.out.println(nome + " sua média foi " + media);
            System.out.println(" Voce esta Aprovado");
        } else {
            System.out.println(nome + " sua média foi " + media);
            System.out.println(" Você está reprovado ");

        }

    }
}
