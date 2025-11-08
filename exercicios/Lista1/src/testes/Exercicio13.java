/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import exercicio13.Livro;

/**
 *
 * @author emanuel
 */
public class Exercicio13 {

    public void testar() {
        Livro livrofavorito = new Livro("Game of Thrones", 500);
        System.out.println("O livro " + livrofavorito.getTitulo() + " possui " + livrofavorito.getQtdPaginas() + " pá");
        livrofavorito.setPaginasLidas(50);
        livrofavorito.verificarProgresso();
        livrofavorito.setPaginasLidas(250);
        livrofavorito.verificarProgresso();
        Livro livro = new Livro("O poder do Hábito", 477, 50);
        livro.verificarProgresso();
    }
}
