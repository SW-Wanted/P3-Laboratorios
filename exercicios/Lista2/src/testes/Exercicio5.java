/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import exercicio5.Operario;

/**
 *
 * @author emanuel
 */
public class Exercicio5 {

    public void testar() {
        Operario op = new Operario(
                "João Fabril",
                "911-222-333",
                2,
                2000.00,
                10.0,
                10000.00,
                5.0
        );

        System.out.println("--- Dados Iniciais do Operário ---");
        System.out.println("Nome: " + op.getNome());
        System.out.println("Valor Produção: " + op.getValorProducao());
        System.out.println("Comissão: " + op.getComissao() + "%");
        System.out.println("Total Obtido: " + op.obterSalarioLiquido());

        // O operário trabalhou muito e produziu o dobro
        System.out.println("\n--- Após Mês de Alta Produção ---");
        op.setValorProducao(20000.00);
        
        System.out.println("Novo Valor Produção: " + op.getValorProducao());
        System.out.println("Novo Salário Calculado: " + op.obterSalarioLiquido());
    }
}
