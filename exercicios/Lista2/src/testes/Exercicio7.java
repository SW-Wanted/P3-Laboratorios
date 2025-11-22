/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import exercicio7.Funcionario;
import exercicio7.Pessoa;
import exercicio7.Professor;

/**
 *
 * @author emanuel
 */
public class Exercicio7 {
    public void testar() {
        // Pessoa 1 (Construtor com parâmetros)
        Pessoa pessoa1 = new Pessoa("Pedro", "Silva");

        // Pessoa 2 (Funcionario) - Salário 182.000 Akz
        Funcionario pessoa2 = new Funcionario("Oscar", "Ribas", 123, 182000.0);

        // Pessoa 3 (Professor) - Salário 1.500 Akz
        // Atenção: Professor é subclasse de Funcionario, mas o enunciado pediu
        // para tratar como "Professor"
        Professor pessoa3 = new Professor("Oscar", "Cardozo", 456, 1500.0);

        System.out.println("--- Nomes Completos ---");
        System.out.println("Pessoa 1: " + pessoa1.getNomeCompleto());
        System.out.println("Pessoa 2: " + pessoa2.getNomeCompleto());
        System.out.println("Pessoa 3: " + pessoa3.getNomeCompleto());
        
        System.out.println("\n--- Detalhes dos Salários ---");
        
        System.out.println("Funcionário: " + pessoa2.getNomeCompleto());
        System.out.println("Salário Total: " + pessoa2.getSalario() + " Akz");
        System.out.println("1ª Prestação (60%): " + pessoa2.getSalarioPrimeiraPrestacao() + " Akz");
        System.out.println("2ª Prestação (40%): " + pessoa2.getSalarioSegundaPrestacao() + " Akz");

        System.out.println("---------------------------");
        
        System.out.println("Professor: " + pessoa3.getNomeCompleto());
        System.out.println("Salário Total: " + pessoa3.getSalario() + " Akz");
        System.out.println("1ª Prestação (Tudo): " + pessoa3.getSalarioPrimeiraPrestacao() + " Akz");
        System.out.println("2ª Prestação (Nada): " + pessoa3.getSalarioSegundaPrestacao() + " Akz");
    }
}
