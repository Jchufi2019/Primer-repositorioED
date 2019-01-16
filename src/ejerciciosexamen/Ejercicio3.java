package ejerciciosexamen;
/**
 * 3. Se introducen por teclado un número positivo de uno o dos dígitos (1..99) mostrar un mensaje indicando si el número tiene uno o dos dígitos. (Tener en cuenta que condición debe cumplirse para tener dos dígitos, un número entero) 

 */

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("introduce un número positivo");
		
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
