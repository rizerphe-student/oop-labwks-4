public class Hobbit extends Character {
    public Hobbit() {
        super(3, 0);
    }

    public void kick(Character c) {
        toCry();
    }

    private void toCry() {
        System.out.println("Hobbit is crying");
    }
}
