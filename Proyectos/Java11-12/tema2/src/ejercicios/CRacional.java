package ejercicios;
public class CRacional{
  // Atributos
  private long numerador;
  private long denominador;
  
  // M�todos
  public CRacional(){ // constructor
    numerador = 0;
    denominador = 1;
  }

  public CRacional(long num){ // constructor
    numerador = num;
    denominador = 1;
  }

  public CRacional(long num, long den){ // constructor
    numerador = num;
    denominador = den;
    if (denominador== 0){
      System.out.println("Error: denominador 0. Se asigna 1.");
      denominador = 1;
    }
    if (denominador <0){
      numerador = -numerador;
      denominador = -denominador;
    }
  }
  
  public CRacional(CRacional r){ // constructor copia
     numerador = r.numerador;
     denominador = r.denominador;
  }

  // Sumar n�meros racionales
  public CRacional Sumar(CRacional r){
    return new CRacional(numerador * r.denominador +
                         denominador * r.numerador,
                         denominador * r.denominador );
  }
  
  // Restar n�meros racionales
  public CRacional Restar(CRacional r){
    return new CRacional(numerador * r.denominador -
                         denominador * r.numerador,
                         denominador * r.denominador );
  }
  
  // Multiplicar n�meros racionales
  public CRacional Multiplicar(CRacional r){
    return new CRacional(numerador * r.numerador,
                         denominador * r.denominador );
  }
  
  // mcd Recursivo (otra manera de hacer el mcd
  /**private long mcdRec(long num1, long num2){
	  long res = 0;
	  
	  if (num2 == 0)
		  res = num1;
	  else
		  res = mcdRec(num2, num1%num2);
	  
	  return res;
  }*/
  
  private long mcdIt(long num1, long num2){
	  long temp, r;
	  
	  if (num1<num2){   // Pongo como num1 el mayor de los dos
		  temp=num1;
		  num1=num2;
		  num2=temp;
	  }
	  
	  while (num2 != 0){
		  r = num1%num2;
		  num1 = num2;
		  num2 = r;
	  }
	  
	  return num1;
  }
  
  public void Simplificar(){
	  long mcd;
	  
	  mcd = mcdIt(numerador,denominador);
	  numerador = numerador/mcd;
	  denominador = denominador/mcd;
  }
  
  // Devolver un n�mero racional como cadena
  public String ToString(){
  	return numerador + "/" + denominador;
  }
}