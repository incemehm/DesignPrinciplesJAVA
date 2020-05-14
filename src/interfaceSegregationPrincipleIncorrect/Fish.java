package interfaceSegregationPrincipleIncorrect;

public class Fish implements IAnimal {

	@Override
	public void Swim() {
		 System.out.println("Fish's swimming...");
	}

	@Override
	public void IsPet() {
		System.out.println("Fish is pet...");
	}

	@Override
	public void Walk() {
		throw new UnsupportedOperationException();
		//Fish cannot walk
	}

	@Override
	public void Fly() {
		throw new UnsupportedOperationException();
		 //Fish cannot fly
	}

}
