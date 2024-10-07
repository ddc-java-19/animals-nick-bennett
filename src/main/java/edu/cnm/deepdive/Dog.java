package edu.cnm.deepdive;

public class Dog extends Wolf implements Trainable {

  @Override
  public void hunt() {
    System.out.println("Dogs hunt in a large variety of specialized ways, according to breed.");
  }

  @Override
  public void vocalize() {
    System.out.println("Dogs bar, whine, howl -- whatever annoying noise they can.");
  }

  @Override
  public void perform() {
    System.out.println("Look at this trick! I'm the best dog!");
  }

}
