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
public class SalarioAno {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Digite seu Nome : ");
        String nome = tec.nextLine();
        System.out.print("Quantos anos de Trabalho na empresa ? ");
        int anos = tec.nextInt();
        System.out.print("Qual o seu salário? ");
        float salario = tec.nextFloat();
        if (anos <= 3) {
            float n_sal = salario + (salario * 3) / 100;
            System.out.println(nome + " Seu novo salário será de " + n_sal);
        } else if (anos > 3 || anos >= 10) {
            float n_sal = (float) (salario + (salario * 12.5) / 100);
            System.out.println(nome + " Seu novo salário será de  " + n_sal);
        } else {
            float n_sal = salario + (salario * 20) / 100;
            System.out.println(nome + " Seu novo salário será de " + n_sal);
        }

    }
}
