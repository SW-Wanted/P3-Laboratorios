/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio10;

/**
 *
 * @author emanuel
 */
public class Retangulo {
    private float lado1;
    private float lado2;
    private float area;
    private float perimetro;

    public Retangulo(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        // Faz sentido calcular a area e o perimetro tao longo que exista os dois lados do rectangulo
        this.calcularArea();
        this.calcularPerimetro();
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public float getArea() {
        return area;
    }
    
    public float getPerimetro() {
        return perimetro;
    }
    
    public void calcularArea() {
        this.area = this.lado1 * this.lado2;
    }
    
    public void calcularPerimetro() {
        this.perimetro = (this.lado1 + this.lado2) * 2;
    }
}
