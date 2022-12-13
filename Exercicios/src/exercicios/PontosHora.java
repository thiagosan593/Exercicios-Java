/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Thiago Faculdade
 */
public class PontosHora {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println(" Quantas Horas Por mês de Atividades: ");
        float horas = tec.nextFloat();
        if (horas < 10) {
            float tot = horas * 2;
            float din = (float) (tot * 0.05);
            System.out.println(" Você tem o total a " + tot + " Pontos ");
            System.out.println(" E equivalem a " + din + " R$");
        } else if ((horas >= 10) && (horas < 20)) {
            float tot = horas * 5;
            float din = (float) (tot * 0.05);
            System.out.println(" Você tem o total a " + tot + " Pontos ");
            System.out.println(" E equivalem a " + din + " R$");
        } else {
            float tot = horas * 10;
            float din = (float) (tot * 0.05);
            System.out.println(" Você tem o total a " + tot + " Pontos ");
            System.out.println(" E equivalem a " + din + " R$");
        }

    }
}
