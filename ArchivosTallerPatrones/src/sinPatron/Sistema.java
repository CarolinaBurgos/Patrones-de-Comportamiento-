/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinPatron;

import java.util.LinkedList;
import java.util.Scanner;
import patrones.creational.*;

/**
 *
 * @author Carolina
 */
public class Sistema {
    
    public static int opcion = 0;
    public static int elementos = 0;
    public  static Scanner sc = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        InstitucionEducativa jatun = new InstitucionEducativa();
        jatun.SetInfo("JATUN KURAKA", 2009, "Imbabura", "Otavalo", "San Juan", "1");
        
        InstitucionEducativa consuelo = new InstitucionEducativa();
        consuelo.SetInfo("PROF. CONSUELO BENAVIDES", 2009, "Esmeraldas", "San Lorenzo", "San Lorenzo", "1");
        
        InstitucionEducativa sumak = new InstitucionEducativa();
        sumak.SetInfo("SUMAK YACHANA WASI", 2012, "Imbabura", "Cotacachi", "Imantag", "1");
        
        LinkedList<InstitucionEducativa> instituciones = new LinkedList<>();
        instituciones.add(jatun); instituciones.add(consuelo); instituciones.add(sumak);
        
        int c = 0;
        System.out.println("ORDEN \t PROVINCIA \t CANTON \t PARROQUIA \t ZONA \t AÑO DE CREACION \t NOMBRE DE LA UEM");
        while( c < instituciones.size()){
            System.out.println(c+1 + "\t " + instituciones.get(c).GetInfo());
            c = c + 1;
        }
        
        elementos = instituciones.size();
        
        int op = 0;
        System.out.println("\n\n MENU");
        System.out.print("\nElija el numero de la institucion a mostrar (de 1 a " + instituciones.size() + "): ");
        op = sc.nextInt();
        opcion = op;
        if(op <=  instituciones.size()){
            accion(instituciones, op);
        }
        
        while(op >  instituciones.size()){
            System.out.print("\nElija el numero de la institucion a mostrar (de 1 a " + instituciones.size() + "): ");
            op = sc.nextInt();
            opcion = op;
            if(op <=  instituciones.size()){
                accion(instituciones, op);
            }
        }
        
    }
    
    public static void accion(LinkedList<InstitucionEducativa> instituciones, int op) {
        instituciones.get(op-1).MostrarOpciones();

        int cant = 0;
        System.out.print("\nElija la opcion: ");
        cant = sc.nextInt();
        if (cant <= InstitucionEducativa.cantidad) {
            accion2(instituciones, op, cant);
        }

        while (cant > InstitucionEducativa.cantidad) {
            System.out.print("\nElija la opcion: ");
            cant = sc.nextInt();
            if (cant <= InstitucionEducativa.cantidad) {
                accion2(instituciones, op, cant);
            }
        }
    }
    
    public static void accion2(LinkedList<InstitucionEducativa> instituciones, int op, int cant) {
        if ((cant == 1 && op == 1) || (cant == 2 && op == 3)) {
                GenerarCalificaciones gCal = new GenerarCalificaciones();
                System.out.println("\ncalificacion");
            } else if ((cant == 1 && op == 2) || (cant == 1 && op == 3)) {
                GenerarCertificado gCer = new GenerarCertificado();
                System.out.println("\ncertificado");
            } else if ((cant == 2 && (op == 1 || op == 2)) || (cant == 3 && op == 3)) {
                    System.out.print("\nElija el numero de la institucion a mostrar (de 1 a " + instituciones.size() + "): ");
                    op = sc.nextInt();
                    opcion = op;
                    if(op <=  instituciones.size()){
                        accion(instituciones, op);
                    }

                    while(op >  instituciones.size()){
                        System.out.print("\nElija el numero de la institucion a mostrar (de 1 a " + instituciones.size() + "): ");
                        op = sc.nextInt();
                        opcion = op;
                        if(op <=  instituciones.size()){
                            accion(instituciones, op);
                        }
                    }
            }
    }

}
