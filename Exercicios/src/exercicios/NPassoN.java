package exercicios;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Thiago Faculdade
 */
public class NPassoN {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String resp;
        do {
            System.out.print("Deseja Contar Até Quanto ? ");
            int n1 = tec.nextInt();
            System.out.print("Deseja contar de quanto em quanto?  ");
            int n2 = tec.nextInt();
            for (int cc = 0; cc <= n1; cc += n2) {
                System.out.print(cc + " ");
            }
            System.out.println("");
            System.out.println("deseja continuar ?  ");
            resp = tec.next();
        } while (resp.equals("S"));

    }
}
