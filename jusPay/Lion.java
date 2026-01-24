package jusPay;

public class Lion extends WildAnimal{
	Lion(String Name, int Age){
		super(Name, Age);
	}
	
	@Override
	public void makeSound() {
		System.out.println("Lion Roars.");
	}

}
