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
public class NumMaior {
     public static void main(String[] args) {
      Scanner tec = new Scanner(System.in);
      
        int  n1, n2 , n3, resul;
   
        System.out.print("Digite o 1º numero: ");
        n1 = tec.nextInt();
        System.out.print("Digite o 2º numero: ");
        n2 = tec.nextInt();
        System.out.print("Digite o 3º numero:");
        n3 = tec.nextInt();
        resul= compnum(n1,n2,n3);
        System.out.println(resul + " é o maior" );
    }
    
    public static int  compnum(int a , int b , int c){
        if(a>b){
            return a;
        }else if(b>c){
            return b;
        }else{
           return c ;
        }
    }

}
