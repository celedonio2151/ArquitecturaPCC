/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarmastate;

import java.util.Scanner;

/**
 *
 * @author cele2154
 */
public class AlarmaSTATE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alarma alarma = new Alarma();
        Activa activa = new Activa();
        Mantenimiento mantenimiento = new Mantenimiento();
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        do{
            muestraMenu();
            opcion = teclado.nextInt();
            switch(opcion){
                case 1:
                        alarma.setEstado(activa);
                        break;
                case 2: 
                        alarma.setEstado(mantenimiento);
                        break;
                case 0:
                        System.exit(0);
                        break;
                default:
                        System.out.println("Opcion Errada");
                        break;
            }
            alarma.ejecutarEstado();
            
        }while(opcion != 0);
    }
    
    private static void muestraMenu()
    {
        System.out.println("***************************************************");
        System.out.println("*   Seleccione el estado de la alarma             *");
        System.out.println("*   1.-   Activa      2.- Mantenimiento  0.- Salir*");
        System.out.println("***************************************************");
    }
    
}
