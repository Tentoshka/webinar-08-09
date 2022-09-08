import mashine.Auto;
import mashine.Wheel;
import orcestr.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Wheel wheel = new Wheel("Кирзачи");
        Auto auto = new Auto("Tesla", "Red", wheel);

        auto.turnRight();

        wheel.setName("Андрей");

        auto.turnRight();
    }

}
