package interfaceSegregationPrincipleApplied;

public class Bird implements IAnimal, IFlyable, IWalkable {

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

}
