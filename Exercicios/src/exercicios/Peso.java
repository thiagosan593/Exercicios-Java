/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import static exercicios.LimpaTela.limparSaida;
import java.util.Scanner;

/**
 *
 * @author Thiago Santos
 */
public class Peso {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        float maior = 0, peso = 0;
        String nome, pessoa = "";

        System.out.println("----------------------------------");
        System.out.println("         DETECTOR DE PESO         ");
        System.out.println("Maior peso até o Momento " + maior);
        System.out.println("----------------------------------");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite seu Nome : ");
            nome = tec.next();
            System.out.println("Qual o seu peso " + nome);
            peso = tec.nextFloat();
            if (peso >= maior) {
                maior = peso;
                pessoa = nome;
            }

            limparSaida();
            System.out.println("----------------------------------");
            System.out.println("         DETECTOR DE PESO         ");
            System.out.println("Maior peso até o Momento " + maior);
            System.out.println("----------------------------------");
        }
        limparSaida();
        System.out.println("----------------------------------");
        System.out.println("         DETECTOR DE PESO         ");
        System.out.println("Maior peso até o Momento " + maior);
        System.out.println("----------------------------------");
        System.out.println("A Pessoa mais pesada foi " + pessoa + " com " + maior + " KG");

    }

   
}

