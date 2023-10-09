package lotr;

public class Hobbit extends Character {

    public Hobbit() {
        super(3, 0, new CryKick());
    }

    @Override
    public void kick(Character opponent) {
        System.out.println("Crying...");
    }
    
}
