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
public class Baleadas {
    String nombrebal;
    double precio;
    String ingredientes ;

    public Baleadas(String nombrebal, double precio) {
        this.nombrebal = nombrebal;
        this.precio = precio;
    }

    public Baleadas() {
    }
    

    public String getNombre() {
        return nombrebal;
    }

    public void setNombre(String nombrebal) {
        this.nombrebal = nombrebal;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombrebal() {
        return nombrebal;
    }

    public void setNombrebal(String nombrebal) {
        this.nombrebal = nombrebal;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    

    @Override
    public String toString() {
        return nombrebal;
    }
    
}
