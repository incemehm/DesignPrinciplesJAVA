package interfaceSegregationPrincipleApplied;

public class Dog implements IAnimal, ISwimmable, IWalkable {

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

}
