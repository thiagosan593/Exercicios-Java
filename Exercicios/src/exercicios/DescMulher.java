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
public class DescMulher {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite seu Nome");
        String nome = tec.nextLine();
        System.out.println("Digite seu sexo");
        String sexo = tec.nextLine();
        System.out.println(" Valor da Compra ");
        float valor = tec.nextFloat();
        if ((sexo.equals("F")) || (sexo.equals("f"))) {
            float valor_desc = valor - (valor * 13) / 100;
            System.out.println(nome + " o valor a pagar será de " + valor_desc + " R$");
        } else {
            float valor_desc = valor - (valor * 5) / 100;
            System.out.println(nome + " o valor a pagar será de " + valor_desc + " R$");
        }

    }

}
