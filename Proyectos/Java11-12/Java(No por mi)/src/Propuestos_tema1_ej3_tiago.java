import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Propuestos_tema1_ej3_tiago{
	/*(if y else) Dado un n�mero entero decir si es positivo, negativo o nulo. (Tiago)
	 * 				Ejemplo de salida: El n�mero 10 es positivo.*/
	public static void main(String[]args)throws IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int num;
		System.out.println("Introduce un numero:");
		num=Integer.parseInt(lectura.readLine());
		
		if(num==0){
			System.out.println("Es nulo");
		}
		else if(num%2==0){
			System.out.println("Es par");
		}else{
			System.out.println("Es impar");
		}
	}
}