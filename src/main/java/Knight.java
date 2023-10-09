import java.util.Random;

public class Knight extends Noble {
    public Knight() {
        super(new Random().nextInt(2, 12), new Random().nextInt(2, 12));
    }
}
