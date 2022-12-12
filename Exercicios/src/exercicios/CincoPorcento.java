/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class CincoPorcento {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print(" Digite o preço do Produto? ");
        float preco = tec.nextFloat();
        float total = preco - (preco * 5) / 100;
        System.out.println("O preço a pagar é de " + total);

    }

}
