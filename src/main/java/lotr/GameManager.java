package lotr;

public class GameManager {
    public void fight(Character c1, Character c2) {
        if (c1 instanceof Hobbit && c2 instanceof Hobbit) {
            System.out.println("The tea is being prepared!");
            return;
        }
        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            c2.kick(c1);
        }
    }
}
