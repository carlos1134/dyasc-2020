package ar.edu.untref.dyasc;

import javafx.beans.binding.StringBinding;

import java.util.Scanner;
import java.util.ArrayList;

public class PrinterHD {

    public PrinterHD(){

    }

	public StringBuilder imprimirSecuencia(StringBuilder cuerpo, int[] secuencia) {
       
        for (int i=0; i<secuencia.length; i++){
            cuerpo.append(" " + Integer.toString(secuencia[i]));
        }
        
        return cuerpo;
    }
}
