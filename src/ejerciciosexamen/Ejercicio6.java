package ejerciciosexamen;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("muestre número positivo");
		
		String nump=sc.nextLine();		
		int snum = Integer.parseInt(nump);
		
		if (snum>999) {
			System.err.println("número es mayor que tres cifrazas");
	
		}else if(snum<10) {
			System.out.println("tiene más una cifra");
		}else if(snum<99 ) {
			System.out.println("tienen más de dos cifras");
			
		}	else {
			System.out.println("tiene más de tres cifras");
			sc.close();
		}
	
		
		
		
		

	}

}
