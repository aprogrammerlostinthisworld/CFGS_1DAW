package ejercicio12;

public class aplicacion12 {

	public static void main(String[] args) {
		System.out.print("Introduzca n�mero a multiplicar:");
		int num=Leer.datoInt();
		System.out.print("Introduzca el n�mero de veces a multiplicar:");
		int num1=Leer.datoInt();
		ejercicio12 multiplicar = new ejercicio12();
		multiplicar.suma(num,num1);
	}
}