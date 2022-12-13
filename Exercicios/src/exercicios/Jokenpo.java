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
public class Jokenpo {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
         System.out.println("MENU");
        System.out.println("0 - Pedra");
        System.out.println("1 - Papel");
        System.out.println("2- Tesoura");
        System.out.print("Esolha um Número: ");
        int num = tec.nextInt();
        if ((num>=0) && (num<=2)){
        int comp = (int) (Math.random()*(2-0)); 
           if (comp==0){
               System.out.println("O computador escolheu Pedra");
           }else if (comp ==1){
               System.out.println("O computador escolheu Papel");
           }else {
               System.out.println("O computador Escolheu Tes");
           }
           if (num==comp){
               System.out.println("Jogo empatado");
           }else if ((num==0 && comp==2) || (num == 1 && (comp == 0)) ||( num == 2 && comp == 1)){
               System.out.println("Parabéns, você Ganhou"); 
        }else
                System.out.println("O computador Ganhou");
            
        }else{
            System.out.println("Opção Inválida");
        }

    }
}
