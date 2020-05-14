package openClosedPrincipleApplied;

public class Test {

	public static void main(String[] args) {
		Write(new A3Paper());
        Write(new A4Paper());
	}
	
	private static void Write(IPaper paper)
    {
        paper.Write();

        /* Write method is loosely coupled to A3Paper and A4Paper now. 
         * It's closed to change but open to development. 
         * When new paper type such as A5Paper is included in project, we dont have to write if statement.
         * This is what exactly we want.
         */
    }
}
