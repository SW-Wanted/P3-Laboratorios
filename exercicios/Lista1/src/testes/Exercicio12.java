/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import exercicio12.Funcionario;

/**
 *
 * @author emanuel
 */
public class Exercicio12 {
    public void testar() {
        Funcionario novoFuncionario = new Funcionario("Lionel", "Messi", 10, 25.50f);
        novoFuncionario.nomeCompleto();
        novoFuncionario.calcularSalario();
        novoFuncionario.incrementarHoras(8);
        novoFuncionario.calcularSalario();
    }
}
