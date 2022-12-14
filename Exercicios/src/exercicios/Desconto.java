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
public class Desconto {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("qual Valor do Produto :");
        float preco = tec.nextFloat();
        if (preco >= 100) {
            float valor = preco - (preco * 10) / 100;
            System.out.println("o Valor a Pagar é de " + valor);
        } else {
            float valor = preco - (preco * 5) / 100;
            System.out.println("o Valor a Pagar é de " + valor);
        }

    }
}
