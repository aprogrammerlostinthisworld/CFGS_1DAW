package ejercicio2a;

public class prueba {

	protected String nombre;
	protected int ID;
	public String getIdent(){
		return nombre;
	}
	
	/*public int getIdent(){
		return ID;
	}*/
	
	/**Da error porque el compilador va a reconocer dos m�todos iguales
	 * para que no hubiera errores a una de ellas, por ejemplo
	 * habr�a que pasarle una variable como par�metro del m�todo*/
}