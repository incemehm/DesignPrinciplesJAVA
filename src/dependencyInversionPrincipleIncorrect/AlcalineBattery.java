package dependencyInversionPrincipleIncorrect;

public class AlcalineBattery {

	int level = 100;
	
	public void Discharge() {
		 if (this.level > 0)
             this.level -= 1;		
	}
}
