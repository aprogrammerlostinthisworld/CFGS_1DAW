/*Programa para ver los distintos valores de las variables seg�n su posici�n*/

public class visibilidad {
	static int valor=0;
		public static void mostrarValor(){
			int valor=3;
			System.out.println(valor);
		}

		public static void main(String[] args) {
		System.out.println(valor);
		valor++;
		mostrarValor();
		}
}
/*Hecho por Javier Gonz�lez*/