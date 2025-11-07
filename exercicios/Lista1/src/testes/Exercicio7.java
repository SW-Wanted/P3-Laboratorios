/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import exercicio7.Lampada;

/**
 *
 * @author emanuel
 */
public class Exercicio7 {
    private void imprimirLampada(Lampada l) {
        System.out.println("[Lampada]");
        System.out.printf("[Marca - %s]\n", l.getMarca());
        System.out.printf("[Tipo - %s]\n", l.getTipo());
        System.out.printf("[Cor - %s]\n", l.getCor());
        System.out.printf("[Potencia - %f]\n", l.getPotencia());
        System.out.printf("[Voltagem - %s]\n", l.getVoltagem());
        System.out.printf("[Preco - %s]\n", l.getPreco());
        System.out.printf("[Status - %s]\n", (l.isStatus() ? "Ligada" : "Desligada"));
        System.out.println();
    }
    
    private void maiorPotencia(Lampada l1, Lampada l2) {
        if (l1.getPotencia() == l2.getPotencia())
            System.out.printf("As lampadas %s e %s tem a mesma potencia\n", l1.getMarca(), l2.getMarca());
        else if (l1.getPotencia() > l2.getPotencia())
            System.out.printf("A lampada %s tem maior Potencia em relacao a lampada %s\n", l1.getMarca(), l2.getMarca());
        else
            System.out.printf("A lampada %s tem maior Potencia em relacao a lampada %s\n", l2.getMarca(), l1.getMarca());
    }
    
    private void maisCara(Lampada l1, Lampada l2) {
        if (l1.getPreco() == l2.getPreco())
            System.out.printf("As lampadas %s e %s tem o mesmo preco\n", l1.getMarca(), l2.getMarca());
        else if (l1.getPreco() > l2.getPreco())
            System.out.printf("A lampada %s eh mais cara em relacao a lampada %s\n", l1.getMarca(), l2.getMarca());
        else
            System.out.printf("A lampada %s eh mais cara em relacao a lampada %s\n", l2.getMarca(), l1.getMarca());
    }
    
    public void testar() {
        Lampada led = new Lampada("Led", "Branca", " Philips", 15.0f, 45.0f, 1000.00d, true);
        Lampada fluorescente = new Lampada("Fluorescente", "Branca", "Panasonic", 5.0f, 20.0f, 500.00d, false);
        imprimirLampada(led);
        imprimirLampada(fluorescente);
        
        maiorPotencia(led, fluorescente);
        maisCara(led, fluorescente);
        
    }
}
