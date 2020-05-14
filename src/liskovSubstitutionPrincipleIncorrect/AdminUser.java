package liskovSubstitutionPrincipleIncorrect;

public class AdminUser implements IUser {

	@Override
	public void Read() {
		System.out.println("AdminUser reads");
	}
	
	@Override
	public void Write() {
		System.out.println("AdminUser writes");
	}
}
