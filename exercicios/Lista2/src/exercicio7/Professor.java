/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio7;

/**
 *
 * @author emanuel
 */
public class Professor extends Funcionario {

    public Professor(String nome, String sobrenome, int matricula, double salario) {
        super(nome, sobrenome, matricula, salario);
    }

    @Override
    public double getSalarioPrimeiraPrestacao() {
        return super.getSalario();
    }
    
    @Override
    public double getSalarioSegundaPrestacao() {
        return 0.0;
    }
}
