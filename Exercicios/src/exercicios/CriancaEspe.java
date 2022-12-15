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
public class CriancaEspe {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("   CRIANCA ESPERANCA   ");
        System.out.println("-----------------------");
        System.out.println("[1] para doar R$10 ");
        System.out.println("[2] para doar R$25 ");
        System.out.println("[3] para doar R$50 ");
        System.out.println("[4] para doar Outros Valores ");
        System.out.println("[5] para Cancelar ");
        int num = tec.nextInt();
        int valor;
        switch (num) {
            case 1:
                valor = 10;
                break;
            case 2:
                valor = 25;
                break;
            case 3:
                valor = 50;
                break;
            case 4:
                System.out.println("Digite Um valor");
                valor = tec.nextInt();
                break;
            default:
                valor = 0;
        }
        System.out.println("--------------------------");
        System.out.println(" O valor doado foi de " + valor);
        System.out.println(" Muito Obrigado! ");
        System.out.println("--------------------------");

    }
}
