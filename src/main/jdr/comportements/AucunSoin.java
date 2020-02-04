package main.jdr.comportements;

import main.jdr.Soin;

public class AucunSoin implements Soin {
  public void soigner() {
    System.out.println("Je ne donne AUCUN soin !");
  }
}