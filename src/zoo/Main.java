package zoo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Soundable> soundables = new ArrayList<>();
        soundables.add(new Cat());
        soundables.add(new Dog());
        soundables.add(new Radio());

        ZooNoise zooNoise = new ZooNoise(soundables);

        zooNoise.soundAll();
    }
}
