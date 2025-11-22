/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import exercicio4.Administrador;

/**
 *
 * @author emanuel
 */
public class Exercicio4 {
    public void testar() {
        Administrador adm = new Administrador(
                "Carlos Gerente",
                "987-654-321",
                5,
                5000.00,
                20.0,
                1500.00
        );

        System.out.println("--- Dados do Administrador ---");
        System.out.println("Nome: " + adm.getNome());
        System.out.println("Salário Base: " + adm.getSalarioBase());
        System.out.println("Imposto: " + adm.getImposto() + "%");
        System.out.println("Ajuda de Custo: " + adm.getAjudaDeCusto());
        System.out.println("\n--- Alteração nas Ajudas de Custo ---");
        adm.setAjudaDeCusto(2500.00); // Aumentou a ajuda de custo

        System.out.println("Nova Ajuda de Custo: " + adm.getAjudaDeCusto());
        System.out.println("Novo Salário Final: " + adm.obterSalarioLiquido());
        adm.setSalarioBase(6000.00);
        System.out.println("\n--- Aumento do Salário Base para 6000 ---");
        System.out.println("Salário Final Recalculado: " + adm.obterSalarioLiquido());
    }
}
