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
public class Regular implements IEstado{

    @Override
    public float calcularAntiguedad(float sueldobasico) {
         //To change body of generated methods, choose Tools | Templates.
        return (float) (sueldobasico*0.1);
    }
    
}
