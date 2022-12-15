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
public class BuscaVetor {

    public static void main(String[] args) {
        int vet[] = { 3, 7, 6, 1, 9, 4, 2 };
        for (int v : vet) {
            System.out.print(v + " ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vet, 2);
        System.out.println("Achei o valor na posição " + p);

    }
}
