package alquiler;

public class veh�culo {

	protected int matricula;
	protected double precio;
	
	public veh�culo(){
		matricula = 0;
		precio = 50.0;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public double getPrecio(){
		return precio;
	}
	
	public void setPrecio(int precio){
		this.precio = precio;
	}
	public double preciobase(int dia){
		double resultado = 0.0;
		resultado = precio * dia;
		return resultado;
	}
}