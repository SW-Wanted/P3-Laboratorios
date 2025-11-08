/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio11;

/**
 *
 * @author emanuel
 */
public class Circulo {
    private float raio;
    private float area;
    private float perimetro;
    
    public Circulo(float raio) {
        this.raio = raio;
        // Faz sentido calcular a area e o perimetro tao longo que exista um raio
        this.calcularArea();
        this.calcularPerimetro();
    }
    public void setRaio(float raio) {
        this.raio = raio;
    }
    
    public float getRaio() {
        return this.raio;
    }
    
    public float getArea() {
        return this.area;
    }
    
    public float getPerimetro() {
        return this.perimetro;
    }
    
    public void calcularArea() {
        this.area = 3.14f * raio * raio;
    }
    
    public void calcularPerimetro() {
        this.perimetro = 2 * 3.14f * raio;
    }
}
