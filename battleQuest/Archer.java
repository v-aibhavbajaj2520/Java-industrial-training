package battleQuest;

public class Archer extends GameCharacter {
	int arrows;
	
	Archer(String name, int health, int level, int arrows){
		super(name,health,level);
		this.arrows=arrows;
	}
	public  void attack() {
		System.out.println("Archer shoots you down using arrows");
	}
	
	public static void rapidShot() {
		System.out.println("Arrows ki barsaat.");
	}
}
