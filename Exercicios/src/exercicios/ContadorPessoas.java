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
public class ContadorPessoas {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String sexo;
        float peso, peso_f = 0, media = 0, peso_maior = 0;
        int cont_f = 0, peso_a100 = 0;

        System.out.println("Deseja Cadastrar quantas Pessoas? ");
        int num_cadastro = tec.nextInt();

        for (int i = 0; i < num_cadastro; i++) {
            System.out.println("DIGITE SEU SEXO [M/F]");
            sexo = tec.next();
            System.out.println("QUAL O SEU PESO ? ");
            peso = tec.nextFloat();
            if (sexo.equals("F")) {
                cont_f += 1;  // quantidade de Mulheres 
                peso_f += peso; // somatoria de peso 
                media = peso_f / cont_f; // media de peso 
            }
            if (sexo.equals("M") && peso >= 100) {
                peso_a100 += 1;  //peso acima de 100
            }
            if (sexo.equals("M") && peso > peso_maior) {
                peso_maior = peso;
            }
        }
        System.out.println("A QUANTIDADE DE MULHERES CADASTRADAS FOI " + cont_f);
        System.out.println("A Quantidade de Homens Acima de 100 é " + peso_a100);
        System.out.println("A Média De Peso Entre as mulheres é " + media);
        System.out.println("O Maior peso entre os Homens é " + peso_maior);

    }
}
