package ejemplo_examen;

public class Instituto{
	
	private final int TAMPERSONAS = 100;
	private Persona[] personal;
	private int numPersonas;
	
	public Instituto(){
		personal = new Persona[TAMPERSONAS];
		numPersonas = 0;
	}
	
	public void insertarPersona(Persona pers){
		if (numPersonas < TAMPERSONAS){
			personal[numPersonas] = pers;
			numPersonas++;
		}
	}
	
	public int numeroPersonas(){
		return numPersonas;
	}
	
	public String mostrarPersonas(){
		String cadena = "";
		for (int indice = 0; indice < numPersonas;indice++){
			if (personal[indice] instanceof Profesor)
				cadena += "PROFESOR" + "\n";
			else if (personal[indice] instanceof Alumno)
				cadena += "ALUMNO" + "\n";
			
			cadena += personal[indice].toString();
			cadena += "\n";
		}
		return cadena;
	}
}