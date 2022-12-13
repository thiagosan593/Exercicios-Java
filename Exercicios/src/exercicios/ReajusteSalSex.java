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
public class ReajusteSalSex {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println(" Reajuste de Salário");
        System.out.println(" [1] Mulheres");
        System.out.println(" [2] Homens ");
        System.out.println("Escolha uma Opção");
        int sexo = tec.nextInt();
        switch (sexo) {

            case 1:
                System.out.print("Quantos Anos Trabalha na empresa :");
                int anos = tec.nextInt();
                System.out.print("Qual o seu salário :");
                float sal = tec.nextFloat();
                if (anos < 15) {
                    float nv_sal = (float) (sal + (sal * 5) / 100);
                    System.out.println("Seu novo salário é " + nv_sal + " R$");
                } else if ((anos >= 15 && anos < 20)) {
                    float nv_sal = (float) (sal + (sal * 12) / 100);
                    System.out.println("Seu novo salário é " + nv_sal + " R$");
                } else {
                    float nv_sal = (float) (sal + (sal * 23) / 100);
                    System.out.println("Seu novo salário é " + nv_sal + " R$");
                }
                break;
            case 2:
                System.out.print("Quantos Anos Trabalha na empresa :");
                int anos1 = tec.nextInt();
                System.out.print("Qual o seu salário :");
                float sal1 = tec.nextFloat();
                if (anos1 < 20) {
                    float nv_sal = (float) (sal1 + (sal1 * 3) / 100);
                    System.out.println("Seu novo salário é " + nv_sal + " R$");
                } else if ((anos1 >= 20 && anos1 < 30)) {
                    float nv_sal = (float) (sal1 + (sal1 * 13) / 100);
                    System.out.println("Seu novo salário é " + nv_sal + " R$");
                } else {
                    float nv_sal = (float) (sal1 + (sal1 * 25) / 100);
                    System.out.println("Seu novo salário é " + nv_sal + " R$");
                    break;
                }
        }

    }
}
