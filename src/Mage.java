public class Mage extends GameCharacter {
    public Mage(String name) {
        super(name);
    }

    public Mage(String name, int level, double health) {
        super(name, level, health);
    }

    @Override
    public void attack() {
        System.out.println("Magical banana!");
    }
}