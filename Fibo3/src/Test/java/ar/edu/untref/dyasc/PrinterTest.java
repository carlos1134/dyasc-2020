package ar.edu.untref.dyasc;

import org.junit.Assert;
import org.junit.Test;

public class PrinterTest {

    @Test
    public void obtenerCabeceraPorImpresoraTest(){
        Fibo fibo = new Fibo();
        fibo.generarSecuenciaFibonacciDe(5);
        Printer imprimir = new Printer(fibo);
        imprimir.crearCabecera();

        Assert.assertEquals("fibo<5>:", imprimir.getCabecera());
    }

    @Test
    public void armarYObtenerContenidoPorImpresoraTest(){
        Fibo fibo = new Fibo();
        fibo.generarSecuenciaFibonacciDe(5);
        Printer imprimir = new Printer(fibo, "vi", "s");
        imprimir.crearCuerpo();

        Assert.assertEquals(" 7", imprimir.getCuerpo());
    }


    @Test
    public void obtenerImpresionModoSumatoriaTest(){
        Fibo fibo = new Fibo();
        fibo.generarSecuenciaFibonacciDe(5);
        Printer imprimir = new Printer(fibo, "hd", "s");

        Assert.assertEquals("fibo<5>s: 7", imprimir.imprimir());

    }

    @Test
    public void obtenerImpresionOpcionInversaTest(){
        Fibo fibo = new Fibo();
        fibo.generarSecuenciaFibonacciDe(5);
        Printer imprimir = new Printer(fibo, "hi", "l");

        Assert.assertEquals("fibo<5>: 3 2 1 1 0", imprimir.imprimir());
    }

    @Test
    public void obtenerImpresionOpcionInversaYVerticalTest(){
        Fibo fibo = new Fibo();
        fibo.generarSecuenciaFibonacciDe(5);
        Printer imprimir = new Printer(fibo, "vi", "l");

        Assert.assertEquals("fibo<5>:\n3\n2\n1\n1\n0", imprimir.imprimir());
    }
}
