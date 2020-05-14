package liskovSubstitutionPrincipleApplied;

public class StandartUser implements IReadUser {

	@Override
	public void Read() {
		System.out.println("StandartUser reads");
	}

}
