package liskovSubstitutionPrincipleApplied;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<IReadUser> readUsers = new ArrayList<IReadUser>();
		readUsers.add(new AdminUser());
		readUsers.add(new StandartUser());
		
		List<IWriteUser> writeUsers = new ArrayList<IWriteUser>();
		writeUsers.add(new AdminUser());
		writeUsers.add(new AdminUser());

		Query(readUsers);
		Operate(writeUsers);
	}
	
	static void Query(List<IReadUser> users)
    {
		for(IReadUser u : users)
		{
			u.Read();
		}		
    }

    static void Operate(List<IWriteUser> users)
    {
    	for(IWriteUser u : users)
		{
			u.Write();
		}

        // Now we can use Write method without type checking.
        // It operates over class objects that implement IWriteUser interface.
    }
}
