/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_rafaeldiaz;

import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class Cliente {
    String nombre;
    String numerotelefono;
    double efectivo;
    String direccion;
    ArrayList<Baleadas> baleadas = new ArrayList();

    public Cliente(String nombre, String numerotelefono, double efectivo, String direccion) {
        this.nombre = nombre;
        this.numerotelefono = numerotelefono;
        this.efectivo = efectivo;
        this.direccion = direccion;
    }

    public Cliente() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumerotelefono() {
        return numerotelefono;
    }

    public void setNumerotelefono(String numerotelefono) {
        this.numerotelefono = numerotelefono;
    }

    public double getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(double efectivo) {
        this.efectivo = efectivo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Baleadas> getBaleadas() {
        return baleadas;
    }

    public void setBaleadas(ArrayList<Baleadas> baleadas) {
        this.baleadas = baleadas;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
