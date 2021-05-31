/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilamain;

import java.util.Scanner;

/**
 *
 * @author cele2154
 */
public class ProxyPila implements IPila{
    Scanner teclado = new Scanner(System.in);
    private PilaClase pilaP;
    public String historial[];
    int histcont = 0;
    public  ProxyPila()
    {
       historial = new String[100];
    }
//Menu para administrar la lista
    public void menu() {
        System.out.println("Ingrese el tamaño de la pila: ");
        int tam = teclado.nextInt();
        if (pilaP == null) {
            pilaP = new PilaClase(tam);
        }
        
         int n = 0;
        while(n != 5)
        {
            System.out.println("================================================");
            System.out.println("\nIngrese un numero del menu: ");
            mensaje("1 para insertar: ");
            mensaje("2 para eliminar: ");
            mensaje("3 para mostrar: ");
            mensaje("4 para historial: ");
            mensaje("5 para finalizar: ");
            System.out.println("================================================");
            n = teclado.nextInt();
            switch(n)
            {
                case 1: //mensaje("Ingrese un numero para agregar: ");
                        //int dato = teclado.nextInt();
                        insertar();
                        historial("Insertando");
                        break;
                case 2: eliminar();
                        historial("Eliminar");
                        break;
                case 3: mostrar();
                        historial("Mostrando");    
                        break;
                case 4: hitorialDeAcciones();
                        break;
            }

        }
    }

    @Override
    public void insertar() {
        pilaP.insertar();
    }

    @Override
    public void eliminar() {
        pilaP.eliminar();
    }

    @Override
    public void mostrar() {
        pilaP.mostrar();
    }

    //    Funcion para imprimir mensajes dentro de la clase
    public static void mensaje(String mes)
    {
        System.out.println(mes);
    }
     

    private void historial(String message) {
        historial[histcont] = message;
        histcont++;
    }
    
    public void hitorialDeAcciones()
    {
        mensaje("Mostrando el historial");
        for (String historial1 : historial) {
            if(historial1 != null)
            {
                System.out.println(historial1 + " - ");
            }
        }
    }
}
