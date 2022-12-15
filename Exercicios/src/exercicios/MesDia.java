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
public class MesDia {

    public static void main(String[] args) {

        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago",
            "Set", "Out", "Nov", "Dez"};

        for (int c = 0; c < mes.length; c++) {
            if (2022 % 4 == 0) {
                int tot[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                System.out.println("  O Mês de " + mes[c] + " tem " + tot[c] + " Dias");
            } else {
                int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                System.out.println("  O Mês de " + mes[c] + " tem " + tot[c] + " Dias");
            }

        }
    }
}
