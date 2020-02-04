package main;

import java.util.Scanner;

public class Scan1 {	
	
	public static void ScanMethodString() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un mot : ");
		String str = sc.nextLine();
		System.out.println("Vous avez saisi : " + str);
	}
	
	public static void ScanMethodInteger() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre :");
		int str = sc.nextInt();
		System.out.println("Vous avez saisi le nombre : " + str);
		
	}
	
	public static void ScanMethodUnique() {
		System.out.println("Saisissez une lettre :");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char carac = str.charAt(0);
		System.out.println("Vous avez saisi le caractère : " + carac);
	}

}
