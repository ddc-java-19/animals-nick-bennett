package edu.cnm.deepdive;

public abstract class Canis {

  private int numLegs;

  {
    initialize();
  }

  public Canis() {
    System.out.println("When the constructor completes, the instance is ready for use.");
  }

  public abstract void hunt();

  public abstract void vocalize();

  public static void describe() {
    System.out.println("Canis is a genus of carnivorous animals of moderate size with well-developed dentition, long legs, and short ears and tails");
  }

  private void initialize() {
    System.out.println("Initializing number of legs");
    numLegs = 4;
  }

  {
    System.out.println("More initialization...");
  }

}
