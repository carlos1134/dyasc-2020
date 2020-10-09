package ar.edu.untref.dyasc;

import javafx.beans.binding.StringBinding;


import java.util.ArrayList;

public class PrinterVD {


	public PrinterVD(){

	}

	public StringBuilder imprimirSecuencia(StringBuilder cuerpo, int[] secuencia) {
        
       
            for(int i=0; i<secuencia.length; i++){
                cuerpo.append("\n" + Integer.toString(secuencia[i]));
            }
        
        return cuerpo;
    }

}
