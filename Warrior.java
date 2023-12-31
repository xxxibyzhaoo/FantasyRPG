public class Warrior extends Character {
    private String weaponType;
    private String armorType;

    public Warrior(String characterID, String characterName, int level, String weaponType, String armorType) {
        super(characterID, characterName, level);
        this.weaponType = weaponType;
        this.armorType = armorType;
    }

    public void chargeAttack(Character target) {
        int damage;
        switch (weaponType) {
            case "Sword":
                damage = level > 5 ? 50 : 25;
                break;
            case "Dagger":
                damage = 20;
                break;
            case "Crossbow":
                damage = 50;
                break;
            case "Staff":
                damage = 10;
                break;
            default:
                damage = 0;
                break;
        }
        target.health = Math.max(target.health - damage, 0);
         System.out.println(characterName + " attacks " + target.characterName + " with " + weaponType + " for " + damage + " damage!");
    }

    public void shieldBlock() {
        String message;
        switch (armorType) {
            case "Shield":
                message = characterName + " is raising its shield.";
                break;
            case "Gauntlet":
                message = characterName + " is raising its gauntlets.";
                break;
            case "Helmet":
                message = characterName + "'s head is protected.";
                break;
            default:
                message = characterName + " I hope you're protected...somehow.";
                break;
        }
        System.out.println(message);
    }

    @Override
    public String toString() {
        return super.toString() + "Weapon Type: " + weaponType + "\nArmor Type: " + armorType + "\n";
    }
}
