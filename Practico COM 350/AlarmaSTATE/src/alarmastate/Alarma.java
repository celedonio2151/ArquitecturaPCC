/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarmastate;

/**
 *
 * @author cele2154
 */
public class Alarma {
    
    private Estado miEstado;
    
    public void setEstado(Estado e)
    {
        miEstado = e;
    }
    
    public void ejecutarEstado()
    {
        miEstado.ejecutarEstado();
    }
    
}
