package interfaceSegregationPrincipleIncorrect;

public class Bird implements IAnimal {

	@Override
	public void Walk() {
		 System.out.println("Bird's walking...");
	}

	@Override
	public void Fly() {
		System.out.println("Bird's flying...");
	}

	@Override
	public void IsPet() {
		 System.out.println("Bird is pet...");
	}

	@Override
	public void Swim() {
		throw new UnsupportedOperationException();
		 //Birds cannot swim
	}
	
}
