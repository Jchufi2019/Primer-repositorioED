package ejerciciosexamen;
/**
 * Realizar un programa que lea por teclado dos n�meros, si el primero es mayor al segundo informar su suma y diferencia, en caso contrario informar el producto y la divisi�n del primero respecto al segundo. 
 */

import java.util.Scanner;

public class Ejercio1 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in); // Escaner para coger el primer numero 
		
		System.out.println("Introduce un n�mero "); // escribir la frase introducir un n�mero
		String snum = sc1.nextLine();   // recibimos el escaner en la variable snum de tipo string
		
		int num1 = Integer.parseInt(snum);    // string snum lo pasamos a un entero en num1
		
		System.out.println("Introduce un n�mero ");   // escribe la frase introduce un n�mero
		String snum2 = sc1.nextLine();	// recibimos la variable escaner en snum2
		
		int num2 = Integer.parseInt(snum2);		// string smun2 lo pasamos a un entero en num2
		
		if(num1 > num2) { 	// si num1 es mayor que num2
			int suma = num1 + num2;		// suma los n�meros
			int resta = num1 - num2;	// resta los n�meros
			
			System.out.println("La suma es igual "+suma+" y la resta es "+ resta ); 	// muestra en pantalla los resultados
		} else {		// sino 
			int multi = num1* num2;		//Los multiplica
			int divi = num2 / num1;		//los divide
			System.out.println("La multiplicaci�n es igual "+multi+ " y la divisi�n "+ divi);	//muestra los resultados en pantalla
		}
		
		sc1.close();		//cierra el scanner
	}

}
