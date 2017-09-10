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
public class Inventario {
    private ArrayList<Producto> productos;
    private ArrayList<Proveedores> proveedores;
    private ArrayList<Pedido> pedidos;
    private ArrayList<Venta> ventas;
    private double gastos;
    private double ganancias;
    public Inventario(){
        this.productos = new ArrayList<>();
        this.pedidos = new ArrayList<>();
        this.ventas = new ArrayList<>();
        this.proveedores = new ArrayList<>();
        this.ganancias=0;
        this.gastos=0;
    }
   public boolean addProducto(Producto producto){
        if(this.productos.add(producto)==true){
            return true;
        }else{
            return false;
        }
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
   public void listarProductos(){
       ArrayList<Producto> productos=this.productos;
       for (Producto producto: productos) {
                System.out.println(""+producto.getCantidad()+" "+producto.getPreciocompra()+"");
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
   public void registrarPedido(Proveedores proveedor,int ordenado,Producto producto){
       int a=producto.getCantidad();
       Pedido p= new Pedido(proveedor,ordenado,producto);
       a+=ordenado;
       producto.setCantidad(a);
       double b=producto.getPreciocompra();
       p.costo=b*ordenado;
       this.gastos+=b*ordenado;
   }
   public void registrarVenta(int compra,Producto producto){
       int a=producto.getCantidad();
       Venta p= new Venta(compra,producto);
       a-=compra;
       producto.setCantidad(a);
       double b=producto.getPreciocompra();
       p.ganancia=b*compra;
       this.ganancias+=b*compra;
       producto.numventas+=compra;
   }
   
   public ArrayList<Producto> agotados(){
       ArrayList<Producto> productos=this.productos;
       ArrayList<Producto> agotado1;
       agotado1= new ArrayList<>();
       for (Producto producto: productos) {
           if(producto.cantidad==0){
            agotado1.add(producto);   
           }
            }
       return agotado1;
   }
    public Producto masvendido(){
       ArrayList<Producto> productos=this.productos;
       Producto p1= new Producto(0,0,0);
       int a=0;
       for (Producto producto: productos) {
           if(producto.numventas>a){
            p1.equals(producto);   
           }
            }
       return p1;
   }
}

