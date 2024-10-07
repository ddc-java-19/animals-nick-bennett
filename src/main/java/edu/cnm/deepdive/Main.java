package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Canis> shelter = new ArrayList<>();
//    shelter.add(new Wolf());
//    shelter.add(new Wolf());
//    shelter.add(new Coyote());
//    shelter.add(new Coyote());
    shelter.add(new Dog());
    shelter.add(new Dog());
    Collections.shuffle(shelter);
    for (Canis c : shelter) {
      c.vocalize();
      c.hunt();
      if (c instanceof Dog dog) {
        dog.perform();
      }
//      Canis.describe();
    }
  }

}
