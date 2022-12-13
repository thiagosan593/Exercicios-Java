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
public class AnoBixesto {
    
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println(" Digite um Ano");
        int ano =tec.nextInt();
        if(ano%4==0){
            System.out.println("Ano Bixesto");
        }else {
            System.out.println("Ano normal");
        }

    }
}
