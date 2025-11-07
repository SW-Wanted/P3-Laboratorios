/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import exercicio9.Porta;

/**
 *
 * @author emanuel
 */
public class Exercicio9 {
    public void testar() {
        Porta porta = new Porta(false, "Castanha", 10, 10, 1.5f);
        porta.open();
        porta.close();
        porta.paint("Amarelo");
        porta.paint("Azul");
        porta.setDimX(5);
        porta.setDimY(5);
        porta.setDimZ(2);
        System.out.println("Estado: " + porta.isOpen());
    }
}
