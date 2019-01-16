package ejerciciosexamen;
/**
 * 2. Se introducen tres notas de un alumno, si el promedio es mayor o igual a siete mostrar un mensaje "Promocionado". 

 */

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);  	// para recibir los datos puestos
		System.out.println("introduce notas");	// introducir texto consola
		
		String snota1=sc.nextLine();		// recibimos la varible sc y la metemos en la variable snota1
		int nota1= Integer.parseInt(snota1);	// string snota1 lo transformamos en entero y lo metomos en nota1
		
		String snota2=sc.nextLine();	// 
		int nota2=Integer.parseInt(snota2);
		
		String snota3=sc.nextLine();
		int nota3=Integer.parseInt(snota3);
		
		int promedio=(nota1 + nota2 + nota3)/3;	//sumamos las notas y las dividimos entre tres 
		
		if (promedio>= 7) {	//si promedio es mayor o igual a 7 
			System.out.println("Promocionado");	//introducir en consola promocionado
			
			
		}
		
		sc.close();	// cerramos el scanner
		
		
		
		

	}

}
