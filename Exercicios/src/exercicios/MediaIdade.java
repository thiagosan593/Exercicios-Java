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
public class MediaIdade {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int soma = 0, contador = 0, idade;
        System.out.println("Digite 999 para parar");
        do {
            System.out.println("Digite a idade do Aluno ");
            idade = tec.nextInt();
            if (idade < 999) {
                soma += idade;
                contador += 1;
            }

        } while (idade != 999);
        int media = soma / contador;
        System.out.println("Existem " + contador + " Alunos");
        System.out.println("A média de Idade dos Alunos são " + media);

    }
}
