package ar.edu.untref.dyasc;

public class Fibo {

	private int[] secuencia;
	private int numeroDeSecuencia;
	private int sumatoria;

	public void generarSecuenciaFibonacciDe(int n) {
	    this.secuencia = new int[n];
		this.setNumeroDeSecuencia(n);
		this.setSumatoria(0);

		if (n == 1) {
		    secuencia[0] = 0;
		}else if (n > 1){
		    secuencia[0] = 0;
		    secuencia [1] = 1;
		    this.setSumatoria(1);
		}
		for (int i = 2; i < secuencia.length; i++){
		    secuencia[i] = secuencia[i-1] + secuencia[i-2];
		    this.setSumatoria(this.getSumatoria() + secuencia[i-1] + secuencia[i-2]);
		}
		this.setSecuencia(secuencia);
	}

	public int[] getSecuencia(){
		return this.secuencia;
	}

	public void setSecuencia(int[] secuencia){
		this.secuencia = secuencia;
	}

	public int getNumeroDeSecuencia(){
		return this.numeroDeSecuencia;
	}

	public void setNumeroDeSecuencia(int numeroDeSecuencia){
		this.numeroDeSecuencia = numeroDeSecuencia;
	}

	public int getSumatoria(){
		return this.sumatoria;
	}

	public void setSumatoria(int sumatoria){
		this.sumatoria = sumatoria;
	}

}


