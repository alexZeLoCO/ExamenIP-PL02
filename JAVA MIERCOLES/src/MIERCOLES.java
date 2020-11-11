import java.util.Scanner;		//IMPORTA SCANNER
public class MIERCOLES {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREA TECLADO

		//EJ 1
		System.out.print("Introduzca una secuencia de números acabada en 0: ");		//SOLICITA DATO
		int n;		//INICIALIZA N -SECUENCIA-
		int sumapos=0;		//INICIALIZA SUMATORIO POSITIVOS
		int sumaneg=0;		//INICIALIZA SUMATORIO NEGATIVOS
		do  {		
			n = teclado.nextInt();		//SIGUIENTE VALOR
			if (n>0) {		//SI ES POSITIVO
				sumapos=sumapos+n;		//SUMAR
			}		
			if (n<0) {		//SI ES NEGATIVO
				sumaneg=sumaneg+n;		//SUMAR
			}
			//LOS IGUALES A 0 NO SE CUENTAN
		} while (n!=0);		//HASTA QUE N SEA 0

		System.out.printf("La suma de positivos es %d, y la de negativos %d.\n",sumapos,sumaneg);		//OUTPUT

		if(sumapos>Math.abs(sumaneg)) {				//SI LOS POSITIVOS SUMAN MAS QUE LOS NEGATIVOS EN VALOR ABSOLUTO
			System.out.print("La suma de positovs es mayor que la suma de negativos.\n");				//OUTPUT
		} else {
			if(sumapos<Math.abs(sumaneg)) {			//SI LOS NEGATIVOS SUMAN MÁS QUE LOS POSITIVOS EN VALOR ABSOLUTO
				System.out.print("La suma de negativos es mayor que la suma de positivos.\n");			//OUTPUT
			} else {								//SI NO -AMBOS SON IGUALES-
				System.out.print("La suma de positivos es igual a la de negativos.\n");					//OUTPUT
			}
		}

		//EJ 2
		System.out.println("En un intervalo del tipo [a,b]...");		//GUÍA USUARIO
		System.out.print("Defina a: ");			//SOLICITA A
		int a = teclado.nextInt();		//ALMACENA A
		int A = a;		//MANTIENE VALOR A EN A -PARA OUTPUT-
		System.out.print("Defina b: ");			//SOLICITA B
		int b = teclado.nextInt();		//ALMACENA B

		do {
			a++;		//ACTUALIZAR A
		} while (a<b && a%13!=0);		//HASTA QUE SEA MAYOR QUE B O ENCUENTRE UN MÚLTIPLO DE 13

		if (a%13==0) {		//SI ES MÚLTIPLO DE 13 -NO SE LLEGÓ AL FINAL DE SECUENCIA-
			System.out.printf("En el intervalo [%d,%d] hay al menos un múltiplo de 13, el %d.",A,b,a);		//OUTPUT
		} else {		//SI NO -SE LLEGÓ AL FINAL DE SECUENCIA-
			System.out.printf("El el intervalo [%d,%d] no hay ningún múltiplo de 13.",A,b);			//OUTPUT
		}

	}

}
