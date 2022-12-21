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
public class ContagemVetor {

    public static void main(String[] args) {
        int n[] = new int[9];

        for (int i = n.length - 1; i >= 0; i--) {
            n[i] = i;
            System.out.print(n[i] + " ");
        }

    }
}
