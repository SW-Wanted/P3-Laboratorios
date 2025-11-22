/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio5;

import exercicio3.Empregado;

/**
 *
 * @author emanuel
 */
public class Operario extends Empregado {
    private double valorProducao;   // que corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário
    private double comissao;        // (que corresponde à percentagem do valorProducao que será adicionado ao vencimento base do operário

    public Operario(String nome, int codigoSector, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, codigoSector, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }
    
    public Operario(String nome, String telefone, int codigoSector, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, telefone, codigoSector, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }
    
    @Override
    public double obterSalarioLiquido() {
        double salarioLiquido = super.obterSalarioLiquido();
        double acrescimo = valorProducao * (comissao / 100.0);
        return salarioLiquido + acrescimo;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    
}
