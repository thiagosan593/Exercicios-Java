/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Thiago Santos
 */
public class AlistamentoMilitar {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Calendar anoAtual = Calendar.getInstance();
        int year = anoAtual.get(Calendar.YEAR);

        System.out.print(" Qual seu Ano de Nascimento ?  ");
        int nasc = tec.nextInt();
        int idade = year - nasc;
        if (idade > 18) {
            int acima = idade - 18;
            System.out.println("sua idade é de " + idade + " e ja passou " + acima + " Ano(s) do alistamento");
        } else {
            int falta = 18 - idade;
            System.out.println("sua idade é de " + idade + " e falta  " + falta +

" Ano(s) do alistamento");
        }

    }
}
