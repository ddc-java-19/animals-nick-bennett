package edu.cnm.deepdive;

public class Dog extends Wolf implements Trainable {

  static {
    System.out.println("Initializing Dog class");
  }

  public Dog() {
    super(0);
    System.out.println("When the constructor completes, the dog is reaady.");
  }

  @Override
  public void hunt() {
    System.out.println("Dogs hunt in a large variety of specialized ways, according to breed.");
  }

  @Override
  public void vocalize() {
    System.out.println("Dogs bark, whine, howl -- whatever annoying noise they can.");
  }

  @Override
  public void perform() {
    System.out.println("Look at this trick! I'm the best dog!");
  }

}
