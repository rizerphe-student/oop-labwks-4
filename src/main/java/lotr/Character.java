package lotr;

import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class Character {
    @Setter
    private int power;
    private int hp;

    public Character(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }

    public void kick(Character c) {
        c.hp -= this.power;
    }

    public void decreaseHp(int amount) {
        hp -= amount;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void setHp(int hp) {
        this.hp = hp > 0 ? hp : 0;
    }

    public String toString() {
        return String.format("%s{hp=%d, power=%d}", this.getClass().getSimpleName(), hp, power);
    };
}
