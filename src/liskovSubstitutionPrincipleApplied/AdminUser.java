package liskovSubstitutionPrincipleApplied;

public class AdminUser implements IReadUser, IWriteUser {

	@Override
	public void Write() {
		System.out.println("AdminUser writes");
	}

	@Override
	public void Read() {
		System.out.println("AdminUser reads");
	}
}
