package lotr;

import kicks.BasicKick;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
public abstract class Character {
    @Getter
    private int hp;
    @Getter @Setter
    private int power;

    private BasicKick kickObject;

    public void kick(Character c) {
        kickObject.kick(this, c);
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp,0);
    }

    public boolean isAlive() {
        return this.hp>0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }
}

