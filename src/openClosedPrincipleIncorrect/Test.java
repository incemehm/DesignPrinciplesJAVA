package openClosedPrincipleIncorrect;

public class Test {

	public static void main(String[] args) {
		Write(new A3Paper());
        Write(new A4Paper());
	}
	
	 private static void Write(Object paper)
     {
         if (paper instanceof A3Paper)
             ((A3Paper)paper).Write();

         if (paper instanceof A4Paper)
             ((A4Paper)paper).Write();

         /* Write method is tightly coupled to A3Paper and A4Paper. 
          * It's not closed to change. 
          * When new paper type such as A5Paper is included in project, we have to write another if statement.
          * This is undesirable.
          */
     } 
}
