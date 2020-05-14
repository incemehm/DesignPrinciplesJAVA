package singleResponsibilityPrincipleIncorrect;

public class Test {

	public static void main(String[] args) {
		 Developer developer = new Developer();
         developer.CreateAPI();
         developer.DesignPage();

         /* It breaks Single Responsibility principle.
          * Developer has to do two unrelated jobs.
          */
	}
}
