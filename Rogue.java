public class Rogue extends Character {
    private int stealthLevel;
    private String daggerType;

    public Rogue(String characterID, String characterName, int level, int stealthLevel, String daggerType) {
        super(characterID, characterName, level);
        this.stealthLevel = stealthLevel;
        this.daggerType = daggerType;
    }

    public void stab(Character target) {
        int damage;
        if (level >= 1 && level <= 3) {
            damage = 10;
        } else if (level <= 5) {
            damage = 15;
        } else {
            damage = 20;
        }
        target.health = Math.max(target.health - damage, 0);
        System.out.println(characterName + " stabs " + target.characterName + " with " + daggerType + " for " + damage + " damage!");
    }

    public void evasion() {
        String message;
        if (getStealthLevel() < 5) {
            message = characterName + " needs a higher stealth level to evade attacks.";
        } else {
            message = characterName + " successfully evades the incoming attack!";
        }
        System.out.println(message);
    }

    public int getStealthLevel() {
        return stealthLevel;
    }

    public void setStealthLevel(int stealthLevel) {
        this.stealthLevel = stealthLevel;
    }

    public String getDaggerType() {
        return daggerType;
    }

    public void setDaggerType(String daggerType) {
        this.daggerType = daggerType;
    }

    @Override
    public String toString() {
        return super.toString() + "Stealth Level: " + stealthLevel + "\nDagger Type: " + daggerType + "\n";
    }
}
