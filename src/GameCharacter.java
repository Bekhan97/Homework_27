public abstract class GameCharacter {
    private String name;
    private int level = 0; // 0 - 5
    private int health = 100;

    public GameCharacter(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
    }

    @Override
    public String toString() {
        return String.format("Character: name: %s, level: %d, health: %d%% %n", name, level, health);
    }
}
