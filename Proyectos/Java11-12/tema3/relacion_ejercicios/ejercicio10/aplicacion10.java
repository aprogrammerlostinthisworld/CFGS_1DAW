package ejercicio10;

public class aplicacion10 {

	public static void main(String[] args) {
		System.out.print("Introduzca n�mero para imprimir, contar y sumar los n�meros m�ltiplos de 3:");
		int num=Leer.datoInt();
		ejercicio10 multiplo=new ejercicio10();
		multiplo.muestre(num);
		multiplo.cuente(num);
		multiplo.suma(num);
	}
}