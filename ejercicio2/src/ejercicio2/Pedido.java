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
public class Pedido {
    public Producto producto;
    private int ordenado;
    public Proveedores proveedor;
    public double costo;
    public Pedido(Proveedores proveedor,int ordenado, Producto producto){
        this.ordenado=ordenado;
        this.producto=producto;
        this.proveedor=proveedor;
    }
    public int getOrdenado() {
        return ordenado;
    }
    public void setOrdenado( int ordenado) {
        this.ordenado = ordenado;
    }
}
