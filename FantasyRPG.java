import java.util.ArrayList;
import java.util.List;

public class FantasyRPG {

    public static void main(String[] args) {
        // Instantiate two Player instances
        Player playerOne = new Player("P001", "Player One");
        Player playerTwo = new Player("P002", "Player Two");

        Warrior gideon = new Warrior("GS001", "Gideon Stoneheart", 5, "Sword", "Chainmail");
        Mage elara = new Mage("EF001", "Elara Frostweaver", 1, "Ice");
        Rogue darian = new Rogue("DW001", "Darian Whisperwind", 10, 15, "Shuriken");

        Skill whirlwindSlash = new Skill("Whirlwind Slash", "A powerful spinning attack.");
        Skill dualWielding = new Skill("Dual Wielding", "Ability to fight with a weapon in each hand.");
        Skill frostNova = new Skill("Frost Nova", "Blasts enemies with an explosion of ice.");
        Skill lockpicking = new Skill("Lockpicking", "Can unlock doors without keys.");

        gideon.addSkill(whirlwindSlash);
        gideon.addSkill(dualWielding);
        elara.addSkill(frostNova);
        darian.addSkill(lockpicking);

        playerOne.addCharacter(gideon);
        playerOne.addCharacter(elara);
        playerTwo.addCharacter(darian);

        gideon.chargeAttack(darian);
        elara.castElementalSpell("Teleportation");
        darian.stab(gideon);
        gideon.shieldBlock();
        darian.evasion();

        System.out.println(gideon);
        System.out.println(elara);
        System.out.println(darian);
    }

}