package lotr;

import org.reflections.Reflections;
import java.util.Random;
import java.util.Set;
import java.util.List;

public class CharacterFactory {
    public static Character createCharacter() {
        Reflections reflections = new Reflections("lotr");
        Set<Class<? extends Character>> characterClassesSet = reflections.getSubTypesOf(Character.class);
        List<Class<? extends Character>> characterClasses = List.copyOf(characterClassesSet);

        Random random = new Random();
        int randomIndex = random.nextInt(characterClasses.size());

        try {
            return characterClasses.get(randomIndex).newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }
}
