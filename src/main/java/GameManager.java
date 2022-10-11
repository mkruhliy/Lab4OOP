import lotr.CharacterFactory;
import lotr.Character;
import lotr.Elf;
import lotr.Hobbit;

public class GameManager {
    public static void fight(Character c1, Character c2) {

        int round = 1;

        System.out.println("--------------------");
        System.out.println("First character: " + c1);
        System.out.println("Second character: " + c2);

        if (c1 instanceof Hobbit && c2 instanceof Hobbit) {
            System.out.println("both characters are hobbits. They drowned in their tears");
            return;
        }


        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("--------------------");
            System.out.println("Round"+round+"\nFight!\n");
            System.out.println("First character kicking "+c2);
            c1.kick(c2);
            if (c2.isAlive()) {
                System.out.println("Second character kicking "+c1);
                c2.kick(c1);
            }
            else break;
            System.out.println("--------------------");
            System.out.println("Round results");
            System.out.println("First character: " + c1);
            System.out.println("Second character: " + c2);
            round++;
        }
        System.out.println("--------------------");
        if (c1.isAlive())
            System.out.println("First character won");
        else
            System.out.println("Second character won");
    }
    public static void main(String[] args) {
        CharacterFactory cf = new CharacterFactory();
        Character character1 = cf.createCharacter();
        Character character2 = cf.createCharacter();
        fight(character1, character2);
    }
}
