package ejercicio13;

public class ejercicio13 {

	public void par(int num){
		if(num%2==0){
			System.out.println("El n�mero "+num+" es par");
		}else{
			System.out.println("El n�mero "+num+" no es par");
		}
	}
	
	public void multiplo(int num){
		if(num%5==0){
			System.out.println("El n�mero "+num+" es m�ltiplo de 5");
		}else{
			System.out.println("El n�mero "+num+" no es m�ltiplo de 5");
		}
	}
	
	public void tabla(int num){
		System.out.println("Tabla del "+num);
		System.out.println("************");
		for(int i=1;i<=10;i++){
			int num3=num;
			int num4=num3*i;
			System.out.println(num3+" * "+i+" = "+num4);
		}
	}
	
	public void menu() throws InterruptedException{
		System.out.println("Programa para comprobar si un n�mero es par,");
		System.out.println("si es m�ltiplo de 5 o imprimir su tabla de multiplicar");
		System.out.println("********************************************************");
		System.out.println("�Qu� desea realizar?");
		System.out.println("Opci�n 1: Comprobar si un n�mero es par");
		System.out.println("Opci�n 2: Comprobar si es m�ltiplo de 5");
		System.out.println("Opci�n 3: Imprimir su tabla de multiplicar");
		System.out.println("Opci�n 4: Salir del programa");
		System.out.print("Introduzca opci�n deseada: ");
	}
}
