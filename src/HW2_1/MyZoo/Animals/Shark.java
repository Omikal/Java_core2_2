package HW2_1.MyZoo.Animals;

import HW2_1.MyZoo.Swimable;
import HW2_1.MyZoo.Swimming;

public class Shark extends Swimming implements Swimable {
     @Override
     public void swim() {
         System.out.println("Акула плывет");
     }
}

