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
public class MaiorMenorWhile {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String resposta = "";
        int num = 0, contador = 0, soma = 0, menor_num =998, contPar = 0;
        do {
            System.out.println("Digite um Número ");
            num = tec.nextInt();
            contador++;
            soma += num;

            if (num < menor_num) {
                menor_num = num;
            }
            if(num%2==0){
                contPar ++;
            }

            System.out.println("Deseja Continuar?[S/N]");
            resposta = tec.next();
        } while (resposta.equals("S")||resposta.equals("s"));
        double media = soma/contador;

        System.out.println("O somatório entre os Valores é " + soma);
        System.out.println("o menor Número digitado foi " + menor_num);
        System.out.println("A média entre os Valore é " + media);
        System.out.println("A quantidade de Números pares é " + contPar);

    }

}
