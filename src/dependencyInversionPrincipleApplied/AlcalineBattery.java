package dependencyInversionPrincipleApplied;

public class AlcalineBattery implements IBattery {

	int level = 100;
	
	@Override
	public void Discharge() {
		 if (this.level > 0)
             this.level -= 1;		
	}
}
