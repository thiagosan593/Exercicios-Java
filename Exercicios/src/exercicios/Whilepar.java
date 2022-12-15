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
public class Whilepar {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int cc = 0;
        while (cc <= 20) {
            cc++;
            if (cc % 2 == 1) {
                continue;
            }
            System.out.println("Par " + cc);
        }

    }
}
