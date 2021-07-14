/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcomposite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cele2154
 */
public class PCompuestoCarrera extends ProductoAbstracto{
    
    String modalidad;
    
    private List< ProductoAbstracto > carreraCosto = new ArrayList< ProductoAbstracto>();
    
    public PCompuestoCarrera(String nombre, double precio, double duracion,String modalidadG) {
        super(nombre, precio, duracion);
        this.modalidad = modalidadG;
    }
//    --------------------------------------------------------------------------
    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidadG) {
        this.modalidad = modalidadG;
    }
//    --------------------------------------------------------------------------
    @Override
    public double getCosto() {      // Costo de la carrera
        double costo = 0d;
        for (ProductoAbstracto hijo : carreraCosto) {
            costo += hijo.getCosto();
        }
        return costo;
    }
    @Override
    public double getDuracion() {   // Duracion del curso
        double duracion = 0d;
        for (ProductoAbstracto hijo : carreraCosto) {
            duracion += hijo.getDuracion();
        }
        return duracion;
    }
    @Override
    public void setCosto(double precios) {
        throw new UnsupportedOperationException();
    }

    public void addCarrera(ProductoAbstracto precios) {
        this.carreraCosto.add(precios);
    }

    public boolean removeCarrera(ProductoAbstracto precios) {
        return this.carreraCosto.remove(precios);
    }
}
