package ejercicio2;

public class Ejercicio2r
{
	public static void main(String args[])
	{
		String nombre;
		final int ANYO = 2030;
		int nacimiento;
		int edad;
    
		
		System.out.print("Introduce el nombre: ");
		nombre=Leerr.dato();
		System.out.print("Introduzca el a�o de nacimiento: ");
		nacimiento=Leerr.datoInt();
		edad = ANYO-nacimiento;
		System.out.println("Hola " + nombre + " en el a�o 2030 tendr�s "+ edad +" a�os.");
	}
}
