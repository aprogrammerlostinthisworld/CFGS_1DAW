public class Ejercicio1_Examen {

	public static void main(String[] args)
	{
		// Declaraci�n de variables
		final int MESES_EN_UN_A�O = 12;
		float cuantiaPrestamo = 0.0f, interesAnual = 0.0f, interesMensual = 0.0f;
		int duracionPrestamo = 1;
		double pagoMensual = 0.0, pagoTotal = 0.0;
		int numeroPagos = 0;
		
		// Parte ejecutiva del programa
		System.out.println("Este programa calbula el pago mensual y " +
				"total de un prestamo");
		
		// Entrada de datos
		cuantiaPrestamo = 100000;
		interesAnual = 3.5f;
		duracionPrestamo = 15;
		
		// C�lculo del prestamo
		interesMensual = interesAnual / 100.0f / MESES_EN_UN_A�O;
		numeroPagos = duracionPrestamo * MESES_EN_UN_A�O;
		pagoMensual = (cuantiaPrestamo * interesMensual) / (1 - Math.pow(1+interesMensual,-numeroPagos));
		pagoTotal = pagoMensual * numeroPagos;
		
		// Salida de datos
		System.out.println("\n Cuantia del prestamo: " + cuantiaPrestamo + " euros");
		System.out.println(" Interes anual: " + interesAnual + "%");
		System.out.println(" Duraci�n del prestamo (a�os): " + duracionPrestamo);
		System.out.println(" Pago mensual: " + pagoMensual + " euros");
		System.out.println(" Cantidad total a pagar: " + pagoTotal + " euros");
	}
}
