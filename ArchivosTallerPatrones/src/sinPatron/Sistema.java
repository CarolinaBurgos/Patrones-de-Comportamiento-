/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinPatron;

import java.util.LinkedList;

/**
 *
 * @author Carolina
 */
public class Sistema {

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
        instituciones.add(jatun);
        instituciones.add(consuelo);
        instituciones.add(sumak);

        int c = 0;
        System.out.println("ORDEN \t PROVINCIA \t CANTON \t PARROQUIA \t ZONA \t AÑO DE CREACION \t NOMBRE DE LA UEM");
        while (c < instituciones.size()) {
            System.out.println(c + 1 + "\t " + instituciones.get(c).GetInfo());
            c = c + 1;
        }

    }
}
