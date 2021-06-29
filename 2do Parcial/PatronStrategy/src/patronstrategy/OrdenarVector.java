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
public abstract class OrdenarVector implements IEstrategia{
    
        @Override
        public void ordenar(){
        }

	public void iniciar() {
		ordenarBurbuja();
                ordenarQuicksort();
                ordenarSeleccion();
//		analizarMemoria();
//		analizarKeyloggers();
//		analizarRootKits();
//		descomprimirZip();
//		detener();
	}

	abstract void ordenarBurbuja();
        abstract void ordenarQuicksort();
        abstract void ordenarSeleccion();

//	abstract void analizarMemoria();
//
//	abstract void analizarKeyloggers();
//	
//	abstract void analizarRootKits();
//	
//	abstract void descomprimirZip();	
//
//	abstract void detener();
}