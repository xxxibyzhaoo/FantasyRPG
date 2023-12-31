public class Skill {
    private final String skillName;
    private final String skillDescription;

    public Skill(String skillName, String skillDescription) {
        this.skillName = skillName;
        this.skillDescription = skillDescription;
    }

    public String getSkillName() {
        return skillName;
    }

    public String getSkillDescription() {
        return skillDescription;
    }

    @Override
    public String toString() {
        return skillName + ": " + skillDescription;
    }
}
