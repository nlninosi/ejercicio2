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
    public double gastos;
    public double ganancias;
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
                System.out.println("Codigo: "+producto.getCodigo()+"Cantidad: "+producto.getCantidad()+"Numero de ventas: "+producto.numventas+"Precio de compra: "+producto.getPreciocompra()+"Precio de venta: "+producto.getPrecioventa()+"");
            }
   }
   public void listarProveedores(){
       ArrayList<Proveedores> proveedores=this.proveedores;
       for (Proveedores proveedor: proveedores) {
                System.out.println(proveedor.getNombre()+" deudad: "+proveedor.getDeuda());
            }
   }
   public void listarPedidos(){
       ArrayList<Pedido> pedidos=this.pedidos;
       for (Pedido pedido: pedidos) {
                System.out.println("Nombre proveedor:"+pedido.proveedor.getNombre()+" Codigo del producto"+pedido.producto.getCodigo()+" Cantidad Ordenada"+pedido.getOrdenado()+" Costo"+pedido.costo);
            }
   }
      public void listarVentas(){
       ArrayList<Venta> ventas=this.ventas;
       for (Venta venta: ventas) {
                System.out.println(" Codigo del producto"+venta.producto.getCodigo()+" Cantidad Comprada"+venta.comprado+" Ganancia"+venta.ganancia);
            }
   }
   public void registrarPedido(String nombre,int ordenado,int codigo){
       ArrayList<Proveedores> proveedores=this.proveedores;
       Proveedores pr1=new Proveedores("");
       Producto p1=new Producto(0,0,0,0);
       ArrayList<Producto> productos=this.productos;
       for (Producto producto: productos) {
                if(producto.getCodigo()==codigo){
                    p1=producto;
                    break;
                }
            }
       for (Proveedores proveedor: proveedores) {
                if(proveedor.getNombre().equals(nombre)){
                    pr1=proveedor;
                    break;
                }
            }
       int a=p1.getCantidad();
       Pedido p= new Pedido(pr1,ordenado,p1);
       a+=ordenado;
       p1.setCantidad(a);
       double b=p1.getPreciocompra();
       p.costo=b*ordenado;
       this.gastos+=b*ordenado;
       addPedido(p);
   }
   public void registrarVenta(int compra,int codigo){
       Producto p1=new Producto(0,0,0,0);
       ArrayList<Producto> productos=this.productos;
       for (Producto producto: productos) {
                if(producto.getCodigo()==codigo){
                    p1=producto;
                    break;
                }
            }
       int a=p1.getCantidad();
       Venta p= new Venta(compra,p1);
       a-=compra;
       p1.setCantidad(a);
       double b=p1.getPreciocompra();
       p.ganancia=b*compra;
       this.ganancias+=b*compra;
       p1.numventas+=compra;
       addVenta(p);
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
   public void listaAgotados(){
       ArrayList<Producto> i=agotados();
       for (Producto producto: i) {
              System.out.println("Codigo: "+producto.getCodigo()+"Cantidad: "+producto.getCantidad()+"Numero de ventas: "+producto.numventas+"Precio de compra: "+producto.getPreciocompra()+"Precio de venta: "+producto.getPrecioventa()+"");
        }
   }
    public Producto masvendido(){
       ArrayList<Producto> productos=this.productos;
       Producto p1= new Producto(0,0,0,0);
       int a=0;
       for (Producto producto: productos) {
           if(producto.numventas>a){
            p1.equals(producto);   
           }
            }
       return p1;
   }
}

