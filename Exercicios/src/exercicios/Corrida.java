/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Corrida {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int quantjog;
        System.out.println("Infome a Quantidade de Jogadores: ");
        quantjog= tec.nextInt();
        String nomes[] = new String[quantjog];
        float tempos[] = new float[quantjog];
        String nomevencedor = " ";
        String nomeultimo = " ";
        int vencedor = 400;
        float somatempo = 0, media = 0;
        int ultimo = 0;

        for (int i = 0; i < tempos.length; i++) {  //Leitor de nome e tempo
            System.out.print("Informe o Nome do Piloto " + (i + 1) + ": ");
            nomes[i] = tec.next();
            System.out.print("Informe o tempo do Piloto " + (nomes[i]) + ": ");
            tempos[i] = tec.nextFloat();
            somatempo += tempos[i];   // somatoria de tempo

            if (tempos[i] <= vencedor) {   // VENCEDOR
                vencedor = (int) tempos[i];
                nomevencedor = nomes[i];

            }
            if (tempos[i] >= ultimo) {      //ULTIMO COLOCADO
                ultimo = (int) tempos[i];
                nomeultimo = nomes[i];
            }
            System.out.println(" ");
        }
        media = somatempo / quantjog;   // media de tempo
        System.out.println("==============================================================");
        System.out.println("                      RESULTADO                               ");
        System.out.println("O Vencedor foi " + nomevencedor + " com tempo de " + vencedor);
        System.out.println(" O ULTIMO foi " + nomeultimo + " com tempo de " + ultimo);
        System.out.println("  tempo medio " + media);
        System.out.println("===============================================================");

    }
}
