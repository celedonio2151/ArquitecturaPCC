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
public class PCompuestoCurso extends ProductoAbstracto {
    
    private List< ProductoAbstracto > temasCosto = new ArrayList< ProductoAbstracto>();
    
    public PCompuestoCurso(String nombre, double precio, double duracion) {
        super(nombre, precio, duracion);
    }
//    --------------------------------------------------------------------------
    @Override
    public double getCosto() {
        double costo = 0d;
        for (ProductoAbstracto hijo : temasCosto) {
            costo += hijo.getCosto();
        }
        return costo;
    }
        @Override
    public double getDuracion() {
        double duracion = 0d;
        for (ProductoAbstracto hijo : temasCosto) {
            duracion += hijo.getDuracion();
        }
        return duracion;
    }
    @Override
    public void setCosto(double temas) {
        throw new UnsupportedOperationException();
    }

    public void addTemas(ProductoAbstracto temas) {
        this.temasCosto.add(temas);
    }

    public boolean removeTemas(ProductoAbstracto temas) {
        return this.temasCosto.remove(temas);
    }
    
}
