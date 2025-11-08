/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio13;

/**
 *
 * @author emanuel
 */
public class Livro {
    private String titulo;
    private int qtdPaginas;
    private int paginasLidas;

    public Livro(String titulo, int qtdPaginas) {
        this.titulo = titulo;
        this.qtdPaginas = qtdPaginas;
    }

    public Livro(String titulo, int qtdPaginas, int paginasLidas) {
        this.titulo = titulo;
        this.qtdPaginas = qtdPaginas;
        this.paginasLidas = paginasLidas;
    }
    

    public int getPaginasLidas() {
        return paginasLidas;
    }
    
    public void setPaginasLidas(int paginasLidas) {
        this.paginasLidas = paginasLidas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }
    
    public void verificarProgresso() {
        float percentagem = (paginasLidas / (float)qtdPaginas) * 100;
        System.out.println("Você já leu " + percentagem + "% do livro");
    }
}
