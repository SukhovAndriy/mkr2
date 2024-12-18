package mkr2;
import java.util.ArrayList;
import java.util.List;
public class ArenaMediator {
    private List<Character> characters = new ArrayList<>();

    public void addCharacter(Character character) {
        characters.add(character);
        System.out.println(character.name + " з'явився на арені.");
    }

    public void coordinateAttack() {
        for (Character character : characters) {
            character.attack();
        }
    }
}

