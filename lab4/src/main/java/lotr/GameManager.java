package lotr;

public class GameManager {

    public GameManager(){

    }

    public void fight(Character c1, Character c2){
        System.out.println("Fight is started!");
        int counter = 0;
        while (c1.getHp() >= 0 && c2.getHp() >= 0){
            
            if (counter == 50){
                System.out.println("Characters are tired, the fight is ended!");
                return;
            }
            
            System.out.println("Fisrt character: " + c1.toString() + "; " + "Second character: " + c2.toString());
            
            if (c1.getHp() == 0){
                System.out.println("Character " + c1.toString() + " " + "died...");
                break;
            }

            if (c2.getHp() == 0){
                System.out.println("Character " + c2.toString() + " " + "died...");
                break;
            }

            c1.kick(c2);
            c2.kick(c1);
            counter += 1;
        }

        System.out.println("The fight is ended, one of characters died!");
    }
}
