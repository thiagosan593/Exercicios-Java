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
public class VetorCont {

    public static void main(String[] args) {
        int n[] = new int[10];
        int cc = 0;

        for (int i = 0; i < n.length; i++) {
            cc += 5;
            n[i] = cc;
            System.out.println(n[i]);
        }

    }
}
