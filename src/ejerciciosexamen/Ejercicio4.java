package ejerciciosexamen;
/**
 * 4. Se cargan por teclado tres n�meros distintos. Mostrar por pantalla el mayor de ellos. 

 */


import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("introduce tres n�meros");
		
		String snum=sc.nextLine();
		int num=Integer.parseInt(snum);
		
		snum=sc.nextLine();
		int num2=Integer.parseInt(snum);
		
		snum=sc.nextLine();
		int num3=Integer.parseInt(snum);
		
		if (num>num2 && num>num3 ) {
			System.out.println(num+" es el mayor");			
		} else if(num2>num && num2>num3) {
			System.out.println(num2+" es el mayor");
		} else {
			System.out.println(num3+" es el mayor");
		}
		
		sc.close();
		
		
		
		
		
		
		
	}

}
