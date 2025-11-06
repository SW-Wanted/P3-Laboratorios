/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import exercicio5.Cliente;

/**
 *
 * @author emanuel
 */
public class Exercicio5 {
    public void testar() {
        Cliente cliente1 = new Cliente(1, "Emanuel dos Santos");
        Cliente cliente2 = new Cliente(2, "Daniel Sediangani");
        System.out.println("[Cliente 1]");
        System.out.println("Id  : " + cliente1.getId());
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("[Cliente 2]");
        System.out.println("Id  : " + cliente2.getId());
        System.out.println("Nome: " + cliente2.getNome());
    }
}
