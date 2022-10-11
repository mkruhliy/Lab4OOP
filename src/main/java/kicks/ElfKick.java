package kicks;

import lotr.Character;

public class ElfKick implements BasicKick{
    @Override
    public void kick(Character whoKick, Character whoKicked) {
        if (whoKicked.getPower()<whoKick.getPower())
            whoKicked.setHp(0);
        whoKick.setPower(whoKick.getPower()-1);
    }
}
