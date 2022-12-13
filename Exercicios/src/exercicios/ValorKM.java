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
public class ValorKM {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println(" SERVIÇO DE LOCAÇÃO DE CARROS");
        System.out.println(" [1] Carro popular ");
        System.out.println(" [2] Carro de Luxo ");
        System.out.println(" Escolha Uma Opção");
        int carro = tec.nextInt();
        switch (carro) {
            case 1:
                float valor_km = 90;
                System.out.println(" Quantos dias Foram Alugados :");
                int dias = tec.nextInt();
                System.out.println(" quantos Km foram Percorridos : ");
                float km = tec.nextFloat();
                if (km <= 100) {
                    float totpagar = (float) ((valor_km * dias) + (km * 0.20));
                    System.out.println("Total A pagar " + totpagar);
                } else {
                    float totpagar = (float) ((valor_km * dias) + (km * 0.10));
                    System.out.println("Total A pagar " + totpagar);
                }
                break;

            case 2:
                float valor_km2 = 150;
                System.out.println(" Quantos dias Foram Alugados :");
                int dias2 = tec.nextInt();
                System.out.println(" quantos Km foram Percorridos : ");
                float km2 = tec.nextFloat();
                if (km2 <= 200) {
                    float totpagar = (float) ((valor_km2 * dias2) + (km2 * 0.30));
                    System.out.println("Total A pagar " + totpagar);
                } else {
                    float totpagar = (float) ((valor_km2 * dias2) + (km2 * 0.25));
                    System.out.println("Total A pagar " + totpagar);
                }
                break;
            default:
                System.out.println("Escolha  Inválida");
        }

    }

}

