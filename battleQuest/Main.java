package battleQuest;

public class Main {

	public static void main(String[] args) {
		GameCharacter character;
		character = new Warrior("Ninja",100,30,50);
		System.out.println(character.name);
		System.out.println(character.level);
		character.attack();
		character = new EliteWarrior("Ninja Hatori", 125, 45, "Knife and a Sword");
		System.out.println(character.name);
		System.out.println(character.health);
		character.attack();

	}

}
