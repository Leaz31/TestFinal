package main;

public class Check1 {
	
	
	public static void Verif1() {
	int i = 0;
	
		if (i<100)
			{
			System.out.println("Ce nombre est négatif ! ");
			}
		else
			{
			if(i == 0)
			System.out.println("Ce nombre est nul !");
		
			else
			System.out.println("Ce nombre est positif !");
			}	
		}
	
	public static void Verif2() {
		
		int i = 58;
		if(i < 100 && i > 50) 
		  System.out.println("Le nombre est bien dans l'intervalle.");
		else
		  System.out.println("Le nombre n'est pas dans l'intervalle.");
		
	}
}
