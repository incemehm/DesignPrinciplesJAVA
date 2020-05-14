package dependencyInversionPrincipleIncorrect;

public class ZincCarbonBattery {
	
	int level = 100;
	
	public void Discharge() {
		if (this.level > 0)
            this.level -= 2;	
	}

}
