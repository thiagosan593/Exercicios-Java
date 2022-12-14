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
public class EmprestimoParc {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        float juros = 20;
        System.out.print(" Qual valor do empréstimo ? ");
        float valor = tec.nextInt();
        float valor_juros = (valor * juros) / 100;
        System.out.println("O valor de Acréscimo é de " + valor_juros);
        float valor_c_taxa = valor + valor_juros;
        System.out.println("o valor total a pagar será de " + valor_c_taxa);
        System.out.println("");
        System.out.print("Deseja Dividir em quantas vezes : ");
        int parcela = tec.nextInt();
        float valor_parcela = (valor_c_taxa / parcela);
        System.out.println(" O Valor das " + parcela + " Parcelas é " + valor_parcela + "R$");

    }

}
