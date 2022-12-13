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
public class IMC {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        System.out.print("Qual o seu Peso  ");
        float peso = tec.nextFloat();
        System.out.print("Qual a sua Altura  ");
        float altura = tec.nextFloat();
        float imc = peso / (altura * altura);
        System.out.println("Seu Imc é " + imc);
        if (imc < 18) {
            System.out.println("ABAIXO DO PESO");
        } else if ((imc >= 18.1) && (imc < 25)) {
            System.out.println("------------------------");
            System.out.println("SAUDÁVEL ");
            System.out.println("------------------------");
        } else if ((imc >= 25) && (imc < 30)) {
            System.out.println("------------------------");
            System.out.println("SOBREPESO");
            System.out.println("------------------------");
        } else if ((imc >= 30) && (imc < 35)) {
            System.out.println("------------------------");
            System.out.println("OBESIDADE GRAU 1");
            System.out.println("------------------------");
        } else if ((imc >= 35) && (imc < 40)) {
            System.out.println("------------------------");
            System.out.println("OBSIDADE GRAU 2 (SEVERA)");
            System.out.println("------------------------");
        } else {
            System.out.println("------------------------");
            System.out.println("OBESIDADE GRAU 3 (MÓRBIDA)");
            System.out.println("------------------------");
        }

        System.out.println("-------------------------------------------");
        System.out.println("Classificação       |  |     IMC           ");
        System.out.println("-------------------------------------------");
        System.out.println("|Abaixo do peso     |  |  Abaixo 18,5     |");
        System.out.println("-------------------------------------------");
        System.out.println("|Peso normal        |  |  18,5 - 24,9     |");
        System.out.println("-------------------------------------------");
        System.out.println("|Sobrepeso          |  |    25 - 29,9     |");
        System.out.println("-------------------------------------------");
        System.out.println("|Obesidade Grau I   |  |    30 - 34,9     |");
        System.out.println("-------------------------------------------");
        System.out.println("|Obesidade Grau III |  | Maior ou Igual 40|");
        System.out.println("-------------------------------------------");

    }
}
