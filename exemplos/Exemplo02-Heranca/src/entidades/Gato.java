/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author emanuel
 */
public class Gato extends Mamifero {
    boolean cauda;

    public boolean isCauda() {
        return cauda;
    }

    public void setCauda(boolean cauda) {
        this.cauda = cauda;
    }
    
    public Gato(String nome, int idade, String corDosOlhos, boolean cauda) {
        super(nome, idade, corDosOlhos);
        this.cauda = cauda;
    }
    
    public void arranhar() {
        System.out.println("ksd;fjal");
    }
    
    public void miar() {
        System.out.println("Miau");
    }
}
