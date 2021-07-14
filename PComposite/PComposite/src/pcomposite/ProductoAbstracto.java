/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcomposite;

/**
 *
 * @author cele2154
 */
public class ProductoAbstracto {
    protected String nombre;
    protected double costo;
    protected double duracion;

    public ProductoAbstracto(String nombre, double costo, double duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.costo = costo;
    }
//   ---------------------------------------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//    --------------------------------------------------------------------------

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
//    --------------------------------------------------------------------------
    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double costo) {
        this.duracion = costo;
    }

    
}
