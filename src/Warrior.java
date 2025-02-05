public class Warrior extends GameCharacter {

    public Warrior(String name) {
        super(name);
    }

    public Warrior(String name, int level, double health) {
        super(name, level, health);
    }

    @Override
    public void attack() {
        System.out.println(super.getName() + " Attacking with sword!");
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Level: %d, Health: %.1f", getName(), getLevel(), getHealth());
    }
}