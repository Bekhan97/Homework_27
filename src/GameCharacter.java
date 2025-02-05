import java.util.Random;

public abstract class GameCharacter {
    private String name;
    private int level; // 0 - 5
    private double health; //100

    public GameCharacter(String name) {
        this.name = name;
        this.level = 0;
        this.health = 100;
    }

    public GameCharacter(String name, int level, double health) {
        this.name = name;
        if (level < 0 || level > 5) {
            throw new IllegalArgumentException("Level must be 0-5");
        }
        this.level = level;
        if (health < 0 || health > 100) {
            throw new IllegalArgumentException("Health must be 0-100%");
        }
        this.health = health;
    }

    public void damage(int damage) {
        setHealth(getHealth() - damage);
    }

    public void levelUp() {
        setLevel(getLevel() + 1);
    }

    public abstract void attack();
    public void attack(GameCharacter gameCharacter) {
        Random random = new Random();
        int damageLevel = this.level * 10;
            gameCharacter.damage(random.nextInt(1, damageLevel));
    }


    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public double getHealth() {
        return health;
    }

    public void setLevel(int level) {
        if (level < 0 || level > 5) {
            throw new IllegalArgumentException();
        }
        this.level = level;
    }

    public void setHealth(double health) {
        if (health < 0 || health > 100) {
            throw new IllegalArgumentException();
        }
        this.health = health;
    }

    @Override
    public String toString() {
        return String.format("Character: name: %s, level: %d, health: %d%% %n", name, level, health);
    }
}
