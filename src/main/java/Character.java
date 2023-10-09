import lombok.Getter;

@Getter
public abstract class Character {
    int power;
    int hp;

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

    public int getHp() {
        return hp;
    }
}
