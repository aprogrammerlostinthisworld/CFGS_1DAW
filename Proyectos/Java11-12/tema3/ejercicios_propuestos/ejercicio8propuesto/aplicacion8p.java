package ejercicio8propuesto;

public class aplicacion8p {
	
	public static void main(String[] args) {
		System.out.println("Conversi�n de n�meros de decimales a romanos (1-3999)");
		System.out.println();
		System.out.print("Introduzca n�mero decimal:");
		int num=Leer.datoInt();
		System.out.print("El valor en romano es: ");
		ejercicio8p decimal=new ejercicio8p();
		decimal.decimalToRomano(num);
	}
}