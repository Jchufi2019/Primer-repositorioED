package ejerciciosexamen;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("muestre n�mero positivo");
		
		String nump=sc.nextLine();		
		int snum = Integer.parseInt(nump);
		
		if (snum>999) {
			System.err.println("n�mero es mayor que tres cifrazas");
	
		}else if(snum<10) {
			System.out.println("tiene m�s una cifra");
		}else if(snum<99 ) {
			System.out.println("tienen m�s de dos cifras");
			
		}	else {
			System.out.println("tiene m�s de tres cifras");
			sc.close();
		}
	
		
		
		
		

	}

}
