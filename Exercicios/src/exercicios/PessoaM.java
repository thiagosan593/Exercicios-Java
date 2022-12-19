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
public class PessoaM {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int c = 0, idade, maior_idade = 0, m_acima30 = 0, f_acima18 = 0; // m_jovem= muher mais jovem
        float soma = 0, media = 0;
        String resposta, nome, sexo;
        String nome_m_jovem = " ";
        do {
            c++;
            System.out.println("");
            System.out.print("Insira o nome nº" + c);
            nome = tec.next();
            System.out.print("Insira o Sexo [M/F] ");
            sexo = tec.next();
            System.out.print("Insira a Idade : ");
            idade = tec.nextInt();
            soma += idade;
            media = soma / c;
            int idade_m_jovem = 0;
            if (sexo.equals("F") && idade > 18) {
                f_acima18 += 1;

            }
            if (sexo.equals("F") && idade <= idade_m_jovem) {
                idade_m_jovem = idade;

                nome_m_jovem = nome;
            }
            if (idade > maior_idade) {
                maior_idade = idade;
            }
            if (sexo.equals("M") && idade > 30) {
                m_acima30 += 1;
            }

            System.out.print("Deseja Continuar ? ");
            resposta = tec.next();
        } while (resposta.equals("S"));
        limparSaida();

        System.out.println("Maior idade Lida : " + maior_idade);
        System.out.printf("Nome da Mulher mais jovem %s" + nome_m_jovem);
        System.out.println("A media de Idade do Grupo é " + media);
        System.out.println("A quantidade de Homens acima de 30 é " + m_acima30);
        System.out.println("Quantidade de Mulheres Acima de 18 é " + f_acima18);

    }
}
