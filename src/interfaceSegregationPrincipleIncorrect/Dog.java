package interfaceSegregationPrincipleIncorrect;

public class Dog implements IAnimal {

	@Override
	public void Walk() {
		System.out.println("Dog's walking...");
	}

	@Override
	public void IsPet() {
		System.out.println("Dog is pet...");
	}

	@Override
	public void Swim() {
		System.out.println("Dog's swimming...");
	}

	@Override
	public void Fly() {
		throw new UnsupportedOperationException();
		//Dogs cannot fly
	}

}
