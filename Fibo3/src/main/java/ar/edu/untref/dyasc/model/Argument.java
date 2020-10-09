package ar.edu.untref.dyasc;

import java.util.*;
import java.util.regex.Pattern;
import ar.edu.untref.dyasc.ArgumentException;

public class Argument{

    private String opcion = "";
    private String archivo  = "";
    private String modo = "";
    private int numeroSucesion;

    public void leerParametros(String[] args) throws ArgumentException{

        for(String parametro : args){
            if(parametro.startsWith("-")){

                String[] param = parametro.split("=");
                String valorOpcion = param[1];
                char charOpcion = param[0].charAt(1);

                if(charOpcion == 'o'){
                    this.evaluarOpcion(valorOpcion);
                } else if (charOpcion == 'f') {
                    this.evaluarArchivo(valorOpcion);
                } else if (charOpcion == 'm') {
                    this.evaluarModo(valorOpcion);
                }
            } else {
                this.setNumeroSucesion(Integer.parseInt(parametro));
            }
        }
    }

    public void setNumeroSucesion(int numeroSucesion) {
        this.numeroSucesion = numeroSucesion;
    }

    public int getNumeroSucesion(){
        return this.numeroSucesion;
    }

    private void evaluarModo(String valorOpcion) throws ArgumentException {
        setModo(valorOpcion);
    }

    private void evaluarArchivo(String valorOpcion) throws ArgumentException{
        setArchivo(valorOpcion);
    }

    private void evaluarOpcion(String valorOpcion) throws ArgumentException{
        String[] opcionesValidas = {"hd", "vd", "hi", "vi"};

        if(!Arrays.asList(opcionesValidas).contains(valorOpcion)) {
            throw new ArgumentException();
        }

        setOpcion(valorOpcion);
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
}
