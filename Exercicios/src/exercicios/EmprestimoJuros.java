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
public class EmprestimoJuros {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int txjuros = 40;
        System.out.print("Qual o seu Nome : ");
        String nome = tec.nextLine();
        System.out.println("---------------------------------------  ");
        System.out.println(nome + " SEJA BEM VINDO AO BANCO UNISUL  ");
        System.out.println("---------------------------------------  ");
        System.out.println(" Atualmente nossa Taxa de Juros é de " + txjuros + "%");
        System.out.print("Qual valor deseja pegar de Empréstimo ");
        float valor = tec.nextFloat();
        float juros = (valor * txjuros) / 100;
        System.out.println("O Acréscimo será de " + juros + " Totalizando " + (valor + juros));
        System.out.println("");
        System.out.print("Quantas parcelas Deseja Dividir? ");
        int parc = tec.nextInt();
        float totpagar = (valor + juros) / parc;
        System.out.println(" O Valor a pagar será de " + totpagar + " R$");

    }
}
