package ejerciciosexamen;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("ingresar coordenadas x ");
		String num=sc.nextLine();		
		int x = Integer.parseInt(num);
		System.out.println("ingresar coordenadas y");
		num=sc.nextLine();		
		int y = Integer.parseInt(num);
		
		if (x> 0 && y > 0) {
			System.out.println("primer cuadrante");
		}else if ( x < 0 && y > 0) {
			System.out.println("segundo cuadrante");
		} else if ( x < 0 && y < 0) {
			System.out.println("tercer cuadrante");
		} else {
			System.out.println("cuarto cuadrante");
		}
			
			
		sc.close();
		

	}

}
