public class Mage extends GameCharacter {
    public Mage(String name) {
        super(name);
    }

    public Mage(String name, int level, double health) {
        super(name, level, health);
    }

    @Override
    public void attack() {
        System.out.println(super.getName() + " attacking with Magical banana!");
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Level: %d, Health: %.1f", getName(), getLevel(), getHealth());
    }
}