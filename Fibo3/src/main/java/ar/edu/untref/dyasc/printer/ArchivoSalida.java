package ar.edu.untref.dyasc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoSalida {

    private String salidaDeArchivo;

    public void guardarSalidaEnArchivo(String salidaFibonacci, String ruta, int numero) throws IOException {
        File archivo = new File(ruta);

        BufferedWriter escritorDeArchivo = new BufferedWriter(new FileWriter(archivo));
        escritorDeArchivo.write(salidaFibonacci);
        escritorDeArchivo.close();
        setSalidaDeArchivo(ruta , numero);
    }

    public String getSalidaDeArchivo(){
        return salidaDeArchivo;
    }

    public void setSalidaDeArchivo(String ruta , int numero){
        this.salidaDeArchivo = "fibo<" + String.valueOf(numero) + "> guardado en " + ruta;
    }
}
