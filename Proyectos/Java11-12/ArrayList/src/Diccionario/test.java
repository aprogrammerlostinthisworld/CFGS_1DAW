package Diccionario;

import java.util.Scanner;

public class test {

	public void menu(){
		System.out.println("Diccionario Biling�e");
		System.out.println("/////////////////////");
		System.out.println("1. Mostrar todo el diccionario");
		System.out.println("2. Buscar palabras Espa�ol-Ingles");
		System.out.println("3. Buscar palabras Ingles-Espa�ol");
		System.out.println("4. Salir");
	}
	
	public static void main(String[] args) {
		
		principal diccio = new principal();
		test dic = new test();
		Scanner lector = new Scanner(System.in);
		diccio.insertar();
		
		int opc;
		String palabraE="", palabraI="";

		do{
			dic.menu();
			opc=lector.nextInt();

		}while((opc>4)||(opc<1));
		
		switch(opc){

		case 1:
			diccio.mostrar();
			break;
		
		case 2:
			System.out.print("Introduzca palabra a buscar [Espa�ol-Ingles]: ");
			palabraE=lector.next();
			System.out.println();
			diccio.buscarE(palabraE);
			break;
		
		case 3:
			System.out.print("Introduzca palabra a buscar [Ingles-Espa�ol]: ");
			palabraI=lector.next();
			System.out.println();
			diccio.buscarI(palabraI);
			break;
		
		case 4:
			System.out.println("SALIR");
			break;
		}
	}
}