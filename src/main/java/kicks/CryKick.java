package kicks;

import lotr.Character;

public class CryKick implements BasicKick {
    @Override
    public void kick(Character whoKick, Character whoKicked) {
        System.out.println("Tears, tears...");
    }
}
