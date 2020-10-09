package ar.edu.untref.dyasc;

import javafx.beans.binding.StringBinding;

import java.util.Arrays;

public class Printer {
    private String cabecera;
    private int [] secuencia;
    private String cuerpo;
    private String salida;
    private String modo = "l";
    private String opcion = "hd";
    private Fibo fibonacci;

    Printer(Fibo fibonacci){
        this.fibonacci = fibonacci;
        setSecuencia(fibonacci.getSecuencia());
    }

    Printer(Fibo fibonacci, String opcion, String modo){
        this(fibonacci);
        this.opcion = opcion;
        this.modo = modo;
    }

    public String imprimir() {
        this.crearCabecera();
        this.crearCuerpo();
        return this.getCabecera() + this.getCuerpo();
    }

    public int[] getSecuencia(){
        return this.secuencia;
    }

    public void setSecuencia(int[] secuencia){
        this.secuencia = secuencia;
    }

    public void crearCabecera() {
        StringBuilder cabecera = new StringBuilder();
        cabecera.append("fibo<" + String.valueOf(this.fibonacci.getNumeroDeSecuencia()) + ">");

        if(this.modo.equals("s")){
            cabecera.append("s");
        }
        cabecera.append(":");
        this.setCabecera(cabecera.toString());
    }

    public void setCabecera(String cabecera){
        this.cabecera = cabecera;
    }

    public String getCabecera() {
        return this.cabecera;
    }

    public void setCuerpo(String cuerpo){
        this.cuerpo = cuerpo;
    }

    public String getCuerpo(){
        return this.cuerpo;
    }

    public void crearCuerpo() {

        StringBuilder cuerpo = new StringBuilder();
        if(this.modo.equals("s")){

            cuerpo = this.imprimirSumatoria(cuerpo);
        } else  if (this.opcion.equals("hd")) {
            PrinterHD printer = new PrinterHD();
            cuerpo = printer.imprimirSecuencia(cuerpo, this.secuencia);

        } else if (this.opcion.equals("hi")){
           PrinterHI printer = new PrinterHI();
           cuerpo = printer.imprimirSecuencia(cuerpo, this.secuencia);


        }else  if (this.opcion.equals("vd")){
            PrinterVD printer = new PrinterVD();
            cuerpo = printer.imprimirSecuencia(cuerpo, this.secuencia);


        }else{
            PrinterVI printer = new PrinterVI();
            cuerpo = printer.imprimirSecuencia(cuerpo, this.secuencia);


        } 
            this.setCuerpo(cuerpo.toString());
        
    }
    
    private StringBuilder imprimirSumatoria(StringBuilder cuerpo){
        if(this.modo.equals("s")){
            cuerpo.append(" "+Integer.toString(fibonacci.getSumatoria()));
        }
        return cuerpo;
    }


}
