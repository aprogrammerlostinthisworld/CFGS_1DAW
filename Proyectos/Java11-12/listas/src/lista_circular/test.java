package lista_circular;

public class test {
	
	public static void main(String[] args) {
		listac<Cdatos> listacir = new listac<Cdatos>();
		
		Cdatos d1 = new Cdatos("jose", 5.2);
		Cdatos d2 = new Cdatos("pedro", 7.65);
		Cdatos d3 = new Cdatos("antonio", 9.5);
		
		listacir.addFirst(d1);
		listacir.addFirst(d3);
		listacir.addFirst(d2);
		
		System.out.println(listacir);
		
		listacir.borrar();
		
		System.out.println(listacir);
	}
}