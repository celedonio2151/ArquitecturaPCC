/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;
import java.util.Scanner;

/**
 *
 * @author cele2154
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    Scanner teclado = new Scanner(System.in);
    int numero = 0;
    int tabla;
    
    public void menu()
    {
        while(numero != 5)
        {
            System.out.println("Ingrese la tabla que quiere ver 1 a 10: ");
            tabla = teclado.nextInt();
            mensaje("1 -> sumar");
            mensaje("2 -> restar");
            mensaje("3 -> multiplicar");
            mensaje("4 -> dividir");
            mensaje("5 -> finalizar");  
            System.out.println("Ingrese un numero del menu: ");
            numero = teclado.nextInt();
            
            if(numero == 1)
            {
                sumar(tabla);
            }
            if(numero == 2)
            {
                restar(tabla);
            }
            if(numero == 3)
            {
                multiplicar(tabla);
            }
            if(numero == 4)
            {
                dividir(tabla);
            }
        }
    }
    
    public void mensaje(String mes)
    {
        System.out.println(mes);
    }
    
    public void sumar(int tabla)
    {
        int resultado = 0;
        for(int i = 1; i < 11 ; i++)
        {
            resultado = tabla + i;
            System.out.println(tabla+" + "+i+" = "+resultado);
        }
    }
    
    public void restar(int tabla)
    {
        int resultado = 0;
        for(int i = 1; i < 11 ; i++)
        {
            resultado = tabla - i;
            System.out.println(tabla+" - "+i+" = "+resultado);
        }
    }
    
    public void multiplicar(int tabla)
    {
        int resultado = 0;
        for(int i = 1; i < 11 ; i++)
        {
            resultado = tabla * i;
            System.out.println(tabla+" * "+i+" = "+resultado);
        }
    }
    
    public void dividir(int tabla)
    {
        int resultado = 0;
        for(int i = 1; i < 11 ; i++)
        {
            resultado = tabla / i;
            System.out.println(tabla+" / "+i+" = "+resultado);
        }
    }
    
//    public static void main(String[] args) {
//        // TODO code application logic here
//        JavaApplication11 tabla = new JavaApplication11();
//        tabla.menu();
//    }
    
}
