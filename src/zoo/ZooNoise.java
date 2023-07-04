package zoo;

import java.util.List;

public class ZooNoise {
    private List<Soundable> soundables;

    public ZooNoise(List<Soundable> soundables) {
        this.soundables = soundables;
    }

    public void soundAll() {
        for (Soundable soundable : soundables) {
            soundable.makeSound();
        }
    }
}
