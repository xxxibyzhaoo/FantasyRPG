import java.util.ArrayList;
import java.util.List;

public class Character {
    protected String characterID;
    protected String characterName;
    protected int level;
    protected int health;
    protected List<Skill> skills = new ArrayList<>();

    public Character(String characterID, String characterName, int level) {
        this.characterID = characterID;
        this.characterName = characterName;
        this.level = level;
        this.health = 100; // Initial health set to 100
    }

    public void addSkill(Skill skill) {
        skills.add(skill);
    }

    public void levelUp() {
        level++;
    }

    @Override
    public String toString() {
        StringBuilder skillInfo = new StringBuilder();
        for (Skill skill : skills) {
            skillInfo.append(skill.toString()).append("\n");
        }
        return "Character ID: " + characterID + "\nName: " + characterName +
               "\nLevel: " + level + "\nHealth: " + health + "\nSkills:\n" + skillInfo;
    }

}