package ejercicio5;

public class aplicacion5p {

	public static void main(String []args){
		System.out.print("Introduzca n�mero m�ximo para imprimir los n�meros primos hasta este n�mero:");
		int num=Leerr.datoInt();
		ejercicio5 ejemplo1=new ejercicio5();
		ejemplo1.primos(num);
	}
}