/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author emanuel
 */
public class Cao extends Mamifero{
    private boolean cauda;

    public boolean isCauda() {
        return cauda;
    }

    public void setCauda(boolean cauda) {
        this.cauda = cauda;
    }

    public Cao(boolean cauda, String nome, int idade, String corDosOlhos) {
        super(nome, idade, corDosOlhos);
        this.cauda = cauda;
    }
        
    public void morder() {
        System.out.println("Hiam!");
    }
    
    public void latir() {
        System.out.println("Uau Uau!!");
    }
}
