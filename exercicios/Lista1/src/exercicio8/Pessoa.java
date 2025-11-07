/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio8;

/**
 *
 * @author emanuel
 */
public class Pessoa {
    private String nome;
    private int idade;
    
    public void dizerONome() {
        System.out.println("Olá, meu nome é " + this.nome);
    }
    
    public void dizerAIdade() {
        System.out.println("Ola, tenho " + this.idade + " anos");
    }
    
    public void fazerAniversario() {
        this.idade++;
    }

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
}
