package HW2_1.MyZoo.Animals;

import HW2_1.MyZoo.Biteable;
import HW2_1.MyZoo.Biting;

public class Tiger extends Biting implements Biteable {
    @Override
    public void bite() {
        System.out.println("Тигр кусает");
    }
}
