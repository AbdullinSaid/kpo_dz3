import java.util.*;

public class Game {

    public String name, annotation, characteristics;
    public List<String> achieves = null;

    public Game(String name, String annotation, String characteristics, List<String> achieves) {
        this.name = name;
        this.characteristics = characteristics;
        this.annotation = annotation;
        this.achieves = new ArrayList<String>(achieves);
    }
}
