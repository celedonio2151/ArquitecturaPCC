/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcomposite;

import java.util.Scanner;

/**
 *
 * @author cele2154
 */
public class PComposite {

    /**
     * @param args the command line arguments
     */
//    Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
//         Productos simples
        Scanner teclado = new Scanner(System.in);
        ProductoSimple tomate = new ProductoSimple("Tomate",0.5,"Hamburguesa");
        ProductoSimple hamPanCarne = new ProductoSimple("Hamburguesa Pan Carne",3,"Hamburguesa");
        ProductoSimple queso = new ProductoSimple("Queso",1,"Hamburguesa");
        ProductoSimple lechuga = new ProductoSimple("Lechuga",0.5,"Hamburguesa");
        ProductoSimple papaFrita = new ProductoSimple("Papa Frita",2,"Hamburguesa");
        ProductoSimple refresco = new ProductoSimple("Fefresco",0.5,"Hamburguesa");
        ProductoSimple sodaMini = new ProductoSimple("Soda Mini",1.5,"Hamburguesa");
        
//        Productos compuestos Simples
        ProductoCompuesto simples = new ProductoCompuesto("Simple");
        simples.addProducto(hamPanCarne);
        simples.addProducto(lechuga);
        simples.addProducto(papaFrita);
//        Productos compuestos Dobles
        ProductoCompuesto dobles = new ProductoCompuesto("Dobles");
        dobles.addProducto(hamPanCarne);
        dobles.addProducto(lechuga);
        dobles.addProducto(queso);
        dobles.addProducto(papaFrita);
//        Productos compuestos Queso
        ProductoCompuesto quesos = new ProductoCompuesto("Queso");
        quesos.addProducto(hamPanCarne);
        quesos.addProducto(queso);
        quesos.addProducto(lechuga);
        quesos.addProducto(papaFrita);
//        Producto cokpuesto de Simples, Dobles, Queso mas extras => Combos
        ProductoCompuesto combo1 = new ProductoCompuesto("Combo1");
        combo1.addProducto(simples);
        combo1.addProducto(refresco);
//        COmbo 2
        ProductoCompuesto combo2 = new ProductoCompuesto("Combo2");
        combo2.addProducto(simples);
        combo2.addProducto(sodaMini);
//        Combo 3
        ProductoCompuesto combo3 = new ProductoCompuesto("Combo3");
        combo3.addProducto(dobles);
        combo3.addProducto(dobles);
        combo3.addProducto(sodaMini);
        combo3.addProducto(sodaMini);
//        Combo 4
        ProductoCompuesto combo4 = new ProductoCompuesto("Combo4");
        combo4.addProducto(dobles);
        combo4.addProducto(quesos);
        combo4.addProducto(sodaMini);
        combo4.addProducto(sodaMini);
        int opcion = 10;
        int combo = 0;
        while(opcion != 0)
        {
            System.out.println("Ingrese el tipo de hamburguesa:");
            System.out.println("1.- Para Simple: ");
            System.out.println("2.- Para Doble: ");
            System.out.println("3.- Para Queso: ");
            System.out.print(">>");
            opcion = teclado.nextInt();
            System.out.println("-------------------------------------------------");
            System.out.println("Seleccione un Combo si lo desea: 0 para obiar");
    //        System.out.println("0.- Sin Combo: ");
            System.out.println("1.- Combo 1: ");
            System.out.println("2.- Combo 2: ");
            System.out.println("3.- Combo 3: ");
            System.out.println("4.- Combo 4: ");
            System.out.print(">>");
//            System.out.print("Ingrese un numero del menu:");
//            opcion = teclado.nextInt();
            combo = teclado.nextInt();
            if(opcion == 1)
            {
                simples.getPrecio();
                System.out.println("Precio hamburguesa simple: "+simples.getPrecio()+" Bs");
                System.out.println("-------------------------------------------------");
            }
            if(opcion == 2)
            {
                dobles.getPrecio();
                System.out.println("Precio hamburguesa doble: "+dobles.getPrecio()+" Bs");
                System.out.println("-------------------------------------------------");
            }
            if(opcion == 3)
            {
                quesos.getPrecio();
                System.out.println("Precio hamburguesa queso: "+quesos.getPrecio()+" Bs");
                System.out.println("-------------------------------------------------");
            }
            switch(combo)
            {
                case 1:
                    combo1.getPrecio();
                    System.out.println("Precio Combo 1: "+combo1.getPrecio()+" Bs");
                    System.out.println("-------------------------------------------------");
                    break;
                case 2:
                    combo2.getPrecio();
                    System.out.println("Precio Combo 2: "+combo2.getPrecio()+" Bs");
                    System.out.println("-------------------------------------------------");
                    break;
                case 3:
                    combo3.getPrecio();
                    System.out.println("Precio Combo 3: "+combo3.getPrecio()+" Bs");
                    System.out.println("-------------------------------------------------");
                    break;
                case 4:
                    combo4.getPrecio();
                    System.out.println("Precio Combo 4: "+combo4.getPrecio()+" Bs");
                    System.out.println("-------------------------------------------------");
                    break;
                default:
                    System.out.println("Gracias por su compra");
                    System.out.println("-------------------------------------------------");
            }
        }
        
    }
    
    public void Principal()
    {
        System.out.println("Ingrese el tipo de hamburguesa o para salir:");
        System.out.println("1.- Para Simple: ");
        System.out.println("2.- Para Doble: ");
        System.out.println("3.- Para Queso: ");
        System.out.println("-------------------------------------------------");
        System.out.println("Seleccione un Combo si lo desea: ");
//        System.out.println("0.- Sin Combo: ");
        System.out.println("1.- Combo 1: ");
        System.out.println("2.- Combo 2: ");
        System.out.println("3.- Combo 3: ");
        System.out.println("4.- Combo 4: ");
    }
    
}
