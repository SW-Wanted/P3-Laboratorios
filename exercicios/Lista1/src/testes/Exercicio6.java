/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import exercicio6.Funcionario;

/**
 *
 * @author emanuel
 */
public class Exercicio6 {
    public void testar() {
        Funcionario f1 = new Funcionario("Emanuel dos Santos", 1000000);
        Funcionario f2 = new Funcionario("Daniel Sofrimento", 20000);
        
        System.out.println("[Dados dos Funcionarios]");
        f1.consultarDados();
        f2.consultarDados();
        System.out.println("\n[Aumento Salarial]");
        System.out.printf("Aumento no %s de %d%%\n", f1.getNome(), 10);
        f1.aumentarSalario(10);
        System.out.printf("Aumento no %s de %d%%\n", f2.getNome(), 200);
        f2.aumentarSalario(200);
        System.out.println("\n[Dados dos Funcionarios]");
        f1.consultarDados();
        f2.consultarDados();
    }
}
