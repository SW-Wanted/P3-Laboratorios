/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import exercicio10.Retangulo;

/**
 *
 * @author emanuel
 */
public class Exercicio10 {
    public void testar() {
        Retangulo rect = new Retangulo(10, 5);
        System.out.println("Lado1 = " + rect.getLado1());
        System.out.println("Lado2 = " + rect.getLado2());
        rect.calcularArea();
        rect.calcularPerimetro();
        System.out.println("Area = " + rect.getArea());
        System.out.println("Perimetro = " + rect.getPerimetro());
        rect.setLado2(7);
        System.out.println("Lado1 = " + rect.getLado1());
        System.out.println("Lado2 = " + rect.getLado2());
        rect.calcularArea();
        rect.calcularPerimetro();
        System.out.println("Area = " + rect.getArea());
        System.out.println("Perimetro = " + rect.getPerimetro());
    }
}
