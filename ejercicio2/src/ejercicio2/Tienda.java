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
public class Tienda {
    private ArrayList<Empleado> empleados;
    private Inventario inventario;
    public Tienda(Inventario inventario){
        this.empleados = new ArrayList<>();
        this.inventario=inventario;
    }
    public boolean addEmpleado(Empleado empleado){
        if(this.empleados.add(empleado)==true){
            return true;
        }else{
            return false;
        }
    }
    public void listarEmpleados(){
       ArrayList<Empleado> empleados=this.empleados;
       for (Empleado empleado: empleados) {
                System.out.println(empleado.getNombre()+" numero de horas"+empleado.totalhoras());
            }
   }
}
