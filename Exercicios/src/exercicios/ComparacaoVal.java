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
public class ComparacaoVal {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        float soma = 0, n, div5 = 0, par = 0, valor, nulo = 0, valorp = 0;
        System.out.println("Deseja repetir quantas vezes? ");
        n = tec.nextInt();
        for (int c = 1; c <= n; c++) {
            System.out.println("Digite o " + c + "º valor : ");
            valor = tec.nextInt();
            soma += valor;
            if (valor == 0) {
                nulo += 1;
            }
            if ((valor % 5 == 0) && (valor > 0)) {
                div5 += 1;
                valorp += par;
            }
            if (valor % 2 == 0) {
                valorp += valor;
            }
        }
        float media = soma / n;
        System.out.println("A soma entre os valores é " + soma);
        System.out.println("A média entre os Valores é " + media);
        System.out.println(" A quantidade de Valores divisíveis por  5 são " + div5);
        System.out.println("A quantidade de Valores nulo é " + nulo);
        System.out.println("A soma dos Valores pares é : " + valorp);

    }

}
