package patrones.structural;

/**
 * 
 */
public abstract class MenuDecorator implements MenuOpciones {

    /**
     * Default constructor
     */
    public MenuDecorator() {
    }

    /**
     * 
     */
    private MenuOpciones menu;

    /**
     * @param i
     */
    public void MenuDecorator(MenuOpciones i) {
        // TODO implement here
    }

    /**
     * @param op 
     * @return
     */
    public abstract String ejecutarOpcion(int op);

    /**
     * @return
     */
    public void MostrarOpciones() {
        // TODO implement here
        return ;
    }

}