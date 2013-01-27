package ejercicio11;
/*==============================================================================*/
/* TEMA : 03																	*/
/* TITULO PROGRAMA:(package)	Mi_Math                        		 	      	*/
/* REALIZADO POR: JMLB_CRECIONES S.L.	                                     	*/
/*																				*/
/*==============================================================================*/

/*======================================================================*/
/* DESCRIPCION: desarrollamos un programa con una clase que haga varios */
/*		calculos matem�ticos sin utilizar la 							*/
/*		clase Math.java, sin utilizar recursividad, s�lo bucles.		*/
/*		1� el primer m�todo calcular� el factorial de un n�int			*/
/*		el segundo una potencia de otro n�mero.  						*/
/*		y sin utilizar bucles como tu quieras suma la sucesi�n			*/
/*		de n�meros desde el 1 hasta el n�mero dado.						*/
/*		Buscar la soluci�n m�s sencilla. Utiliza estas cabeceras		*/
/*		el n� 4 del men� es un SetNumero(), para cambiarlo.
/* CLASE1:   MiMath														*/
/* METODO1:  Factorial()               		                       		*/
/* METODO2:  Potencia()    	           		        					*/
/* METODO3:  SumaSucesion()                            		        	*/
/*																		*/
/* MAIN:     AppMiMath                									*/
/* 				                 		       						    */
/*======================================================================*/

public class MiMath{

	/*======================================================================*/
	/* ATRIBUTOS: Numero	                                              	*/
	/* VARIABLES TIPO STATIC EMPLEADAS:   no	                            */
	/* VARIABLES LOCALES EMPLEADAS:	 ...     				                */
	/* CONSTANTES EMPLEADAS:	no      				                    */
	/*									                                    */
	/*======================================================================*/	
	
	private long Numero=1; //inicialmente le damos el valor 1 para poder aceptar las dem�s opciones del men� sin errores
	
	/*======================================================================*/
	/* Constructor: MiMath(int n)   					                    */
	/*      PARAMETROS:	no						                            */
	/*	    DESCRIPCION: Es el constructor de la clase			           	*/	
	/*======================================================================*/
	
	public MiMath(){}
	
	/*======================================================================*/
	/* METODO1: Factorial()   					                            */
	/*      PARAMETROS:	no						                            */
	/*	    DESCRIPCION: Realiza la multiplicaci�n de n�meros desde un  n�  */
	/*		hasta el 1. 19!(factorial) = 19*18*17*16...*2*1 =            	*/	
	/*======================================================================*/

	public long Factorial(){
		long numero=this.Numero;
		long resultado=1;
		for(int i=1; i<=numero; i++){
			resultado*=i;
		}
		return resultado;
	}
	
	/*======================================================================*/
	/* METODO2: Potencia()                  								*/
	/*      PARAMETROS:	npotencia n�mero por teclado           						*/
	/*		DESCRIPCION: Calcula la potencia de un n�emro N ^ a otro M dado	*/
	/*					por teclado 										*/
	/*																		*/
	/*======================================================================*/
	
	public long Potencia(){
		int npotencia;
		System.out.println("Dime otro n�mero");
		npotencia= Leer.datoInt();
		long numero=this.Numero;
		long resultado=1;
		if (resultado ==0) {System.out.println(" Demasiado grande para mi ");}
		for (int i=1; i<=npotencia; i++){
			resultado=resultado*numero;
		}
		return resultado;
	}
	
	/*======================================================================*/
	/* METODO3: SumaSucesion()     							            	*/
	/*      PARAMETROS:	no                          						*/
	/*		DESCRIPCION: Calcula la sucesi�n de n�meros desde 1 hasta n,    */
	/*					sumados todos ellos. Sin bucles Dif. Max.			*/
	/*																		*/
	/*======================================================================*/
	
	public long SumaSucesion(){
		long numero=this.Numero;
		long resultado=1;
		long med=(numero+1)/2;
		if (numero%2==0){
			resultado=(1+numero)* numero/2;
		}else{
			resultado=((1+numero)*numero/2)+med;
		}
		return resultado;
	}

	/*======================================================================*/
	/* METODO4: SetNumero()     							            	*/
	/*      PARAMETROS:	no  en principio luego se toma por teclado			*/
	/*		DESCRIPCION: Cambia el valor del atributo Numero    			*/
	/*																		*/
	/*======================================================================*/
	
	public void SetNumero(){
		long n;
		System.out.println("Dime un n�mero: ");
		n=Leer.datoLong();
		this.Numero=n;
	}
	
	/*======================================================================*/
	/* METODO5: GetNumero()     							            	*/
	/*      PARAMETROS:	No													*/
	/*		DESCRIPCION: Devuelve el valor del atributo Numero    			*/
	/*																		*/
	/*======================================================================*/
	
	public long GetNumero(){
		long n;
		n=this.Numero;
		return n;		
	}
	
	/*======================================================================*/
	/* METODO6: AveriguaM(resultado)     			     	            	*/
	/*      PARAMETROS:	SI. resultado de la potencia  						*/
	/*		DESCRIPCION: averigua m en la potencia n^m=resultado ; n es el 	*/
	/*		Atributo Numero de la clase 									*/
	/*																		*/
	/*======================================================================*/
	
	public long AveriguaM(long resultado){
		long m=0; long n; // m intentamos averiguar, n = Numero; resultado= n^m, aux= variable auxiliar
		n=this.Numero; long aux=1;
		do{
			aux=aux*n;
			m++;	
		}while (aux<resultado);
		return m;
	}
}