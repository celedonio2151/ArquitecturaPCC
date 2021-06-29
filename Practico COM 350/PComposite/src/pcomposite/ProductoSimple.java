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
public class ProductoSimple extends ProductoAbstracto {
    
    protected String nombreProducto;
    public ProductoSimple(String nombre, double precio, String nombreP) {
        super(nombre, precio);
        nombreProducto = nombreP;
    }
    public String getMarca() {
        return nombreProducto;
    }

    public void setMarca(String marca) {
        this.nombreProducto = marca;
    }
    
}
