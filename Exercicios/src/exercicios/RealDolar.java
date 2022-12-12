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
public class RealDolar {

    public static void main(String[] args) {
        Scanner tec = new Scanner (System.in);
        System.out.print(" Quantos reais eu tenho ? ");
        float rs = tec.nextFloat();
        System.out.print("Qual o valor do Dólar ? ");
        float dolar = tec.nextFloat();
        float total = rs / dolar;
        System.out.println("você tem o equivalente a  " + total + "  de Dólares ");

    }
}
