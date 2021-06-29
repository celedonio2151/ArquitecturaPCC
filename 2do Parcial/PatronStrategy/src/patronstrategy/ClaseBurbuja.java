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
public class ClaseBurbuja extends Burbuja{
    
    int[] A = new int[1000];
    void ClaseBurbuja(int[] vector)
    {
        A = vector;
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
    
//    public void mostrar()
//    {
//        
//    }
}
