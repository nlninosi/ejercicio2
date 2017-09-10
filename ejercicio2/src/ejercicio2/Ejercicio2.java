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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Inventario i1= new Inventario();
        Tienda t1=new Tienda(i1);
        Scanner in = new Scanner(System.in);
        int continuar = 0, opcion = 0,opcion1=0,opcion2=0;
        do{
        System.out.println("1. Inventarios");
        System.out.println("2. Nomina");
        opcion = in.nextInt();
        if(opcion == 1){
            System.out.println("1. Registrar Producto");
            System.out.println("2. Registrar Proveedor");
            System.out.println("3. Registrar Venta");
            System.out.println("4. Registrar Pedido");
            System.out.println("5. Listar Productos");
            System.out.println("6. Listar Porveedores");
            System.out.println("7. Listar Ventas");
            System.out.println("8. Listar Pedidos");
            System.out.println("9. Producto mas vendido");
            System.out.println("10. Productos agotados");
            System.out.println("11. Ingresos y Gastos");
            opcion1 = in.nextInt();
            if(opcion1 == 1){
                System.out.println("Codigo del producto");
                int codigo=in.nextInt();
                System.out.println("Precio de compra");
                double preciocompra=in.nextDouble();
                System.out.println("Precio de venta");
                double precioventa=in.nextDouble();
                System.out.println("Existencias");
                int cantidad=in.nextInt();
                Producto p= new Producto(codigo,preciocompra,precioventa,cantidad);
                i1.addProducto(p);
            }else if(opcion1 == 2){
                System.out.println("Nombre Proveedor");
                String nombre=in.next();
                Proveedores pro =new Proveedores(nombre);
                i1.addProveedores(pro);
            }else if(opcion1 == 3){
                System.out.println("Codido del producto");
                int codigo=in.nextInt();
                System.out.println("Comprado");
                int comprado=in.nextInt();
                i1.registrarVenta(comprado, codigo);
            }
            else if(opcion1 == 4){
                System.out.println("Nombre Proveedor");
                String nombre=in.next();
                System.out.println("Codido del producto");
                int codigo=in.nextInt();
                System.out.println("Comprado");
                int comprado=in.nextInt();
                i1.registrarPedido(nombre, comprado, codigo);
            }else if(opcion1 == 5){
                i1.listarProductos();
            }
            else if(opcion1 == 6){
                i1.listarProveedores();
            }
            else if(opcion1 == 7){
                i1.listarVentas();
            }
            else if(opcion1 == 8){
                i1.listarPedidos();
            }else if(opcion1 == 9){
                Producto i= i1.masvendido();
                System.out.println("Codigo: "+i.getCodigo()+"Cantidad: "+i.getCantidad()+"Numero de ventas: "+i.numventas+"Precio de compra: "+i.getPreciocompra()+"Precio de venta: "+i.getPrecioventa()+"");
            }else if(opcion1 == 10){
                i1.listaAgotados();
            }else if(opcion1 == 11){
                System.out.println("Ingresos: "+i1.ganancias+" Gastos: "+i1.gastos);
            }else{
            System.out.println("Opcion Invalida");
        }
        }else if(opcion == 2){
            opcion2 = in.nextInt();
            System.out.println("1. Registrar Empleado");
            System.out.println("2. Lista de empleados");
            if(opcion2 == 1){
                System.out.println("Nombre Proveedor");
                String nombre=in.next();
                Empleado empleado= new Empleado(nombre);
                t1.addEmpleado(empleado);
            }
            else if(opcion2 == 2){
                t1.listarEmpleados();
            }
            
        }else{
            System.out.println("Opcion Invalida");
        }
        
      }while(continuar == 0);
    }
    
}
