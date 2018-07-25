package patrones.structural;

import patrones.behavioral.*;

/**
 * 
 */
public class MenuCalificaciones extends MenuDecorator {

    /**
     * Default constructor
     */
    public MenuCalificaciones() {
    }

    /**
     * 
     */
    private IEscalaExtrajera escala;


    /**
     * @param i
     */
    public void MenuCalificaciones(MenuOpciones i) {
        // TODO implement here
    }

    /**
     * @param calif 
     * @param pais 
     * @return
     */
    public String Convertir(Float calif, String pais) {
        
        String cal = " ";
        
        if(pais.equalsIgnoreCase("USA")){
            EscalaUSA eu = new EscalaUSA();
            cal = eu.ConvertirCalificacion(calif);
            } else if(pais.equalsIgnoreCase("Alemania")){
            EscalaAlemania ea = new EscalaAlemania();
            cal = ea.ConvertirCalificacion(calif);
        }
        
        return "";
    }

    /**
     * @param op 
     * @return
     */
    public String ejecutarOpcion(int op) {
        return null;
    }

}