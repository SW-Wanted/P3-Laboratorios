/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import exercicio14.Agenda;

/**
 *
 * @author emanuel
 */
public class Exercicio14 {
    public void testar() {
        Agenda agenda = new Agenda();
        agenda.addContacto("Eliane", 932345678);
        agenda.addContacto("Laura", 919876543);
        agenda.addContacto ("Adriel", 963452345);
        agenda.imprime();
    }
}
