package patrones.creational;

import patrones.structural.MenuOpciones;

/**
 * 
 */
public abstract class MenuBuilder {

    /**
     * Default constructor
     */
    public MenuBuilder() {
    }

    /**
     * 
     */
    protected MenuOpciones m;


    /**
     * @return
     */
    public MenuOpciones getMenu() {
        // TODO implement here
        return null;
    }

    /**
     * 
     */
    public abstract void definirMenu();

    /**
     * 
     */
    public abstract void construirMenu();

}