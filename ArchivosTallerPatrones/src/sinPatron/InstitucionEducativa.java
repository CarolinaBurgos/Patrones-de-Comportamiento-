package sinPatron;

import java.util.*;
import patrones.structural.MenuOpciones;

/**
 * 
 */
public class InstitucionEducativa implements MenuOpciones {
    
    /**
     * Default constructor
     */
    public InstitucionEducativa() {
    }

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private int creada;

    /**
     * 
     */
    private String provincia;

    /**
     * 
     */
    private String canton;

    /**
     * 
     */
    private String parroquia;

    /**
     * 
     */
    private String zona;

    /**
     * 
     */
    private Map estudiantes;

    /**
     * 
     */
    private MenuOpciones menu;

    public void SetInfo(String nombre, int creada, String provincia, String canton, String parroquia, String zona) {
        this.nombre = nombre;
        this.creada = creada;
        this.provincia = provincia;
        this.canton = canton;
        this.parroquia = parroquia;
        this.zona = zona;
    }
    
    /**
     * @return
     */
    public String GetInfo() {
        // TODO implement here
        return provincia + "\t " + canton + "\t " + parroquia + "\t " + zona + "\t " + creada + "\t\t\t " + nombre;
    }

    /**
     * @return
     */
    public void MostrarOpciones() {
        // TODO implement here
        
        return ;
    }

}