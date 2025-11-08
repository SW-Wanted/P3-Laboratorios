/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import exercicio11.Circulo;

/**
 *
 * @author emanuel
 */
public class Exercicio11 {
    public void testar() {
        Circulo c = new Circulo(10);
        System.out.println("Raio: " + c.getRaio());
        c.calcularArea();
        System.out.println("Area: " + c.getArea());
        c.calcularPerimetro();
        System.out.println("Perimetro: " + c.getPerimetro());
        c.setRaio(4);
        System.out.println("Raio: " + c.getRaio());
        c.calcularArea();
        System.out.println("Area: " + c.getArea());
        c.calcularPerimetro();
        System.out.println("Perimetro: " + c.getPerimetro());
    }
}
