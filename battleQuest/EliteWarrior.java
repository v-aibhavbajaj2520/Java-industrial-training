package battleQuest;

public class EliteWarrior extends Warrior{
	String specialWeapon;
	EliteWarrior(String name, int health, int level, String specialWeapon){
		super(name,health,level);
		this.specialWeapon = specialWeapon;
	}
}
