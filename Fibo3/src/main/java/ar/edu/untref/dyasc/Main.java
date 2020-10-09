package ar.edu.untref.dyasc;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws ArgumentException, IOException {
		Argument argumento = new Argument();
		argumento.leerParametros(args);
		Fibo fibo = new Fibo();

		fibo.generarSecuenciaFibonacciDe(argumento.getNumeroSucesion());

		Printer print = new Printer(fibo, argumento.getOpcion(), argumento.getModo());

		if(argumento.getArchivo()!= ""){
			ArchivoSalida archivo = new ArchivoSalida();
			archivo.guardarSalidaEnArchivo(print.imprimir(), argumento.getArchivo(), fibo.getNumeroDeSecuencia());
			System.out.println(archivo.getSalidaDeArchivo());
		} else {
			System.out.println(print.imprimir());
		}

	}
}