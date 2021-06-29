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
public class PatronStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] milnumeros = new int[10]; // vector de mil unidades
        for (int x=0;x<milnumeros.length;x++)
            milnumeros[x] = (int) (Math.random()*50)+1;
        
//        Mostrando los dartos
        for(int i = 0; i < milnumeros.length; i++)
        {
            System.out.println(milnumeros[i]);
        }
    }
    
}





