/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author emanuel
 */
public class Homem extends Mamifero {

    private boolean casado;

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public Homem(String nome, int idade, String corDosOlhos, boolean casado) {
        super(nome, idade, corDosOlhos);
        this.casado = casado;
    }

    @Override
    public void comunicar() {
        System.out.println(getNome() + " comunicando...");
        System.out.println(getNome() + " ja comunicou");
    }

    @Override
    public void aleitar() {
        System.out.println(getNome() + " aleitando...");
        System.out.println(getNome() + " ja comunicou");
    }
    
    
    public void rir() {
        System.out.println("kkkkkkk");
    }
    
    public void falar() {
        System.out.println("Bom dia");
    }
}