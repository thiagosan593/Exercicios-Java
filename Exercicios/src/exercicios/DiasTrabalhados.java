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
public class DiasTrabalhados {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Digite a quantidade de Horas Trabalhadas : ");
        float q_horas = tec.nextFloat();
        System.out.print("Escreval o valor por hora Trabalhada : ");
        float v_horas = tec.nextFloat();
        System.out.print("Digite a quantidade de Dias Trabalhados : ");
        int dias = tec.nextInt();
        float salario = q_horas * v_horas * dias;
        System.out.println("Seu salário é " + salario + " R$");

    }
}
