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
public class Descont {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        float desc1 = 5f;
        System.out.println("-------------------------------------------------------");
        System.out.println("                 BEM VINDO À LOJA                      ");
        System.out.println("-------------------------------------------------------");
        System.out.println(" O valor de desconto Abaixo de 100 R$ é " + desc1 + " R$");
        System.out.println(" Acima de 100 R$ é permitido o desconto de Até 15%      ");
        System.out.print(" Qual o valor da Compra?  ");
        float valor = tec.nextFloat();
        if (valor <= 100) {
            float totpagar = valor - (valor * desc1) / 100;
            System.out.println("O valor a pagar é de " + totpagar);
        } else {
            System.out.print("Qual valor de desconto ? ");
            float desc2 = tec.nextFloat();
            if (desc2 <= 15) {
                float totpagar = valor - ((valor * desc2) / 100);
                System.out.println("O valor a pagar é de " + totpagar);
            } else {
                System.out.println("Desconto Não permitido");
            }
        }

    }
}
