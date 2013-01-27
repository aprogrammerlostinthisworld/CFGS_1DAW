package lista_circular;

public class Cdatos {
	
	private String nombre;
	private double nota;
	
	public Cdatos(){
		nombre = null;
		nota = 0.0;
	}
	
	public Cdatos(String nom, double not){
		nombre = nom;
		nota = not;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public String toString(){
		String cadena ="";
		cadena += getNombre()+" "+getNota();
		return cadena;
	}
}