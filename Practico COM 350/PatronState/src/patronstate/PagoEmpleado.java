/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronstate;

/**
 *
 * @author cele2154
 */
public class PagoEmpleado {
    private IEstado miestado;
    private String nombre;
    private String mes;
    private float sueldo;

    
    PagoEmpleado(String nomb,String me, float suel)
    {
        nombre = nomb;
        mes = me;
        sueldo = suel;
    }
    public void recibirEstado(IEstado s)
    {
        miestado = s;
    }
    
    public void calcularAntiguedad()
    {
        System.out.println("Nombre: "+nombre);
        System.out.println("Mes: "+mes);
        System.out.println("Sueldo: "+sueldo);
        System.out.println(miestado.calcularAntiguedad(sueldo));
    }
}