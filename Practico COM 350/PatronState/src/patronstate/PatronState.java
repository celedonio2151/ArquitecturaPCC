/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronstate;

import java.util.Scanner;

/**
 *
 * @author cele2154
 */
public class PatronState {

    /**
     * @param args the command line arguments
     * Cambiar el comportamiento del estado en el que se encuentre
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Scanner teclado = new Scanner(System.in);
//        System.out.print("Ingrese el nombre del empleado: ");
//        String nombre = teclado.next();
//        System.out.print("Ingrese mes: ");
//        String mes = teclado.next();
//        System.out.print("Ingrese el sueldo del empleado: ");
//        float sueldo = teclado.nextInt();
//        PagoEmpleado empleado = new PagoEmpleado(nombre,mes,sueldo);
//        empleado.calcularAntiguedad();
        Junior junior = new Junior();
        Senior senior = new Senior();
        Regular regular = new Regular();
        Master master = new Master();
        int opcion = 0;

        do{
            Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = teclado.next();
        System.out.print("Ingrese mes: ");
        String mes = teclado.next();
        System.out.print("Ingrese el sueldo del empleado: ");
        float sueldo = teclado.nextInt();
        PagoEmpleado empleado = new PagoEmpleado(nombre,mes,sueldo);
            menu();
            opcion = teclado.nextInt();
            switch(opcion)
            {
                case 1:
                        empleado.recibirEstado(junior);
                        break;
                case 2:
                        empleado.recibirEstado(senior);
                        break;
                case 3:
                        empleado.recibirEstado(regular);
                        break;
                case 4:
                        empleado.recibirEstado(master);
                        break;
                case 5:
                        System.exit(0);
                default: System.out.println("Valor erroneo.");
            }
            empleado.calcularAntiguedad();
        }while(opcion != 0);
    }
    
    public static void menu()
    {
        System.out.println("****************************************************");
        System.out.println("*Seleccione un numero del menu:                    *");
        System.out.println("*1.-  Senior                                       *");
        System.out.println("*2.-  Regular                                      *");
        System.out.println("*3.-  Junior                                       *");
        System.out.println("*4.-  Master                                       *");
        System.out.println("*0.-  Salir                                        *");
        System.out.println("****************************************************");

    }
}