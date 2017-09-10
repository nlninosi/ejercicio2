/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Nicolas
 */
public class Venta {
    public Producto producto;
    public int comprado;
    public double ganancia;
    public Venta(int comprado, Producto producto){
        this.comprado=comprado;
        this.producto=producto;
        this.ganancia=0;
    }
    public int getComprado() {
        return comprado;
    }
    public void setComprado( int comprado) {
        this.comprado = comprado;
    }
     public void setGanancia( int ganancia) {
        this.ganancia = ganancia;
    }
}
