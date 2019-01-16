package ejerciciosexamen;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingresa tres valores por teclado");
		
		String num1=sc.nextLine();		
		int snum = Integer.parseInt(num1);
		num1=sc.nextLine();
		int num2 = Integer.parseInt(num1);
		num1=sc.nextLine();
		int num3 = Integer.parseInt(num1);
		
		if (snum==num2 && num2==num3) {
			int res = (snum +num2) * num3;
			System.out.println(res);
		}
	}

}
