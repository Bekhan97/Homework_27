public class Warrior extends GameCharacter{

    public Warrior(String name) {
        super(name);
    }

    public Warrior(String name, int level, double health) {
        super(name, level, health);
    }

    @Override
    public void attack() {
        System.out.println("Attacking with sword!");
    }
}