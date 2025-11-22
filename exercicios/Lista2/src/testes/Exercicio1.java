/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import exercicio1.Pessoa;

/**
 *
 * @author emanuel
 */
public class Exercicio1 {
    public void testar() {
        Pessoa emanuel = new Pessoa("Emanuel dos Santos", "+244 933 353 623");
        
        System.out.println("Ola, eu sou o " + emanuel.getNome());
        System.out.println("Meu numero de telefone era: " + emanuel.getTelefone());
        emanuel.setTelefone("+244 953 366 373");
        System.out.println("Agora eh: " + emanuel.getTelefone());
    }
}
