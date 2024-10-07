package edu.cnm.deepdive;

public class Coyote extends Canis {

  static {
    System.out.println("Initializing Coyote class");
  }

  {
    System.out.println("Performing common initialization of Coyote.");
  }

  public Coyote() {
    System.out.println("When the constructor completes, the coyote is ready to rumble.");
  }

  @Override
  public void hunt() {
    System.out.println("Coyotes are solo or opportunistic pack hunters and scavengers.");
  }

  @Override
  public void vocalize() {
    System.out.println("Coyotes howl for different purposes, but it is a less pervasive communication.");
  }

  public static void describe() {
    System.out.println("Coyotes are canines native to North America, smaller than wolves.");
  }

  {
    System.out.println("We shouldn't initialize the Coyote here, but sometimes we do.");
  }

}
