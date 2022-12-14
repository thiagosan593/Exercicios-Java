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
public class AlturaLargura {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Qual a largura da Parede ");
        float largura = tec.nextFloat();
        System.out.print(" Qual a Altura da parede: ");
        float altura = tec.nextFloat();
        float area = altura * largura;
        float litros = area / 2;
        System.out.println(" A área é de " + area);
        System.out.println("A quantidade de lItros a ser pintada é de " + litros);

    }
}
