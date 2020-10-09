package ar.edu.untref.dyasc;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class ArchivoTest {

    @Test
    public void crearGestorDeArchivoTest() throws IOException {
        ArchivoSalida miGestor = new ArchivoSalida();
        String salida = "";
        String ruta = "test.txt";
        int numero = 0;

        miGestor.guardarSalidaEnArchivo(salida, ruta, numero);

        String impresionPorPantallaEsperada = "fibo<0> guardado en test.txt";

        Assert.assertEquals(impresionPorPantallaEsperada, miGestor.getSalidaDeArchivo());
    }
}
