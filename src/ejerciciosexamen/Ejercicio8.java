package ejerciciosexamen;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("ingresa por teclado 3 números");
		String num1=sc.nextLine();		
		int snum = Integer.parseInt(num1);
		num1=sc.nextLine();
		int num2 = Integer.parseInt(num1);
		num1=sc.nextLine();
		int num3 = Integer.parseInt(num1);
		
		if (snum<10 && num2<10 && num3<10) {
			System.out.println("todos son menores que 10");
		}
		sc.close();
	}

}
