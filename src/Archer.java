public class Archer extends GameCharacter {

    public Archer(String name) {
        super(name);
    }

    public Archer(String name, int level, double health) {
        super(name, level, health);
    }

    @Override
    public void attack() {
        System.out.println("Attacking with arrows!");
    }
}
