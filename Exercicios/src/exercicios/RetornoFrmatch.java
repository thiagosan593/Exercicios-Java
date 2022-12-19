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
public class RetornoFrmatch {

    public static void main(String[] args) {

        int sorteio = (int) (Math.random() * (3));
        System.out.println(sorteio);
        if (sorteio == 0) {
            System.out.println("++----=========-----++");
            f("OLÁ MUNDO");
            System.out.println("++----=========-----++");
        } else if (sorteio == 1) {
            System.out.println("~~~~~~~~~~::::::::::~~~~~~");
            f("OLÁ MUNDO");
            System.out.println("~~~~~~~~~~::::::::::~~~~~~");
        } else {
            System.out.println("<<<<<<<<<<<-------------->>>>>>.");
            f("OLÁ MUNDO");
            System.out.println("<<<<<<<<<<<-------------->>>>>>.");
        }

    }

    public static String f(String a) {

        for (int i = 0; i < 4; i++) {
            System.out.println(a);
        }

        return null;

    }
}
