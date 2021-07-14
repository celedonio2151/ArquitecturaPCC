/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcomposite;

/**
 *
 * @author cele2154
 */
public class PComposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PSimpleTemas temasI = new PSimpleTemas("Introduccion a la Programacion I",100,8,"C++","Bucles-funciones");
        PSimpleTemas temasII = new PSimpleTemas("Introduccion a la Programacion II",80,7,"C#","Bucles-funciones");
        PSimpleTemas temasIII = new PSimpleTemas("Introduccion a la Programacion III",110,9,"PHP","Bucles-funciones");
        PSimpleTemas temasIV = new PSimpleTemas("Introduccion a la Programacion VI",100,7,"Ruby","Bucles-funciones");
        PSimpleTemas temasV = new PSimpleTemas("Introduccion a la Programacion V",100,9,"TypeScript","Bucles-funciones");
        PSimpleTemas temasVI = new PSimpleTemas("Introduccion a la Programacion VI",110,8,"JavaScript","Bucles-funciones");
        PSimpleTemas temasVII = new PSimpleTemas("Introduccion a la Programacion VII",120,8,"Java","Bucles-funciones");
        PSimpleTemas temasVIII = new PSimpleTemas("Introduccion a la Programacion VIII",100,10,"Go","Bucles-funciones");
        PSimpleTemas temasIX = new PSimpleTemas("Introduccion a la Programacion IX",100,9,"Python","Bucles-funciones-Objetos");
        PSimpleTemas temasX = new PSimpleTemas("Introduccion a la Programacion X",120,12,"C","Bucles-funciones-Array");
        
        
        PCompuestoCurso cursoI = new PCompuestoCurso("Programacion I",0,0);
        cursoI.addTemas(temasI);
        cursoI.addTemas(temasII);
        cursoI.addTemas(temasIII);
        PCompuestoCurso cursoII = new PCompuestoCurso("Programacion II",0,0);
        cursoII.addTemas(temasIV);
        cursoII.addTemas(temasV);
        cursoII.addTemas(temasVI);
        PCompuestoCurso cursoIII = new PCompuestoCurso("Programacion II",0,0);
        cursoIII.addTemas(temasVII);
        cursoIII.addTemas(temasVIII);
        PCompuestoCurso cursoIV = new PCompuestoCurso("Programacion VI",0,0);
        cursoIV.addTemas(temasIX);
        PCompuestoCurso cursoV = new PCompuestoCurso("Programacion Web",0,0);
        cursoV.addTemas(temasX);
        
        
        PCompuestoCarrera carreraI = new PCompuestoCarrera("Ciencias de la Computacion",0,0,"Licenciatura");
        carreraI.addCarrera(cursoI);
        carreraI.addCarrera(cursoII);
        carreraI.addCarrera(cursoIII);
        carreraI.addCarrera(cursoIV);
        carreraI.addCarrera(cursoV);
        
        PCompuestoCarrera carreraII = new PCompuestoCarrera("Tecnologias de la informacion y las comunicaciones",0,0,"Licenciatura");
        carreraII.addCarrera(cursoI);
        carreraII.addCarrera(cursoII);
        carreraII.addCarrera(cursoIII);
//        carreraII.addCarrera(cursoIV);
//        carreraII.addCarrera(cursoV);
        
        PCompuestoCarrera carreraIII = new PCompuestoCarrera("Sistemas",0,0,"Licenciatura");
        carreraIII.addCarrera(cursoI);
        carreraIII.addCarrera(cursoII);
        carreraIII.addCarrera(cursoIII);
        carreraIII.addCarrera(cursoIV);
//        carreraIII.addCarrera(cursoV);
        
        System.out.println("Carrera: Ciencia de la computacion");
        System.out.println(carreraI.getCosto()+" Bs");
        System.out.println(carreraI.getDuracion()+" Semanas");
        System.out.println("Carrera: Tecnologias de la informacion");
        System.out.println(carreraII.getCosto()+" Bs");
        System.out.println(carreraII.getDuracion()+" Semanas");
        System.out.println("Carrera: Sistemas");
        System.out.println(carreraIII.getCosto()+" Bs");
        System.out.println(carreraIII.getDuracion()+" Semanas");
    }
    
}
