/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author emanuel
 */
public class Mamifero {

    private String nome;
    private int idade;
    private String corDosOlhos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCorDosOlhos() {
        return corDosOlhos;
    }

    public void setCorDosOlhos(String corDosOlhos) {
        this.corDosOlhos = corDosOlhos;
    }

    public Mamifero(String nome, int idade, String corDosOlhos) {
        this.nome = nome;
        this.idade = idade;
        this.corDosOlhos = corDosOlhos;
    }
    
    public void aleitar() {
        System.out.println("Mamifero Aleitando...");
        System.out.println("Mamifero ja Aleitou");
    }
    
    public void comunicar() {
        System.out.println("Mamifero Comunicando...");
        System.out.println("Mamifero ja Comunicou");
    }
}
