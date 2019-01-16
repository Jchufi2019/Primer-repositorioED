package ejerciciosexamen;
/**
 * 13. Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores. 

 */

import java.util.Scanner;

public class ejercicio13While {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);	// Para recibir los datos puestos
		System.out.println("ingrese 10 notas ");	//Mostrar en pantalla
		int i = 0;	// variable que va recorrer el while
		int res = 0;	// variable que calculará los mayores
		int x[] = new int [10];	// variable que va recibir las 10 notas(arraid entero donde metomos las notas)
		while (i < 10) {	//buble que va de 1 a 10
			String num=sc.nextLine();			
			x[i] = Integer.parseInt(num); 
			
			if (x[i] >=7) {	// va compravando el valor de x en la posicion y si resulta se ca incrementado la variable de mayores	
				res++;
			}
			i++;	// va incrementando i para el bucle
			
		}
		int men= 10-res;	// varible que me indica cuales son menos que 7
		System.out.println(res+" tienen notas mayores y "+ men+" menores");
		sc.close();
	}

}
