package main.jdr.classes;

import main.jdr.Deplacement;
import main.jdr.EspritCombatif;
import main.jdr.Personnage;
import main.jdr.Soin;

public class Civil extends Personnage{
  public Civil() {}

  public Civil(EspritCombatif esprit, Soin soin, Deplacement dep) {
    super(esprit, soin, dep);
  }	
  
  public String setName() {
	  return "Civil";
  }
}