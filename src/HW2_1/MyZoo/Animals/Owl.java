package HW2_1.MyZoo.Animals;

import HW2_1.MyZoo.Flying;
import HW2_1.MyZoo.Flyable;

public class Owl extends Flying implements Flyable {
    @Override
    public void fly() {
        System.out.println("Сова летит");
    }
}
