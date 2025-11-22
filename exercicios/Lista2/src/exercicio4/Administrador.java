/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4;

import exercicio3.Empregado;

/**
 *
 * @author emanuel
 */
public class Administrador extends Empregado {
    private double ajudaDeCusto; // (ajudas referentes a viagens, estadias, ...)

    public Administrador(String nome, int codigoSector, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, codigoSector, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public Administrador(String nome, String telefone, int codigoSector, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, telefone, codigoSector, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }
    
    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
    
    @Override
    public double obterSalarioLiquido() {
        return super.obterSalarioLiquido() + ajudaDeCusto;
    }
}
