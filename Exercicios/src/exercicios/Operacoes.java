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
public class Operacoes {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite 1 para  somar ");
        System.out.println("Digite 2 para Subtrair");
        System.out.println("Digite 3 para multiplicar");
        System.out.println("Digite 4 para Dividir");
        int i = tec.nextInt();
        if(i<=0 || i>4){
            System.out.println("Opção inválida");
        }else{
                 System.out.println("Digite o Número 1: ");
        float num1 = tec.nextFloat();
        System.out.println("Digite o Número 2: ");
        float num2 = tec.nextFloat();

        if (i == 1) {
            float resul = num1 + num2;
            System.out.println(resul);
        } else {
            if (i == 2) {
                float resul = num1 - num2;
                System.out.println(resul);
            } else {
                if (i == 3) {
                    float resul = num1 * num2;
                    System.out.println(resul);
                } else {
                    if (i == 4) {
                        float resul = num1 / num2;
                        System.out.println(resul);
                    } else {
                        System.out.println("Opção Digitada Inválida");
                    }

                }
            }
        }

        }
   
    }
}
