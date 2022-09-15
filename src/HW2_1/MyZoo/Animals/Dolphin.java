package HW2_1.MyZoo.Animals;

import HW2_1.MyZoo.Swimable;
import HW2_1.MyZoo.Swimming;

public class Dolphin extends Swimming implements Swimable {
    @Override
    public void swim() {
        System.out.println("Дельфин плывет");
    }
}
