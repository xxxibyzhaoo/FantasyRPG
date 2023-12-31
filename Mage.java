
public class Mage extends Character {
    private final String elementalAffinity;

    public Mage(String characterID, String characterName, int level, String elementalAffinity) {
        super(characterID, characterName, level);
        this.elementalAffinity = elementalAffinity;
    }

    public void castElementalSpell(String spellType) {
        if (level < 5) {
            System.out.println(characterName + " needs to reach level 5 to cast spells.");
        } else {
            String message;
            message = switch (spellType) {
                case "Teleportation" -> "Teleporting " + characterName + " out of danger!";
                case "Illusion" -> characterName + " is creating illusions to confuse the enemy.";
                case "Detection" -> characterName + " is detecting the presence of magic nearby...";
                default -> throw new UnsupportedOperationException(characterName + " is trying to cast an unknown spell...");
            };
            System.out.println(message);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Elemental Affinity: " + elementalAffinity + "\n";
    }
}
