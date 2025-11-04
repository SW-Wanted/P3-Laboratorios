/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author emanuel
 */
public class Conta {
    private double saldo;
    
    public Conta(double saldo)
    {
        this.saldo = saldo;
    }
    
    public double getSaldo()
    {
        return this.saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o instanceof Conta) {
            Conta conta = (Conta)o;
            return this.saldo == conta.saldo;
        } else {
            return false;
        }
    }
}
