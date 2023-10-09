package lotr;

import java.util.Random;

import kick.KickStrategy;

public class NobleKick implements KickStrategy{

    @Override
    public void kick(Character whoKisks, Character opponent) {
        opponent.setHp(opponent.getHp() - new Random().nextInt(whoKisks.getPower()));
    }
    
}
