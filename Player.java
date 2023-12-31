import java.util.ArrayList;
import java.util.List;

public class Player {
    private final String playerID;
    private final String playerName;
    private final List<Character> characters = new ArrayList<>();

    public Player(String playerID, String playerName) {
        this.playerID = playerID;
        this.playerName = playerName;
    }

    public void addCharacter(Character character) {
        characters.add(character);
    }

    @Override
    public String toString() {
        StringBuilder characterInfo = new StringBuilder();
        for (Character character : characters) {
            characterInfo.append(character.toString()).append("\n");
        }
        return "Player ID: " + playerID + "\nPlayer Name: " + playerName +
               "\nCharacters:\n" + characterInfo;
    }
}
