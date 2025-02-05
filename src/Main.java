public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Arthur");
        warrior.damage(22);
        System.out.println(warrior);

        GameCharacter[] gameCharacters = new GameCharacter[]{
                new Warrior("Levi"),
                new Archer("Erwin"),
                new Mage("Gandalf")
        };

        print(gameCharacters);

        gameCharacters[2].setLevel(5);

        gameCharacters[2].damage(22);
        gameCharacters[1].levelUp();
        print(gameCharacters);

        attack(gameCharacters);
        gameCharacters[2].attack(gameCharacters[0]);
        print(gameCharacters);
    }

    private static void attack(GameCharacter[] gameCharacters) {
        System.out.println("--------------Attack---------------");
        for (GameCharacter gameCharacter : gameCharacters) {
            gameCharacter.attack();
        }
    }

    private static void print(GameCharacter[] gameCharacters) {
        System.out.println("--------------print ---------------");
        for (GameCharacter gameCharacter : gameCharacters) {
            System.out.println(gameCharacter);
        }
    }
}