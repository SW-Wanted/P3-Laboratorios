/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import exercicio6.Vendedor;

/**
 *
 * @author emanuel
 */
public class Exercicio6 {
    public void testar() {
        var v1 = new Vendedor(
            "Maria Vendas", 
            "999-888-777", 
            10,
            1500.00, 
            10.0, 
            5000.00, 
            5.0
        );

        System.out.println("--- Ficha do Vendedor ---");
        System.out.println("Nome: " + v1.getNome());
        System.out.println("Salário Base: " + v1.getSalarioBase());
        System.out.println("Vendas no Mês: " + v1.getValorVendas());
        System.out.println("Taxa de Comissão: " + v1.getComissao() + "%");
        System.out.println("Resultado do Método: " + v1.obterSalarioLiquido());

        // Black Friday (Vendas explodiram)
        System.out.println("\n--- Cenário Pós-Black Friday ---");
        v1.setValorVendas(20000.00);
        System.out.println("Novas Vendas: " + v1.getValorVendas());
        System.out.println("Novo Salário: " + v1.obterSalarioLiquido());
    }
}
