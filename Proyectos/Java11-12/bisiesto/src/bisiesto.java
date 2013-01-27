import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Importamos de la biblioteca java.io, los elementos necesarios para construir las excepciones
  necesarias y leer de consola los datos necesarios*/

public class bisiesto {
	
	    /*Hacemos un m�todo (calcular()) que nos dira si el a�o leido de consola es bisiesto o no
	      o segun el caso de error por un valor inadecuado, por ejemplo: a�o en negativo*/
	
	    public static int calcular(int a�o) throws NumberFormatException, IOException{
	    	InputStreamReader isr = new InputStreamReader(System.in);
	        BufferedReader flujoE = new BufferedReader(isr);
	    	System.out.print("Introduce a�o (Ej: 1999): ");
	    	a�o=Integer.parseInt(flujoE.readLine());
	    	if(a�o<0)
	    		System.out.print("Error a�o introducido negativo o incorrecto");
	    	else if (((a�o % 4 == 0)&&(a�o % 100 != 0))||(a�o % 400 == 0))
	             System.out.println("El a�o "+a�o+" es bisiesto.");
	         else 
	             System.out.println("El a�o "+a�o+" no es bisiesto.");
			return 0;
	    }
	    public static void main (String[]args) throws NumberFormatException, IOException{
	    	bisiesto.calcular(1999);
	    }
}


