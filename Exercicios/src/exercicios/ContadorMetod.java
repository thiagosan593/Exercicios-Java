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
public class ContadorMetod {
    public static void main(String[] args) {
        System.out.println("Vai começar a contagem");
        System.out.println(contador(1,5));

    }
    public static String contador(int i , int f){
        String s= " ";
        for (int c=i;c<=f;c++){
            s+=c+" ";
        }
        return s;
    }

}
