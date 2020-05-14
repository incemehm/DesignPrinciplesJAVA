package singleResponsibilityPrincipleApplied;

public class Test {

	public static void main(String[] args) {
		BackendDeveloper backendDeveloper = new BackendDeveloper();
        backendDeveloper.CreateAPI();

        FrontendDeveloper frontendDeveloper = new FrontendDeveloper();
        frontendDeveloper.DesignPage();

        /* It fulfills Single Responsibility principle.
         * BackendDeveloper does his own job.
         * FrontendDeveloper does his own job.
         */
	}
}
