import java.util.Random;

abstract class Noble extends Character {
    public Noble(int hp, int power) {
        super(hp, power);
    }

    public void kick(Character c) {
        c.hp -= new Random().nextInt(this.power);
    }
}
