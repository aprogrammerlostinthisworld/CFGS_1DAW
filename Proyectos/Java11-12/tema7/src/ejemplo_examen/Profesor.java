package ejemplo_examen;

public class Profesor extends Persona
{
	private float sueldo;
	
	public Profesor(String nom, int ed, float sue)
	{
		super(nom,ed);
		this.sueldo = sue;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString()
	{
		String cadena;
		
		cadena = super.toString();
		cadena += "Sueldo: " + this.getSueldo() + "\n";
		
		return cadena;
	}
}