package exercicios;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Thiago Santos
 */
public class ConverterMetros {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Digite um numero  ");
        float n = tec.nextFloat();
        float km = n / 1000;
        float hm = n / 100;
        float dam = n / 10;
        float dm = n * 10;
        float cm = n * 100;
        float mm = n * 100;
        System.out.println(km + " km     ");
        System.out.println(hm + " hm");
        System.out.println(dam + " dam ");
        System.out.println(dm + "dm");
        System.out.println(cm + " cm");
        System.out.println(mm + " mm ");

    }
}
