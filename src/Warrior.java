public class Warrior extends GameCharacter{

    public Warrior(String name, int level, double health) {
        super(name, level, health);
    }

    public void levelUp() {
            setLevel(getLevel() + 1);
    }
}
