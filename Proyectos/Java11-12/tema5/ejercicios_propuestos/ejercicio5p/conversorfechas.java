package ejercicio5p;

public class conversorfechas {

	private int dia;
	private int mes;
	private int a�o;
	
	public conversorfechas(int dias, int meses, int a�os){
		this.dia = dias;
		this.mes = meses;
		this.a�o = a�os;
	}
	
	public String normalToAmericano(){
		String cadena;
		cadena = mes+"/"+dia+"/"+a�o;
		return cadena;
	}
	
	public String americanoToNormal(){
		String cadena1;
		cadena1 = dia+"/"+mes+"/"+a�o;
		return cadena1;
	}
	
	/*substring(n,f)
	 * n: primer caracter que cogemos de String
	 * f: el �ltimo caracter que cogemos del String
	 * 
	 * substring(m)
	 * m: es el principio del string y llega hasta el final*/
	
	/**public static String normalToAmericano(String normal){
	 * String americano = "";
	 * StringBuffer str = new StringBuffer(normal);
	 * americano = ((str.insert(0,str.substring(3, 6))).delete(6, 9).toString());
	 * return americano;
	 * }
	 * 
	 * public static String americanoToNormal(String americano){
	 * String normal = "";
	 * normal = americano.substring(3,5) + americano.substring(0,2) + americano.substring(6).toString();
	 * return normal;
	 * }*/
}