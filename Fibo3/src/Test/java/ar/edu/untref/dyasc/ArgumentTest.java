package ar.edu.untref.dyasc;

import cucumber.api.java.es.Y;
import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;
import org.junit.Assert;
import org.junit.Test;

public class ArgumentTest {

    @Test
    public void creaLectorConOpcionHorizontalYDerecho() throws ArgumentException {
        Argument argumento = new Argument();
        String[] parametros = {"-o=hd", "5"};
        argumento.leerParametros(parametros);
        Assert.assertEquals(argumento.getOpcion(), "hd");
    }

    @Test
    public void creaLectorConOpcionVerticalEInverso() throws ArgumentException {
        Argument argumento = new Argument();
        String[] parametros = {"-o=vi", "5"};
        argumento.leerParametros(parametros);
        Assert.assertEquals(argumento.getOpcion(), "vi");
    }

    @Test
    public void crearLectorConOpcionYArchivo() throws ArgumentException {
        Argument argumento = new Argument();
        String[] parametros = {"-o=vi", "-f=archivoDePrueba.txt"};

        argumento.leerParametros(parametros);
        Assert.assertEquals(argumento.getArchivo(), "archivoDePrueba.txt");
    }

    @Test
    public void crearLectorConOpcionArchivoYModoSumatoria() throws ArgumentException {
        Argument argumento = new Argument();
        String[] parametros = {"-o=vi", "-f=archivoDePrueba.txt", "-m=s"};

        argumento.leerParametros(parametros);
        Assert.assertEquals(argumento.getArchivo(), "archivoDePrueba.txt");
        Assert.assertEquals(argumento.getModo(), "s");
        Assert.assertEquals(argumento.getOpcion(), "vi");
    }

    @Test(expected = ArgumentException.class)
    public void crearLectorConOpcionInvalida() throws ArgumentException {
        Argument argumento = new Argument();
        String[] parametros = {"-o=xy", "-f=archivoDePrueba.txt", "-m=s"};
        argumento.leerParametros(parametros);
    }
}
