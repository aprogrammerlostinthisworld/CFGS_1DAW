package ejercicio2;

public class aplicacion2 {

	public static void main(String[] args) {
		System.out.print("Introduzca su nombre: ");
		String nombre1=Leerr.dato();
		System.out.print("Introduzca su a�o de nacimiento: ");
		int a�o=Leerr.datoInt();
		ejercicio2 nombre =new ejercicio2();
		nombre.noma�os(nombre1,a�o);
	}
}