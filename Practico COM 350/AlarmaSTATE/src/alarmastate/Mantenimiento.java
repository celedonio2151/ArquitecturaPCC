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
public class Mantenimiento implements Estado {

    @Override
    public void ejecutarEstado() {
        System.out.println("En estado en mantenimiento: No atento");
        System.out.println("Enviar correo electronico para enviar");
    }
    
}
