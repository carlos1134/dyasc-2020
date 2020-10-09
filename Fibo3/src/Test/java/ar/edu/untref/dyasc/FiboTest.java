package ar.edu.untref.dyasc;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class FiboTest {

    @Test
    public void generarSecuenciaFiboTest() {
        Fibo fibo = new Fibo();
        fibo.generarSecuenciaFibonacciDe(5);
        int[] miArrayTest = new int[] {0, 1, 1, 2, 3};

        Assert.assertArrayEquals(fibo.getSecuencia(), miArrayTest);
    }

    @Test
    public void generarSecuenciaFiboYObtenerNumeroDeSecuenciaTest() {
        Fibo fibo = new Fibo();
        fibo.generarSecuenciaFibonacciDe(5);

        Assert.assertEquals(fibo.getNumeroDeSecuencia(),5);
    }

    @Test
    public void generarSecuenciaFiboYObtenerSumatoriaTest() {
        Fibo fibo = new Fibo();
        fibo.generarSecuenciaFibonacciDe(5);

        Assert.assertEquals(fibo.getSumatoria(),7);
    }



}