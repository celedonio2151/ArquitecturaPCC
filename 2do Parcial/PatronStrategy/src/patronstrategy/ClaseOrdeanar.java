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
public class ClaseOrdeanar extends OrdenarVector {
    
    int[] A = new int[1000];
    void ClaseOrdenar(int[] vector)
    {
        int[] A = vector;
    }
    
    @Override
    void ordenarBurbuja() {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }

    @Override
    void ordenarQuicksort() {
        
    }

    @Override
    void ordenarSeleccion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//    public static void burbuja(int[] A) {
//        int i, j, aux;
//        for (i = 0; i < A.length - 1; i++) {
//            for (j = 0; j < A.length - i - 1; j++) {
//                if (A[j + 1] < A[j]) {
//                    aux = A[j + 1];
//                    A[j + 1] = A[j];
//                    A[j] = aux;
//                }
//            }
//        }
//    }
//    
}
