public class Archer extends GameCharacter {

    public Archer(String name) {
        super(name);
    }

    public Archer(String name, int level, double health) {
        super(name, level, health);
    }

    @Override
    public void attack() {
        System.out.println(super.getName() + " Attacking with arrows!");
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Level: %d, Health: %.1f",getName(),getLevel(),getHealth());
    }
}
