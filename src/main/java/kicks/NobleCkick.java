package kicks;

import lotr.Character;

import java.util.Random;

public class NobleCkick implements BasicKick{
    private  static final Random randomGenerator = new Random();
    @Override
    public void kick(Character whoKick, Character whoKicked) {
        whoKicked.setHp(whoKicked.getHp()-randomGenerator.nextInt(whoKick.getPower()+1));
    }
}
