/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import exercicio3.Funcionario;

/**
 *
 * @author emanuel
 */
public class Exercicio3 {
    public void testar() {
        Funcionario joao = new Funcionario("Joao Miguel", 200000);
        System.out.println("Salario do " + joao.getNome() + " eh " + joao.getSalario());
        joao.aumentarSalario(100);
        System.out.println("Aumentou para " + joao.getSalario());
    }
}
