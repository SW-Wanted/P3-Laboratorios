/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio6;

import exercicio3.Empregado;

/**
 *
 * @author emanuel
 */
public class Vendedor extends Empregado {
    private double valorVendas; // correspondente ao valor monetário dos artigos vendidos
    private double comissao; // porcentagem do valorVendas que será adicionado ao vencimento base do Vendedor

    public Vendedor(String nome, int codigoSector, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, codigoSector, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public Vendedor(String nome, String telefone, int codigoSector, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, telefone, codigoSector, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }
    
    @Override
    public double obterSalarioLiquido() {
        double salarioLiquido = super.obterSalarioLiquido();
        double acrescimo = valorVendas * (comissao / 100.0);
        return salarioLiquido + acrescimo;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    
}
