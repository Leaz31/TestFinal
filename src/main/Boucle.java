package main;

import java.util.Scanner;

public class Boucle {
	
	//Une boucle avec While en premier, qui ne s'éxecutera que si la condition est remplie
	public static void Boucle1() {
	
	String prenom;
	char reponse = 'O';
	Scanner sc = new Scanner(System.in);
	
	while (reponse == 'O')
	{
	  System.out.println("Donnez un prénom : ");
	  prenom = sc.nextLine();
	  System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");            

	  reponse = ' ';
	  
	  while(reponse != 'O' && reponse != 'N')
	  {

	    System.out.println("Voulez-vous réessayer ? (O/N)");
	    reponse = sc.nextLine().charAt(0);
	  }
	}
	System.out.println("Au revoir…");
	
	}
	
	public static void Boucle2() {
	String prenom = new String();
	//Pas besoin d'initialiser : on entre au moins une fois dans la boucle !
	char reponse = ' ';
	 
	Scanner sc = new Scanner(System.in);
	 
	do{
	  System.out.println("Donnez un prénom : ");
	  prenom = sc.nextLine();
	  System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");
	       
	  do{
	    System.out.println("Voulez-vous réessayer ? (O/N)");
	    reponse = sc.nextLine().charAt(0);
	  }while(reponse != 'O' && reponse != 'N');
	        
	}while (reponse == 'O');
	 
	System.out.println("Au revoir…");
	
	}
	
	public static void BoucleFor1() {
		
		for(int i = 10; i >= 0; i--) {
			  System.out.println("Il reste "+i+" ligne(s) à écrire");
		}
	}
	
	public static void BoucleFor2() {
	
		for(int i = 0, j = 2; (i < 10 && j < 6); i++, j+=2){
			  System.out.println("i = " + i + ", j = " + j);
			}
		//Est censé faire deux tours, puisque j s'incrémente de 2 a chaque tour, il commence donc a 2, puis a 4 et ensuite comme il fait 6, la boucle stop car J < 6
	}

}
