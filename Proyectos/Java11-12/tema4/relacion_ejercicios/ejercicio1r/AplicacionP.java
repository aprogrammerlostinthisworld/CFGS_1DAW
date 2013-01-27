package ejercicio1r;

public class AplicacionP {
	
	public static void menu(){
		System.out.println("Profesores y Alumnos");
		System.out.println("1.- A�adir Alumno/a");
		System.out.println("2.- A�adir Profesor/a");
		System.out.println("3.- Mostrar informaci�n Alumno/a");
		System.out.println("4.- Mostrar informaci�n Profesor/a");
		System.out.println("0.- SALIR");
		System.out.println();
		System.out.print("Introduce opci�n a realizar:");
	}

	@SuppressWarnings({ "null" })
	public static void main(String[] args) throws InterruptedException {
		
		CAlumnado alumno = null;
		CProfesor profesor = null;
		
		int opc = 0, matricula = 0, nota = 0, registros = 0, clase = 0,
				edad = 0, altura = 0;
		String nombre, asignatura;
		do{
			menu();
			opc = Leer.datoInt();
			System.out.println();
		}while ((opc>4)||(opc<0));
		
		switch(opc){
		case 1:
			System.out.println("Has elegido A�ADIR ALUMNO/A");
			System.out.print("Introduzca el nombre: ");
			nombre = Leer.dato();
			System.out.print("Introduzca la edad: ");
			edad = Leer.datoInt();
			System.out.print("Introduzca la altura: ");
			altura = Leer.datoInt();
			System.out.print("Introduzca el n�mero de matr�cula: ");
			matricula = Leer.datoInt();
			System.out.print("Introduzca asignatura: ");
			asignatura = Leer.dato();
			System.out.print("Introduzca nota: ");
			nota = Leer.datoInt();
			alumno = new CAlumnado(nombre, edad, altura ,matricula, asignatura, nota);
			break;
			
		case 2:
			System.out.println("Has elegido A�ADIR PROFESOR/A");
			System.out.print("Introduzca el nombre: ");
			nombre = Leer.dato();
			System.out.print("Introduzca la edad: ");
			edad = Leer.datoInt();
			System.out.print("Introduzca la altura: ");
			altura = Leer.datoInt();
			System.out.print("Introduzca el n�mero de registro: ");
			registros = Leer.datoInt();
			System.out.print("Introduzca la clase: ");
			clase = Leer.datoInt();
			profesor = new CProfesor(nombre, edad, altura, registros, clase);
			break;
			
		case 3:
			alumno.mostrarinformacionalumno();
			Thread.sleep(5000);
			main(null);
			break;
			
		case 4:
			profesor.mostrarinformacionpro();
			Thread.sleep(5000);
			main(null);
			break;
			
		case 0:
			System.out.println("SALIR");
			break;
		}
	}
}