/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;


import exercicio1.Aluno;
import java.time.LocalDate;
/**
 *
 * @author emanuel
 */
public class Exercicio1 {
    
    public void apresentar(Aluno aluno) {
        System.out.println("Ola, eu sou o " + aluno.getNome());
        System.out.println("Tenho " + aluno.calcularIdade() + " anos de idade");
        System.out.println("Peso " + aluno.getPeso());
        System.out.println("A minha altura eh " + aluno.getAltura());
    }
    
    public void testar() {
        Aluno emanuel = new Aluno("Emanuel", 50, 50, LocalDate.parse("2004-03-27"));
        Aluno carlos = new Aluno("Emanuel", 50, 50, LocalDate.parse("2003-12-01"));
        apresentar(emanuel);
        apresentar(carlos);
    }
}
