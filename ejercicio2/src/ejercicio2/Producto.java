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
public class Producto {
    private int codigo;
    private double precioventa;
    private double preciocompra;
    private ArrayList<Pedido> pedidos;
    public ArrayList<Venta> ventas;
    private ArrayList<Proveedores> proveedores;
    public int cantidad;
    public int numventas;
    public Producto(int codigo,double precioventa, double preciocompra, int cantidad){
        this.codigo=codigo;
        this.cantidad=cantidad;
        this.preciocompra=preciocompra;
        this.precioventa=precioventa;
        this.pedidos = new ArrayList<>();
        this.ventas = new ArrayList<>();
        this.proveedores = new ArrayList<>();
        this.numventas=0;
    }
    public double getPrecioventa() {
        return precioventa;
    }
    public void setPrecioventa( double precioventa) {
        this.precioventa = precioventa;
    }
    public double getPreciocompra() {
        return preciocompra;
    }

    public void setPreciocompra( double preciocompra) {
        this.preciocompra = preciocompra;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad( int cantidad) {
        this.cantidad = cantidad;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo( int codigo) {
        this.codigo = codigo;
    }
    public boolean addProveedores(Proveedores proveedores){
        if(this.proveedores.add(proveedores)==true){
            return true;
        }else{
            return false;
        }
    }
   public boolean addPedido(Pedido pedido){
        if(this.pedidos.add(pedido)==true){
            return true;
        }else{
            return false;
        }
    }
   public boolean addVenta(Venta venta){
        if(this.ventas.add(venta)==true){
            return true;
        }else{
            return false;
        }
    }
    public void listarProveedores(){
       ArrayList<Proveedores> proveedores=this.proveedores;
       for (Proveedores proveedor: proveedores) {
                System.out.println(proveedor.getNombre());
            }
   }
     public void listarPedidos(){
       ArrayList<Pedido> pedidos=this.pedidos;
       for (Pedido pedido: pedidos) {
                System.out.println(pedido.getOrdenado());
            }
   }
      public void listarVentas(){
       ArrayList<Venta> ventas=this.ventas;
       for (Venta venta: ventas) {
                System.out.println(venta.getComprado());
            }
   }
}
