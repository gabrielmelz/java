/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pacetech.aula01;

import java.util.Scanner;

/**
 *
 */
public class Conversao {

    public static void main(String args[]) {
        float metros, quilometro, metro_cubico, litros;
        int opcao;

        Scanner menu = new Scanner(System.in);

        while (true) {
            System.out.println("Digite 1 para converter metros cúbico em litros");
            System.out.println("Digite 2 para converter quilômetros em metros");
            System.out.println("Digite 3 para sair do sistema");
            System.out.println("Digite uma opção: ");

           opcao = menu.nextInt();

            if (opcao == 1) {
                System.out.println("\nDigite o valor do metro cúbico a ser convertido em litro");
                metro_cubico = menu.nextInt();
                litros = (metro_cubico * 1000);
                System.out.println("\n" + metro_cubico + " metro(s) é equivalente a: " + litros + " quilômetros\n");
            }
            if (opcao == 2) {
                System.out.println("\nDigite o valor do quilômetros a ser convertido em metros");
                quilometro = menu.nextInt();
                metros = (quilometro * 1000);
                System.out.println("\n" + quilometro + " quilometro(s) equivale a " + metros + " metro(s)\n");
            }
            if (opcao == 3) {
                System.out.println("encerrando programa");
                System.exit(0);
            }
        }
    }

}