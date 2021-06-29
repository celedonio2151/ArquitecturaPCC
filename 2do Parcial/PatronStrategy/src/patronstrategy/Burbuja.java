/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronstrategy;

/**
 *
 * @author cele2154
 */
public abstract class Burbuja implements IEstrategia{
    
        @Override
        public void ordenar(){
            ordenarBurbuja();
        }

	abstract void ordenarBurbuja();

}
