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
public class nome {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = tec.nextLine();
        System.out.println("Olá " + nome + " Seja bem vindo");

    }
}
