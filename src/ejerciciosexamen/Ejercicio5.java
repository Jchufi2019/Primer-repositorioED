package ejerciciosexamen;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("nombre del personaje.");
		
		
		
		String nentero=sc.nextLine();		
		String palabra = null;
		int pal = Integer.parseInt(palabra);
		
		
		if (pal>100) {
			System.out.println("luke");
			
		} else if(pal<0) {
			System.out.println("tu padre");
		}else if(pal<0) {
			System.out.println("Principe");
		} else {
			System.out.println("c3po");
		}
		sc.close();
		
		
		
		Scanner sc1= new Scanner(System.in);
		System.out.println("segunda el parentesco.");
		String nentero1=sc1.nextLine();		
		int pal1 = Integer.parseInt(nentero1);
		
		if (pal1>0) {
			System.out.println("yo soy tu padre");
			
		} else if(pal1<0) {
			System.out.println("es beider");
		} else if(pal1<0) {
			System.out.println("se llama leia");
			
		} else {
			System.out.println("su creador es luke");
		}
		
		
	}

}
