/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1_p2_michaelmartinez;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author Michael Martínez
 */
public class Mascota {
    String nombre;
    String tipo;
    Date fecha;
    Color color;
    double precio;

    public Mascota(String nombre, String tipo, Date fecha, Color color, double precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.fecha = fecha;
        this.color = color;
        this.precio = precio;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "| Tipo: " + tipo + "| Fecha: " + fecha + "| Color: " + color + "| Precio: " + precio;
    }
    
    
    
    
    
}
