import java.util.*;

public class test{
	
	public static boolean isIgual(colad c,pilad p){
		boolean igual = false;
		if((!c.colaVacia())&&(!p.pilaVacia())&&(c.toString(c.pop()).compareToIgnoreCase(p.toString(p.pop()))==0))
			igual = true;
		
		return igual;
	}

	public static void main(String[] args){
		
		pilad pila = new pilad();
		colad cola = new colad();
		ArrayList<Character> ch = new ArrayList<Character>();
		Scanner lector = new Scanner(System.in);
		String cadena = "";
		int i = 0;
		
		System.out.print("Introduzca palindromo:");
		cadena = lector.nextLine();
		
		while(i<cadena.length()){
			ch.add(cadena.charAt(i));
			if(cadena.charAt(i)!=' '){
				cola.push(ch.get(i));
				pila.push(ch.get(i));
			}
			i++;
		}
		
		if(isIgual(cola,pila)){
			System.out.println("La frase o palabra \""+cadena+"\" es un palindromo");
		}else{
			System.out.println("La frase o palabra \""+cadena+"\" NO es un palindromo");
		}
	}
}