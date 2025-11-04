/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.ArrayList;
import entidades.Conta;

/**
 *
 * @author emanuel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Conta> contas = new ArrayList<>();
        Conta c1 = new Conta(2000);
        Conta c2 = new Conta(1500);
        contas.add(c1);
        contas.add(c2);
        System.out.println(c1.equals(c2));
    }
    
}
