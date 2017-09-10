/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.*;

/**
 *
 * @author Nicolas
 */
public class Proveedores {
    private String nombre;
    private double deuda;
    private double pago;
    private ArrayList<Producto> productos;
    public Proveedores(String nombre){
     this.deuda=0;
     this.pago=0;
     this.nombre=nombre;
     this.productos = new ArrayList<>();
    }
    public boolean addProducto(Producto producto){
        if(this.productos.add(producto)==true){
            return true;
        }else{
            return false;
        }
    }
    public String getNombre(){
        return nombre;
    }
    public double getDeuda(){
        return deuda;
    }
    public void listarProductos(){
       ArrayList<Producto> productos=this.productos;
       for (Producto producto: productos) {
                System.out.println(""+producto.getCantidad()+""+producto.getPreciocompra()+"");
            }
   }
}
