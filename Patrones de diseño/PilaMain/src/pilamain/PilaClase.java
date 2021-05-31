/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilamain;

//import static pilamain.PilaMain.mensaje;
import java.util.Scanner;
/**
 *
 * @author cele2154
 */
public class PilaClase implements IPila {
    public int vectorpila[];
    int cima;
    int tamano;
    int dato1;
    Scanner teclado = new Scanner(System.in);
    public PilaClase(int tama)
    {
        vectorpila = new int[tama];     // Declaramos en lamaño del vector
        cima = 0;
        tamano = tama;
    }
    public int leerDato()
    {
        mensaje("Ingrese un numero para agregar: ");
        int dato = teclado.nextInt();
        return dato;
    }
    @Override
    public void insertar() {
         if(cima != tamano)
        {   dato1 = leerDato();
            vectorpila[cima] = dato1;
            cima++;

        }else
        {   //Si la pila esta llena devuelve el mensaje
            mensaje("La pila esta llena");
        }
    }

    @Override
    public void eliminar() {
        int eliminar = 0;
        if(cima == 0)
        {
            mensaje("La pila esta vacia: eliminar....");
        }else
        {
            vectorpila[cima-1] = eliminar;
            System.out.println(cima);
            cima--;
        }
    }

    @Override
    public void mostrar() {
        mensaje("La pila es:");
        for(int i = 0 ; i < vectorpila.length; i++)
        {   
            if(vectorpila[i] != 0)
            {
                System.out.print(vectorpila[i]+" - ");
            }
            
        }
        mensaje("\n");
        if(cima == 0)
        {
            mensaje("La pila esta vacia");
        }
    }
    
    //    Funcion para imprimir mensajes dentro de la clase
    public static void mensaje(String mes)
    {
        System.out.println(mes);
    }
    
//    Programa principal
//    public static void main(String[] args) {
//        // TODO code application logic here
//        Scanner teclado = new Scanner(System.in);
//        mensaje("Ingrese el tamano de la pila");
//        int tam = teclado.nextInt();
//        PilaMain pi = new PilaMain(tam);
//        pi.menu();
//    }

    
}
