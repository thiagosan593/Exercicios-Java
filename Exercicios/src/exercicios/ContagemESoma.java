/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author Thiago Faculdade
 */
public class ContagemESoma {

    public static void main(String[] args) {
        int soma = 0;
        for (int i = 4; i <= 100; i += 2) {
            System.out.print(i + " ");
            soma += i;
        }
        System.out.println("\n Soma " + soma);

    }
}
