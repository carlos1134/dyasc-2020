package ar.edu.untref.dyasc;

import javafx.beans.binding.StringBinding;


import java.util.ArrayList;
import java.util.Collections;

public class PrinterHI {

	public PrinterHI(){

	}

	public StringBuilder imprimirSecuencia(StringBuilder cuerpo, int[] secuencia) {
        
            for(int i = secuencia.length -1; i>=0; i--) {
                cuerpo.append(" " + Integer.toString(secuencia[i]));
            }
       
        return cuerpo;
    }
		
}
