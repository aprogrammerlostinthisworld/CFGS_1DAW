package ejercicio9propuesto;

public class aplicacion9p {
	
	public static void main(String[] args) {
		System.out.print("Introduzca n�mero: ");
		int num=Leer.datoInt();
		ejercicio9p primo =new ejercicio9p();
		primo.esOmirp(num);
		primo.cambiar(num);
	}
}