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
public class MaiorMenor {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int num, maior = 0, menor = 100, media = 0, soma = 0;
        int contMaior = 0, contMenor = 0, i;

        for (i = 0; i < 3; i++) {
            System.out.println("Digite um número entre 0 e 100");
            num = ent.nextInt();

             // validação
            if ((num < 1) || (num > 100)) {
                i = i - 1;
            } else {
                // armazena os nº digitados
                soma = soma + num;

                // armazena o maior nº
                if (num > maior) {
                    maior = num;
                    contMaior++;
                }

                // armazena o menor nº
                if (num < menor) {
                    menor = num;
                    contMenor++;
                }

            } 
        } 
        System.out.println("O maior nº digitado foi " + maior);
        System.out.println("O menor nº digitado foi " + menor);
        System.out.println("A média foi " + (media = soma / i));

    } 
} 

