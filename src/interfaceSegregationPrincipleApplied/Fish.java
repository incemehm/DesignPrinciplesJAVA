package interfaceSegregationPrincipleApplied;

public class Fish implements IAnimal, ISwimmable {

	@Override
	public void Swim() {
		 System.out.println("Fish's swimming...");
	}

	@Override
	public void IsPet() {
		System.out.println("Fish is pet...");
	}

}
