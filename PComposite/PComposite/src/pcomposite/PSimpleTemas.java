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
public class PSimpleTemas extends ProductoAbstracto{
    
    String objetivoAprendizaje;
    String contenido;
    
    public PSimpleTemas(String nombre, double precio, double duracion, String objetivo,String contenido) {
        super(nombre, precio, duracion);
        this.objetivoAprendizaje = objetivo;
        this.contenido = contenido;
    }
//    --------------------------------------------------------------------------
    public String getObjetivo() {
        return objetivoAprendizaje;
    }

    public void setObjetivo(String objetivo) {
        this.objetivoAprendizaje = objetivo;
    }
//    --------------------------------------------------------------------------
    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
