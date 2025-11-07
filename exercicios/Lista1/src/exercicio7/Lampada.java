/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio7;

/**
 *
 * @author emanuel
 */
public class Lampada {
    private String tipo;
    private String cor;
    private String marca;
    private float voltagem;
    private float potencia;
    private double preco;
    private boolean status;

    public Lampada(String tipo, String cor, String marca, float voltagem, float potencia, double preco, boolean status) {
        this.tipo = tipo;
        this.cor = cor;
        this.marca = marca;
        this.voltagem = voltagem;
        this.potencia = potencia;
        this.preco = preco;
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(float voltagem) {
        this.voltagem = voltagem;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }
    
    public void acender() {
        if (!this.status)
            this.status = true;
    }
    
    public void apagar() {
        if (this.status)
            this.status = false;
    }
}
