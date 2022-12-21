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
public class NumAle {

    public static void main(String[] args) {
        int n[] = new int[9];

        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (Math.random() * (100));
            System.out.print(n[i] + " ");
        }

    }
}
