package Ejercicio1;

public class principal {

	public static void main (String[]args){
		circulo circ = new circulo();
		cuadrado cuadr = new cuadrado();
		rectangulo rectan = new rectangulo();
		
		//Muestro las caracter�sticas sin ning�n dato de entrada (Constructores vac�os)
		System.out.println(circ.toString());
		System.out.println(cuadr.toString());
		System.out.println(rectan.toString());
		
		//Introduzco los datos de entrada instanciando a otros objetos
		circulo circdatos = new circulo("c�rculo","rojo",2);
		cuadrado cuadrdatos = new cuadrado("cuadrado","verde",5.5);
		rectangulo rectandatos = new rectangulo("rectangulo","amarillo",5.2,3.5);
		
		//Muestro las caracter�sticas con los datos de entrada
		System.out.println(circdatos.toString());
		System.out.println(cuadrdatos.toString());
		System.out.println(rectandatos.toString());
		
		//Cambio algunos par�metros
		circdatos.setColor("gris");
		circdatos.setRadio(5.1);
		
		cuadrdatos.setColor("negro");
		cuadrdatos.setLado(2.6);
		
		rectandatos.setColor("blanco");
		rectandatos.setBase(4.6);
		rectandatos.setAltura(8.1);
		
		//Muestro las caracter�sticas con los datos cambiados
		System.out.println(circdatos.toString());
		System.out.println(cuadrdatos.toString());
		System.out.println(rectandatos.toString());
		
	}
	
	public boolean igualdad(){
		boolean verdad = false;
		return verdad;
	}
}