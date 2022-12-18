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
public class SomaF {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int i =0, num = 0, soma= -1111;
        System.out.println("Digite 1111 para parar");
        while(num!=1111){
            
            System.out.println("Digite Um número");
            num = tec.nextInt();
                    i=+1;
                    soma+=num;   
        }
          System.out.println("Soma dos Números " + soma);    
 

    }
}
