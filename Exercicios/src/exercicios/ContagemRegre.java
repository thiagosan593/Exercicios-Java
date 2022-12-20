/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author Thiago Santos
 */
public class ContagemRegre {

    public static void main(String[] args) {
        int soma = 0;
        for (int i = 500; i >= 0; i -= 50) {
            System.out.print(i + " ");
            soma += i;
        }
        System.out.println("\n Soma " + soma);
    }

}
