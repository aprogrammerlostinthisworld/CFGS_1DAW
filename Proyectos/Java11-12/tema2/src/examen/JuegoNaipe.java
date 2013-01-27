package examen;
public class JuegoNaipe{
	private Naipe naipe1;
	private Naipe naipe2;
	private Naipe naipe3;
	
	public JuegoNaipe(){
		naipe1 = new Naipe();
		naipe2 = new Naipe();
		naipe3 = new Naipe();
	}
	
	// Mostrar� la informaci�n de los 3 naipes y calcular� si se ha ganado el juego o no.
	public void jugar(){
		naipe1.mostrarNaipe();
		naipe2.mostrarNaipe();
		naipe3.mostrarNaipe();
		if ((naipe1.devolverNumero()+naipe2.devolverNumero()+naipe3.devolverNumero() > 25) ||
			((naipe1.devolverPalo().compareTo(naipe2.devolverPalo()) == 0) && (naipe1.devolverPalo().compareTo(naipe3.devolverPalo())==0))){
			System.out.println("\nENHORABUENA. USTED GAN� EL JUEGO");
		}else{
			System.out.println("\nLO SENTIMOS. USTED PERDI� EL JUEGO");
		}
	}
}