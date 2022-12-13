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
public class Emprestimo {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("FINANCIAMENTO DE IMÓVEIS ");
        System.out.println("-------------------------");
        System.out.print("Qual o valor do Imovel :  ");
        float valor_i = tec.nextFloat();
        System.out.print("Qual o valor do seu Salário : ");
        float sal = tec.nextFloat();
        System.out.print("Quantas Parcelas Deseja Dividir : ");
        int parc = tec.nextInt();
        float tot =  sal-(sal*70)/100;
        float q_parc = valor_i/parc;
        System.out.println("Valor Máximo parcela " + tot);
        System.out.println("Valor da parcela por mÊs " + q_parc);
        if(q_parc<=tot){
            System.out.println("-------------------------");
            System.out.println("   Empréstimo Aprovado   ");
            System.out.println(" Valor da Parcela " + (valor_i/parc));
            System.out.println("-------------------------");
        }else{
            System.out.println("-------------------------");
            System.out.println("  Empréstimo não Aprovado");
            System.out.println("-------------------------");
        }




                
    }
}
