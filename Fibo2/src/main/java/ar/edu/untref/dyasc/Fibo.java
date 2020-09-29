package ar.edu.untref.dyasc;

public class Fibo{

  
    public Fibo() {
    } 
    
  // metodo main que muestra el resultado

    public static void main(String[] args) {
        char orientacion = ' '; 
        char direccion = ' ';
        int cantidadTerminos = 0;
        if(args.length == 2) {
            String opcion = args[0].substring(0, 3);
            orientacion = args[0].charAt(3);
            direccion = args[0].charAt(4);
            if(!(opcion.equals("-o=") && (orientacion == 'v' || orientacion == 'h') && (direccion == 'd' || direccion == 'i'))) {
                System.out.println("Opcion no valida");
                return;
            }
        cantidadTerminos = Integer.parseInt(args[1]);
        } else {
            cantidadTerminos = Integer.parseInt(args[0]);
            orientacion = 'h';
            direccion = 'd';
        }
        Fibo f = new Fibo();
        int[] resultado = f.fibonacci(cantidadTerminos);
        System.out.println(f.mostrarSerie(resultado, orientacion, direccion));

    }
    
    public int[] fibonacci(int cantidadTerminos) {
        int[] serie = new int[cantidadTerminos];
        if (cantidadTerminos == 1) {
            serie[0] = 0;
        } else if (cantidadTerminos > 1) {
            serie[0] = 0;
            serie[1] = 1;
        }
        for (int i = 2; i < serie.length; i++) {
            serie[i] = serie[i - 1] + serie[i - 2];
        }
        return serie;
    }
        
    public String mostrarSerie(int[] serie, char orientacion, char direccion) {
        String salida = "fibo<" + serie.length + ">:";
        if(direccion == 'd') {
            for(int i = 0; i < serie.length; i++) {
                salida = comoMostrar(serie, i, orientacion, salida);
            }
        } else {
            for(int i = serie.length-1; i >= 0; i--) {
                salida = comoMostrar(serie, i, orientacion, salida);
            }
        }
            
        return salida;
    }

    public String comoMostrar(int[] serie, int indice, char orientacion, String salida) {
        if(orientacion == 'h') {
            salida += " " + serie[indice];
        } else {
            salida += "\n" + serie[indice];
        }    
        return salida;
    }
}
