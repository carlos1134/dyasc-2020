package ar.edu.untref.dyasc;

import javafx.beans.binding.StringBinding;


public class PrinterVI {

	public PrinterVI(){

	}

	public StringBuilder imprimirSecuencia(StringBuilder cuerpo, int[] secuencia) {
         
            for(int i=secuencia.length -1; i>=0; i--) {
                cuerpo.append("\n" + Integer.toString(secuencia[i]));
            }
        
        return cuerpo;
    }

}
