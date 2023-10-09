package lotr;

import java.util.Arrays;
import java.util.Random;
import java.util.List;

public class CharacterFactory {
    public static Character crateCharacter(){
        List<Class <? extends Character>> characters = Arrays.asList(King.class, Knight.class, Hobbit.class, Elf.class);

        int randomNum = new Random().nextInt(characters.size());

        try{
            return characters.get(randomNum).newInstance();
        }
        catch(Exception e){
            System.out.println("Unhandled exeption:");
            e.printStackTrace();
            return new King();
        }
        
    }
}
