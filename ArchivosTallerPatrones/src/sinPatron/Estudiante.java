package sinPatron;

import java.util.*;

/**
 * 
 */
public class Estudiante {

    /**
     * Default constructor
     */
    public Estudiante() {
    }

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String apellido;

    /**
     * 
     */
    private String matricula;

    /**
     * 
     */
    private Float promedio;

    public void SetInfo(String nombre, String apellido, String matricula, float promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.promedio = promedio;
    }    

    /**
     * @return
     */
    public String GetInfo() {
        // TODO implement here
        return nombre + "\t " + apellido + "\t " + matricula + "\t " + promedio;
    }

}