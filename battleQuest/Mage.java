package battleQuest;

public class Mage extends GameCharacter{
	int mana;
	
	Mage(String name, int health, int level, int mana){
		super(name,health,level);
		this.mana=mana;
	}
	public  void attack() {
		System.out.println("Mage casts a spell");
	}
	
	public static void castSpell() {
		System.out.println("Casted a Spell..");
	}
}
