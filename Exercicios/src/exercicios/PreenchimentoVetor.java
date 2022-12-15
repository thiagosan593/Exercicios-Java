/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Arrays;

/**
 *
 * @author Thiago Santos
 */
public class PreenchimentoVetor {

    public static void main(String[] args) {
        int v[] = new int[20];
        Arrays.fill(v, 0);
        for (int valor : v) {
            System.out.print(valor + " ");
        }

    }
}
