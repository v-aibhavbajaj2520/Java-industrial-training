package battleQuest;

public class Warrior extends GameCharacter {
	int strength;
	
	Warrior(String name, int health, int level){
		super(name,health,level);
	}
	
	Warrior(String name, int health, int level, int strength){
		super(name,health,level);
		this.strength=strength;
	}
//	@Override
	public void attack() {
		System.out.println("Warrior attacks with sword");
	}
	public static void powerStrike() {
		System.out.println("Power strike -> Sword and a Punch");
	}
}