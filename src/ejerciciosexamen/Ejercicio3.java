package ejerciciosexamen;
/**
 * 3. Se introducen por teclado un n�mero positivo de uno o dos d�gitos (1..99) mostrar un mensaje indicando si el n�mero tiene uno o dos d�gitos. (Tener en cuenta que condici�n debe cumplirse para tener dos d�gitos, un n�mero entero) 

 */

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("introduce un n�mero positivo");
		
		String posi=sc.nextLine();
		int num=Integer.parseInt(posi);
		
		if (num>=10) {
			System.out.println("El numero tiene dos digitos");
			
		} else {
			System.out.println("tiene un digito");
			
		}
	sc.close();
	}

}
