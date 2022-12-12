/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Thiago Faculdade
 */
public class nomeSalario {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Qual o seu Nome ");
        String nome = tec.nextLine();
        System.out.print("Salario :");
        float sal = tec.nextFloat();
        System.out.println("O funcionario(a) " + nome + " Tem um salário de " + sal + " em junho");  

        
    }
}
