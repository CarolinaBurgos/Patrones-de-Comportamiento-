package patrones.behavioral;

import java.util.*;

/**
 *
 *
 */
public class EscalaAlemania implements IEscalaExtrajera {

    /**
     * Default constructor
     */
    public EscalaAlemania() {
    }

    /**
     * @param c 
     * @return
     */
    public String ConvertirCalificacion(Float c) {
        String cal = " ";
        
        if(c == 10){
            cal = "1";
        } else if(c >= 9 && c <= 9.99){
            cal = "1.1";
        } else if(c >= 8 && c <= 8.99){
            cal = "1.7";
        } else if(c >= 7 && c <= 7.99){
            cal = "2.3";
        } else if(c >= 6 && c <= 6.99){
            cal = "2.9";
        } else if(c >= 5 && c <= 5.99){
            cal = "3.5";
        } else if(c >= 0 && c <= 4.99){
            cal = "4";
        } 
        
        return cal;
    }

}