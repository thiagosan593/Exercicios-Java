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
public class VidaFumante {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Qual a quantidade de Cigarros fumandos por dia : ");
        float quant = tec.nextFloat();
        System.out.println("Qual a quantiade de Anos : ");
        float anos = tec.nextFloat();
        float n_dias = quant * (anos * 365);
        System.out.println(" Em " + anos + " ano Você fumou " + n_dias + " Cigarros");
        float temp_perd = n_dias * 10;
        float vida_perd = (temp_perd / 1440);
        System.out.println("o tempo de vida perdido é " + vida_perd + " Dias ");

    }
}
