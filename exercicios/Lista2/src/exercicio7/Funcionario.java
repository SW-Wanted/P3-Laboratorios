/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio7;

/**
 *
 * @author emanuel
 */
public class Funcionario extends Pessoa {
    private int matricula;
    private double salario;

    public Funcionario(String nome, String sobrenome, int matricula, double salario) {
        super(nome, sobrenome);
        this.matricula = matricula;
        this.salario = salario >= 0 ? salario : 0;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0)
            this.salario = salario;
    }
    
    public double getSalarioPrimeiraPrestacao() {
        return salario * 0.6;
    }
    
    public double getSalarioSegundaPrestacao() {
        return salario * 0.4;
    }
    
}
