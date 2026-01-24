package jusPay;

public class Main {

	public static void main(String[] args) {
		ForestAnimal animal;
		// Lion
		animal = new Lion("Sher",5);
		System.out.println("Name of animal - " + animal.name);
		System.out.println("Age of animal - " + animal.age);
		animal.makeSound();
		
		// Deer
		animal = new Deer("Kachua", 3);
		System.out.println("Name of animal - " + animal.name);
		System.out.println("Age of animal - " + animal.age);
		animal.makeSound();

	}

}
