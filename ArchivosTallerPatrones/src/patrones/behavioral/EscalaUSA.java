package patrones.behavioral;

import java.util.*;

/**
 * 
 */
public class EscalaUSA implements IEscalaExtrajera {

    /**
     * Default constructor
     */
    public EscalaUSA() {
    }

    /**
     * @param c 
     * @return
     */
    public String ConvertirCalificacion(Float c) {
        // TODO implement here
        String cal = " ";
        
        if(c == 10){
            cal = "A";
        } else if(c == 9.5){
            cal = "A-";
        } else if(c == 9){
            cal = "B+";
        } else if(c == 8.5){
            cal = "B";
        } else if(c == 8){
            cal = "B-";
        } else if(c == 7.5){
            cal = "C+";
        } else if(c == 7){
            cal = "C";
        } else if(c == 6.5){
            cal = "C-";
        } else if(c == 6){
            cal = "D+";
        } else if(c == 5.5){
            cal = "D";
        } else if(c == 5){
            cal = "D-";
        } else {
            cal = "F";
        } 
        
        return cal;
    }

}