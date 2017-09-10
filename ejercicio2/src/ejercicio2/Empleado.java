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
public class Empleado {
    private String nombre;
    private double horaentrada;
    private double horasalida;
    private double sueldo;
    public Empleado(String nombre){
        this.nombre=nombre;
        this.horaentrada=0;
        this.horaentrada=0;
        this.sueldo=0;
    }
    public double getHoraentrada() {
        return horaentrada;
    }

    public void setHoraentrada( double horaentrada) {
        this.horaentrada = horaentrada;
    }
    public double getHorasalida() {
        return horasalida;
    }

    public void setHorasalida( double horasalida) {
        this.horasalida = horasalida;
    }
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo( double sueldo) {
        this.sueldo = sueldo;
    }
    public String getNombre(){
        return nombre;
    }
    public double totalhoras(){
        double totalh=0;
        totalh=this.horasalida-this.horasalida;
        return totalh;
    }
}
