package liskovSubstitutionPrincipleIncorrect;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<IUser> users = new ArrayList<IUser>();
		users.add(new AdminUser());
		users.add(new StandartUser());
		
		Query(users);
		Operate(users);
	}
	
	static void Query(List<IUser> users)
    {
		for(IUser u : users)
		{
			u.Read();
		}		
    }

    static void Operate(List<IUser> users)
    {
    	 /*        
	        for(IUser u : users)
			{
	    		u.Write(); // when u is StandartUser, it throws NotImplementedException()
			}        
    	  */
    	
    	for(IUser u : users)
		{
    		try
            {
    			u.Write(); 
            }
            catch (Exception e)
            {
            }
		}
    	 // Controlling with Try-catch block is the first solution that comes to mind but wrong
    	
    	for(IUser u : users)
		{
    		if (u instanceof AdminUser)
                u.Write();
		}
    	// Type check is the second solution that comes to mind but wrong too.
    }
}
