/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import static exercicios.LimpaTela.limparSaida;
import java.util.Scanner;

/**
 *
 * @author Thiago Santos
 */
public class VetorNotasAlunos {

    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        int quantidade = 4;
        String nome[] = new String[quantidade];
        float n1[] = new float[quantidade];
        float n2[] = new float[quantidade];
        float media[] = new float[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("NOME : ");
            nome[i] = tec.next();
            System.out.print("NOTA 1:  ");
            n1[i] = tec.nextInt();
            System.out.print("NOTA 2: ");
            n2[i] = tec.nextInt();
            media[i] = (n1[i] + n2[i]) / 2;
            limparSaida();
        }

        System.out.println("LISTAGEM DE ALUNOS ");
        System.out.println("-------------------");
        for (int i = 0; i < quantidade; i++) {
            System.out.println(nome[i] + "    " + media[i]);

        }

    }
}
