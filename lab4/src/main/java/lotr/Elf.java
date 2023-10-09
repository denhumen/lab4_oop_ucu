package lotr;

public class Elf extends Character{

    public Elf() {
        super(10, 10, new CryKick());
    }

    @Override
    public void kick(Character opponent) {
        if (opponent.getPower() < this.getPower()){
            opponent.setHp(0);
        }else{
            this.increasePower(1);
        }
    }
    
}
