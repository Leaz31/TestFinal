package main;

public class Ville {
	 

	  public static int nbreInstances = 0;
	  protected static int nbreInstancesBis = 0;
	  protected String nomVille;
	  protected String nomPays;
	  protected int nbreHabitants;
	  protected String categorie;
	  
	   
	  public Ville(){
	    System.out.println("Création d'une ville !");          
	    nomVille = "Inconnu";
	    nomPays = "Inconnu";
	    nbreHabitants = 0;
	    this.setCategorie();
	  }
	 
	  public Ville(String pNom, int pNbre, String pPays)
	  throws NombreHabitantException {
		  if (pNbre < 0)
			  throw new NombreHabitantException(pNbre);
		  else
		  {
		    nomVille = pNom;
		    nomPays = pPays;
		    nbreHabitants = pNbre;
		    this.setCategorie();
		  } 
	  }
	  
	  public String toString(){
		    return "\t"+this.nomVille+" est une ville de "+this.nomPays+ ", elle comporte : " +this.nbreHabitants+ " habitant(s) => elle est donc de catégorie : "+this.categorie;
		  }
	    
	  //Retourne le nom de la ville
	  public String getNom()  {  
	    return nomVille;
	  }

	  //Retourne le nom du pays
	  public String getNomPays()
	  {
	    return nomPays;
	  }

	  // Retourne le nombre d'habitants
	  public int getNombreHabitants()
	  {
	    return nbreHabitants;
	  } 

	  //Retourne la catégorie de la ville
	  public String getCategorie()
	  {
	    return categorie;
	  } 
	 
	  //Définit le nom de la ville
	  public void setNom(String pNom)
	  {
	    nomVille = pNom;
	  }

	  //Définit le nom du pays
	  public void setNomPays(String pPays)
	  {
	    nomPays = pPays;
	  }

	  //Définit le nombre d'habitants
	  public void setNombreHabitants(int nbre)
	  {
	    nbreHabitants = nbre;
	    this.setCategorie();
	  }  
	 
	  //Définit la catégorie de la ville
	  private void setCategorie() {
	 
	    int bornesSuperieures[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
	    String categories[] = {"?", "Village", "Petite ville", "Moyenne ville", "Grande ville", "Agglomération", "Grande agglomération","Métropole", "Grande métropole"};

	    int i = 0;
	    while (i < bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i])
	      i++;

	    this.categorie = categories[i];
	  }

	  //Retourne la description de la ville
	  public String decrisToi(){
	    return "\t"+this.nomVille+" est une ville de "+this.nomPays+ ", elle comporte : " +this.nbreHabitants+ " habitant(s) => elle est donc de catégorie : "+this.categorie;
	  }

	  //Retourne une chaîne de caractères selon le résultat de la comparaison
	  public String comparer(Ville v1){
	    String str = new String();

	    if (v1.getNombreHabitants() > this.nbreHabitants)
	      str = v1.getNom()+" est une ville plus peuplée que "+this.nomVille;
	     
	    else
	      str = this.nomVille+" est une ville plus peuplée que "+v1.getNom();
	     
	    return str;
	  }
	  
	  public static void makeATown() throws NombreHabitantException {
		  Ville v = new Ville();
			Ville v1 = new Ville("Marseille", 123456, "France");       
			Ville v2 = new Ville("Rio", 321654, "Brésil");

			System.out.println("\n v = "+v.getNom()+" ville de  "+v.getNombreHabitants()+ " habitants se situant en "+v.getNomPays());
			System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNombreHabitants()+ " habitants se situant en "+v1.getNomPays());
			System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");
			        
			/*
			  Nous allons interchanger les Villes v1 et v2
			  tout ça par l'intermédiaire d'un autre objet Ville.        
			*/       
			Ville temp = new Ville();
			temp = v1;
			v1 = v2;
			v2 = temp;
			       
			System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNombreHabitants()+ " habitants se situant en "+v1.getNomPays());
			System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");

			/*       
			  Nous allons maintenant interchanger leurs noms
			  cette fois par le biais de leurs mutateurs.
			*/   
			v1.setNom("Hong Kong");
			v2.setNom("Djibouti");
			      
			System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNombreHabitants()+ " habitants se situant en "+v1.getNomPays());
			System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");
			
			System.out.println(v1.comparer(v2));
			
	  }
	  
	  public static void showCityAndCapital() throws NombreHabitantException {
		Capitale cap = new Capitale();
		System.out.println(cap.decrisToi());
		
		//Définition d'un tableau de villes null
		Ville[] tableau = new Ville[6];
		        
		//Définition d'un tableau de noms de Villes et un autre de nombres d'habitants
		String[] tab = {"Marseille", "Lille", "Caen", "Lyon", "Paris", "Nantes"};
		int[] tab2 = {123456, 78456, 654987, 75832165, 1594, 213};
		         
		//Les trois premiers éléments du tableau seront des Villes
		//et le reste des capitales
		for(int i = 0; i < 6; i++){
		  if (i <3){
		    Ville V = new Ville(tab[i], tab2[i], "france");
		    tableau[i] = V;
		  }
		         
		  else{
		    Capitale C = new Capitale(tab[i], tab2[i], "france", "la tour Eiffel");
		    tableau[i] = C;
		  }
		}
		                 
		//Il ne nous reste plus qu'à décrire tout notre tableau !
		for(Object obj : tableau){
		  System.out.println(obj.toString()+"\n");
		}
	  }
}