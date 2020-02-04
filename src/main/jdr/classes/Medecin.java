package main.jdr.classes;

import main.jdr.Deplacement;
import main.jdr.EspritCombatif;
import main.jdr.Personnage;
import main.jdr.Soin;
import main.jdr.comportements.PremierSoin;

public class Medecin extends Personnage{
  public Medecin() {
    this.soin = new PremierSoin();
  }
  public Medecin(EspritCombatif esprit, Soin soin, Deplacement dep) {
    super(esprit, soin, dep);
  }	
  
  public String setName() {
	  return "Medecin";
  }
}