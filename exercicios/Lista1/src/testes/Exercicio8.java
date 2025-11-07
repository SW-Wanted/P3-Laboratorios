/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import exercicio8.Pessoa;

/**
 *
 * @author emanuel
 */
public class Exercicio8 {
    /*
    Crie também um método main que realize as seguintes operações:
        o Instancie um objeto do tipo Pessoa.
        o Atribua o seu nome ao atributo nome.
        o Atribua a sua idade ao atributo idade.
        o Chame o método dizerONome
        o Chame o método dizerAIdade
        o Chame o método fazerAniversario
        o Chame o método dizerAIdade
    */
    public void testar() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Emanuel dos Santos");
        pessoa.setIdade(21);
        pessoa.dizerONome();
        pessoa.dizerAIdade();
        pessoa.fazerAniversario();
        pessoa.dizerAIdade();
    }
}
