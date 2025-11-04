/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import exercicio2.Televisor;

/**
 *
 * @author emanuel
 */
public class Exercicio2 {
    public void testar() {
        Televisor tv = new Televisor();
        tv.setNumeroCanal(99);
        System.out.println("Numero canal: " + tv.getNumeroCanal());
        System.out.println("Volume: " + tv.getVolume());
        tv.aumentarVolume(50);
        System.out.println("Volume + 50: " + tv.getVolume());
        tv.diminuirVolume(5);
        System.out.println("Volume - 5: " + tv.getVolume());
    }
}
