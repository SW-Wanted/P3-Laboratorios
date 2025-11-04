/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

/**
 *
 * @author emanuel
 */
public class Televisor {

    private int numeroCanal;
    private int volume;

    public int getNumeroCanal() {
        return numeroCanal;
    }

    public void setNumeroCanal(int numeroCanal) {
        this.numeroCanal = numeroCanal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public void aumentarVolume(int quantidade) {
        if (volume + quantidade > 100)
            volume += quantidade;
    }
    
    public void diminuirVolume(int quantidade) {
        if (volume - quantidade < 0)
            volume -= quantidade;
    }
}
