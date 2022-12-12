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
public class AumentoSalario {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print(" Informe seu salário atual ? ");
        float sal = tec.nextFloat();
        float total = sal + (sal * 15) / 100;
        System.out.println("seu novo salário será de  " + total + " R$");

    }
}
