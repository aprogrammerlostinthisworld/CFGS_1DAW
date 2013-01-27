package ejercicio9;

public class relojarena {
	
	/*La clase relojarena.java contiene un constructor y un m�todo.
	 * 
	 * Al constructor le paso la variable altura y dentro del constructor
	 * controlo las condiciones dichas en el ejercicio propuesto.
	 * 
	 * En el m�todo realizo la figura con la variable de la 
	 * clase altura ya controlada.
	 * 
	 * Primero hago el tri�ngulo invertido (ejemplo: altura = 7)
	 * 
	 *  *******
	 *   *****
	 *    ***
	 *     *
	 * 
	 * y luego hago el segundo tri�ngulo 
	 * 
	 *    ***
	 *   *****
	 *  *******
	 * 
	 * al derecho quit�ndole la primera fila ya que �sta
	 * primera fila es tambi�n la �ltima fila del otro tri�ngulo.*/

	private int alt;
	
	public relojarena(int altura){
		if(altura % 2 == 0){
			altura = 5;
			alt = altura;
		}
			
		if(altura <= 1){
			altura = 5;
			alt = altura;
		}
		
		else
			alt = altura;
	}
	
	public void reloj(){
			
		int blancos, asteriscos, filas;
		
		for(filas = alt/2+1; filas > 0; filas--){
			
			for(blancos = 0; blancos <= alt - filas - 2; blancos++){
				System.out.print(" ");
			}
				
			for(asteriscos = 0; asteriscos < 2 * (filas - 1) + 1; asteriscos++){
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(filas = 2; filas <= alt/2+1; filas++){
				
			for(blancos = 0; blancos <= alt - filas - 2; blancos++){
				System.out.print(" ");
			}
				
			for(asteriscos = 0; asteriscos < 2 * (filas - 1) + 1; asteriscos++){
				System.out.print("*");
			}
				
			System.out.println();
		}
	}
}