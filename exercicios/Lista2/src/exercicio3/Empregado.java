/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;

import exercicio1.Pessoa;

/**
 *
 * @author emanuel
 */
public class Empregado extends Pessoa {
    int codigoSector;
    double salarioBase; // (vencimento base)
    double imposto;     // (percentagem retida dos impostos)

    public Empregado(String nome, int codigoSector, double salarioBase, double imposto) {
        super(nome);
        this.codigoSector = codigoSector;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }
    
    public Empregado(String nome, String telefone, int codigoSector, double salarioBase, double imposto) {
        super(nome, telefone);
        this.codigoSector = codigoSector;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public int getCodigoSector() {
        return codigoSector;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    
    /* O método calcularSalario por convenção não deve retornar nada, 
     * mas não tem um atributo que merecia o seu valor, pois o 'salarioBase'
     * é a base de todos os tipos de salários. Por essa razão eu irei renomear
     * o nome do método para 'obterSalarioLiquido' e retornar 'double'.
     */
    public double obterSalarioLiquido() {
        double valorDesconto = salarioBase * (imposto / 100.0);
        return salarioBase - valorDesconto;
    }
}
