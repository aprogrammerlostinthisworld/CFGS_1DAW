public class Propuestos_tema1_ej1_almudena{
	/* Realizar una aplicaci�n que resuelva un problema de un tri�ngulo rect�ngulo abc con el teorema de 
	 * Pit�goras. Realizar un m�todo para calcular la c=hipotenusa, el b=cateto opuesto y el a=cateto adyacente,
	 * pas�ndole por par�metros los datos correspondientes para realizar la f�rmula. (Almudena)*/
	
	static void cateto1(int a,int c){
		int result;
		result=+(int)(Math.sqrt(Math.pow(c,2)-Math.pow(a,2)));
		System.out.println("El cateto mide: "+result);
	}
	 
	static void cateto2(int b,int c){
		int result;
		result=+(int)(Math.sqrt(Math.pow(c,2)-Math.pow(b,2)));
		System.out.println("El cateto mide: "+result);
	}
	static void hipotenusa(int a,int b){
		int result;
		result=+(int)(Math.sqrt(Math.pow(b,2)+Math.pow(a,2)));
		System.out.println("La hipotenusa mide: "+result);
	}
	public static void main(String[] args) {
		
	cateto1(2,5);
	cateto2(5,8);
	hipotenusa(4,2);
	}
}