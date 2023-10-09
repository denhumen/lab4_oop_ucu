package lotr;

public class Main {
    public static void main(String[] args) {

        GameManager gm = new GameManager();

        Character c1 = CharacterFactory.crateCharacter();
        Character c2 = CharacterFactory.crateCharacter();

        gm.fight(c1, c2);
    }
}