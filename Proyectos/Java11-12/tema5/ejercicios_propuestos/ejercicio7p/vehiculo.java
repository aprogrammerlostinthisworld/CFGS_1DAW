package ejercicio7p;

public class vehiculo {
	private int peso;
	public final void setPeso(int p){
		peso = p;
	}
	//public abstract int getValorActual();
	
	/*1� Si puede tener descendencia, porque tiene el atributo abstract, las
	 * clases con este atributo est�n hechas para ser heredadas*/
	/**2� No, el m�todo setPeso no puede ser sobreescrito porque tiene
	 * el atributo final y ning�n m�todo con este atributo puede modificarse
	 * si no es en la clase padre*/
}