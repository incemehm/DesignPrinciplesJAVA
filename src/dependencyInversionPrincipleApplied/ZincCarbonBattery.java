package dependencyInversionPrincipleApplied;

public class ZincCarbonBattery implements IBattery {
	
	int level = 100;
	
	@Override
	public void Discharge() {
		if (this.level > 0)
            this.level -= 2;	
	}

}
