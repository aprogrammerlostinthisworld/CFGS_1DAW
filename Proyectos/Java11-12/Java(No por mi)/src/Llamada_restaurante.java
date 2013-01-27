import java.io.*;

public class Llamada_restaurante  {
	public static void main (String [] args) throws IOException {
		float chocos_totales, papas_totales, chocos_a�adidos, papas_a�adidos, papas_final, chocos_final;
		
		Restaurante consulta = new Restaurante ();
		
		BufferedReader ingrediente = new BufferedReader (new InputStreamReader (System.in));
		
		System.out.println("Introduzca la cantidad de chocos");		//Establecer cantidad de chocos
		chocos_totales=Float.parseFloat(ingrediente.readLine());
		consulta.addChocos(chocos_totales);
		
		System.out.println("Introduzca la cantidad de papas");		//Establecer cantidad de papas
		papas_totales=Float.parseFloat(ingrediente.readLine());
		consulta.addPapas(papas_totales);
		
		System.out.println("A�ada mas cantidad de chocos");			//Chocos a�adidos
		chocos_a�adidos=Float.parseFloat(ingrediente.readLine());
		consulta.addChocos(chocos_a�adidos);	
		
		System.out.println("A�ada mas cantidad de papas");			//Papas a�adidas
		papas_a�adidos=Float.parseFloat(ingrediente.readLine());
		consulta.addPapas(papas_a�adidos);
		
		papas_final=papas_totales+papas_a�adidos;
		chocos_final=chocos_totales+chocos_a�adidos;
																	//Emision de los resultados
		System.out.println("Chocos totales:");
		consulta.showChocos();
		System.out.println("Papas totales:");
		consulta.showPapas();
		System.out.println("Clientes atendidos:");
		System.out.println(consulta.getComensales(papas_final, chocos_final));
	}
}