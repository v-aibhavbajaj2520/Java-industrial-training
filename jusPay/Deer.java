package jusPay;

public class Deer extends HerbivoreAnimal{
	Deer(String Name, int Age){
		super(Name, Age);
	}
	
	@Override
	public void makeSound() {
		System.out.println("Deer Grunts");
	}
}
