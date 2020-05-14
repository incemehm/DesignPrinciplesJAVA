package liskovSubstitutionPrincipleIncorrect;

public class StandartUser implements IUser {

	@Override
	public void Read() {
		System.out.println("StandartUser reads");
	}
	
	@Override
	public void Write() {
		throw new UnsupportedOperationException();
	}
}
