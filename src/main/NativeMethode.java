package main;

import java.util.Scanner;

public class NativeMethode {
	
	public static void toLowerCase() {
	String chaine = new String("\n COUCOU TOUT LE MONDE !"), chaine2 = new String();
	chaine2 = chaine.toLowerCase();   //Donne "coucou tout le monde !"
	System.out.println(chaine);
	System.out.println("\n" + "Holà on se calme ! En minuscule maintenant.. \n");
	System.out.println(chaine2);
	}
	
	public static void toUpperCase() {
	String chaine = new String("coucou coucou"), chaine2 = new String();
	chaine2 = chaine.toUpperCase();   //Donne "COUCOU COUCOU"
	System.out.println(chaine);
	System.out.println("\n" + "Hein ? Je n'entends rien ! \n");
	System.out.println(chaine2);
	}
	
	public static void lengthCalculator() {
	String chaine = new String("coucou ! "); 
	int longueur = 0;
	longueur = chaine.length();   //calcule la longueur de "chaine" et donc, renvoie 9 car "coucou" à 9 caractères
	System.out.println(longueur);
	}
	
	public static void identicalString() {
		String str1 = new String("coucou"), str2 = new String("coucou"); //coucou et coucou
		 
		if (str1.equals(str2))
		  System.out.println("Les deux chaînes sont identiques !");
		 
		else
		  System.out.println("Les deux chaînes sont différentes !");
	}
	
	public static void differentString () {
		String str1 = new String("coucou"), str2 = new String("toutou"); //coucou et toutou
		 
		if (!str1.equals(str2))  // seule la présence du "!" différence cette méthode de la précédente, il marque l'inégalité. 
		  System.out.println("Les deux chaînes sont différentes !");
		 
		else
		  System.out.println("Les deux chaînes sont identiques !");
	}
	
	public static void characterSelector() {
		String nbre = new String("1234567");
		char carac = nbre.charAt(4);   //Renverra ici le caractère 5
		System.out.println(carac);
	}
	
	public static void partSelector() {
		String chaine = new String("la paix niche"), chaine2 = new String();
		chaine2 = chaine.substring(3,13);   //Permet d'extraire "paix niche"
		System.out.println(chaine2);
	}

	public static void indexOf() { //permet de calculer a quel emplacement est le premier charactère spécifié

		String mot = " ", a = " ", b = " " ; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un mot : ");
		mot = sc.nextLine(); //je stock le résultat de la saisie dans "mot"
		
		//sc.nextLine(); // je vide la méthode nextLine pour pouvoir l'utiliser à nouveau
		
		int n = 0;
		int m = 0;
		System.out.println("Veuillez saisir le premier charactère recherché : ");
		a = sc.nextLine();
		 
		n = mot.indexOf(a);           //n vaut 3
		
		System.out.println("veuillez saisir le second charactère recherché : ");
		b = sc.nextLine();
		
		m = mot.indexOf(b);		//m vaut 3
		System.out.println("le premier charactère demandé est à l\'emplacement n°" + (n+1) + "\nle second charactère demandé est à l'emplacement n°" + (m + 1));
	}
	
	public static void lastIndexOf() {
		String mot = new String("anticonstitutionnellement");
		int n = 0, m=0;
		 
		n = mot.lastIndexOf('t');       //n vaut 24
		m = mot.lastIndexOf("ti");      //n vaut 12
		System.out.println(n + " " + m);
	}

	public static void incomprehensibleMath() {
		
		double X = 0.0;
		X = Math.random();
		//Retourne un nombre aléatoire 
		//compris entre 0 et 1, comme 0.0001385746329371058

		double sin = Math.sin(X);     //La fonction sinus
		double cos = Math.cos(X);     //La fonction cosinus
		double tan = Math.tan(X);     //La fonction tangente
		double abs = Math.abs(-X); //La fonction valeur absolue (retourne le nombre sans le signe)
		double d = 2;
		double exp = Math.pow(d, X);    //La fonction exposant
	//Ici, on initialise la variable exp avec la valeur de d élevée au carré
	//La méthode pow() prend donc une valeur en premier paramètre, et un exposant en second
		
		
		System.out.println(sin);
		System.out.println(cos);
		System.out.println(tan);
		System.out.println(abs);
		System.out.println(exp);

		
		
	}
}
