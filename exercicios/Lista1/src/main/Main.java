/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;
import testes.*;

/**
 *
 * @author emanuel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        do
        {
            System.out.println("-----------------------------------");
            System.out.println("[1] Exercicio 1");
            System.out.println("[2] Exercicio 2");
            System.out.println("[3] Exercicio 3");
            System.out.println("[4] Exercicio 4");
            System.out.println("[5] Exercicio 5");
            System.out.println("[6] Exercicio 6");
            System.out.println("[7] Exercicio 7");
            System.out.println("[0] Sair");
            System.out.println("-----------------------------------");
            System.out.print("Selecione um exercicio: ");
            opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                    Exercicio1 ex1 = new Exercicio1();
                    ex1.testar();
                    break;
                case 2:
                    Exercicio2 ex2 = new Exercicio2();
                    ex2.testar();
                    break;
                case 3:
                    Exercicio3 ex3 = new Exercicio3();
                    ex3.testar();
                    break;
                case 4:
                    Exercicio4 ex4 = new Exercicio4();
                    ex4.testar();
                    break;
                case 5:
                    Exercicio5 ex5 = new Exercicio5();
                    ex5.testar();
                    break;
                case 6:
                    Exercicio6 ex6 = new Exercicio6();
                    ex6.testar();
                    break;
                case 7:
                    Exercicio7 ex7 = new Exercicio7();
                    ex7.testar();
                    break;
                default:
                    System.out.println("Digite um numero valido!");
            }
        } while (opcao != 0);
    }
    
}

