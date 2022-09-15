package HW2_1.MyZoo.Animals;

import HW2_1.MyZoo.Flying;
import HW2_1.MyZoo.Flyable;

public class Pigeon extends Flying implements Flyable {
    @Override
    public void fly() {
        System.out.println("Голубь летит");
    }
}
