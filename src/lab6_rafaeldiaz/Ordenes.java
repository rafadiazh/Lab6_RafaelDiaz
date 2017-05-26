/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_rafaeldiaz;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Rafael
 */
public class Ordenes {
    String numero_orden;
    Date fecha;
    ArrayList<Cliente> clientes = new ArrayList();

    public Ordenes(String numero_orden, Date fecha) {
        this.numero_orden = numero_orden;
        this.fecha = fecha;
    }

    public String getNumero_orden() {
        return numero_orden;
    }

    public void setNumero_orden(String numero_orden) {
        this.numero_orden = numero_orden;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return numero_orden;
    }
    
}
