package edu.cnm.deepdive;

public class Wolf extends Canis {

  static {
    System.out.println("Initializing Wolf class");
  }

  {
    System.out.println("Performing common initialization of Wolf");
  }

  public Wolf(int x) {
    System.out.println("When the wolf constructor completes, the wolf is ready.");
  }

  @Override
  public void hunt() {
    System.out.println("Wolves hunt in long-lasting packs for live prey.");
  }

  @Override
  public void vocalize() {
    System.out.println("Communicate by howling for a variety of purposes");
  }

  public static void describe() {
    System.out.println("Wolf is a large canine native to Eurasia and North America.");
  }

  {
    System.out.println("We shouldn't have an initializion block here, but for Wolf, we do.");
  }

}
