/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio9;

/**
 *
 * @author emanuel
 */
public class Porta {
    private boolean aberta;
    private String cor;
    private float dimX;
    private float dimY;
    private float dimZ;

    public Porta(boolean aberta, String cor, float dimX, float dimY, float dimZ) {
        this.aberta = aberta;
        this.cor = cor;
        this.dimX = dimX;
        this.dimY = dimY;
        this.dimZ = dimZ;
    }
    
    public void open() {
        if (!this.aberta)
            aberta = true;
    }
    
    public void close() {
        if (this.aberta)
            aberta = false;
    }
    
    public void paint(String cor) {
        this.cor = cor;
    }
    
    public boolean isOpen() {
        return this.aberta;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getDimX() {
        return dimX;
    }

    public void setDimX(float dimX) {
        this.dimX = dimX;
    }

    public float getDimY() {
        return dimY;
    }

    public void setDimY(float dimY) {
        this.dimY = dimY;
    }

    public float getDimZ() {
        return dimZ;
    }

    public void setDimZ(float dimZ) {
        this.dimZ = dimZ;
    }
}
