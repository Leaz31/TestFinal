package main.jdr.classes;

import main.jdr.Deplacement;
import main.jdr.EspritCombatif;
import main.jdr.Personnage;
import main.jdr.Soin;
import main.jdr.comportements.CombatPistolet;

public class Guerrier extends Personnage {	
  public Guerrier(){
    this.espritCombatif = new CombatPistolet();
  }
  public Guerrier(EspritCombatif esprit, Soin soin, Deplacement dep) {
    super(esprit, soin, dep);
  }
  
}