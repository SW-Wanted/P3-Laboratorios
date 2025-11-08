/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio14;

import java.util.ArrayList;

/**
 *
 * @author emanuel
 */
public class Agenda {
    
    ArrayList<Contacto> contactos;

    public Agenda() {
        contactos = new ArrayList<>();
    }
    
    public void addContacto(String nome, int telefone) {
        Contacto novoContacto = new Contacto(nome, telefone);
        contactos.add(novoContacto);
    }
    
    public void imprime() {
        for (Contacto c : contactos) {
            System.out.println("Nome: " + c.getNome() + " - Telefone: " + c.getTelefone());
        }
        System.out.println("Fim da Lista de Contactos");
    }
}
