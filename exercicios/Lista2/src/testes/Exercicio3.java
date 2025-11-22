/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import exercicio3.Empregado;

/**
 *
 * @author emanuel
 */
public class Exercicio3 {
    public void testar() {
        Empregado emp1 = new Empregado("Ana Silva", "953366373", 101, 2000.00, 15.0);
        System.out.println("--- Dados Iniciais ---");
        System.out.println("Nome: " + emp1.getNome());
        System.out.println("Salário Base: " + emp1.getSalarioBase());
        System.out.println("Imposto: " + emp1.getImposto() + "%");
        
        System.out.println("Salário Líquido: " + emp1.obterSalarioLiquido());

        System.out.println("\n--- Após Aumento Salarial ---");
        
        // Testando modificadores (Setters)
        emp1.setSalarioBase(3000.00); // Aumentou para 3000
        emp1.setImposto(20.0);        // Imposto subiu para 20%
        
        System.out.println("Novo Salário Base: " + emp1.getSalarioBase());
        System.out.println("Novo Imposto: " + emp1.getImposto() + "%");
        System.out.println("Novo Salário Líquido: " + emp1.obterSalarioLiquido());
    }
}
