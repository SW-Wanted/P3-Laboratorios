/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import exercicio2.Fornecedor;

/**
 *
 * @author emanuel
 */
public class Exercicio2 {
    public void testar() {
       Fornecedor forn = new Fornecedor(
            "TechSupply Lda",
            "222-555-999", 
            5000.00, 
            1200.00
        );

        System.out.println("--- Dados do Fornecedor ---");
        System.out.println("Nome: " + forn.getNome());
        System.out.println("Telefone: " + forn.getTelefone());
        System.out.println("\n--- Situação Financeira Inicial ---");
        System.out.println("Crédito Limite: " + forn.getValorCredito());
        System.out.println("Dívida Atual: " + forn.getValorDivida());
        System.out.println("Saldo Disponível: " + forn.obterSaldo());
        double novaDivida = forn.getValorDivida() + 800.00;
        forn.setValorDivida(novaDivida);
        System.out.println("\n--- Após Nova Compra de 800.00 ---");
        System.out.println("Nova Dívida: " + forn.getValorDivida());
        System.out.println("Novo Saldo Disponível: " + forn.obterSaldo());
        forn.setValorCredito(10000.00);
        System.out.println("\n--- Após Aumento de Limite de Crédito ---");
        System.out.println("Novo Crédito: " + forn.getValorCredito());
        System.out.println("Saldo Atualizado: " + forn.obterSaldo());
    }
}
