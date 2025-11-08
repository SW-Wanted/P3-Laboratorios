/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio12;

/**
 *
 * @author emanuel
 */
public class Funcionario {
    private String nome;
    private String sobrenome;
    private int horasTrabalhadas;
    private float valorPorHora;

    public Funcionario(String nome, String sobrenome, int horasTrabalhadas, float valorPorHora) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSobrenome() {
        return this.sobrenome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.nome = sobrenome;
    }
    
    public int getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    public float getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(float valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
    
    public String nomeCompleto() {
        return this.nome + " " + this.sobrenome;
    }
    
    public void calcularSalario() {
        float salario = this.valorPorHora * this.horasTrabalhadas;
        System.out.println("Salario: " + salario);
    }
    // [Enunciado] • O método incrementarHoras adiciona um valor passado por parâmetro ao valor já existente no atributo valorPorHora.
    // Sugestão: eu acho que o prof. quis dizer 'adiciona um valor passado por parâmetro ao valor já existente no atributo horasTrabalhadas.' porque senao o metodo se chamaria incrementarValorPorHora
    public void incrementarHoras(int horas) {
        this.horasTrabalhadas += horas;
    }
}
