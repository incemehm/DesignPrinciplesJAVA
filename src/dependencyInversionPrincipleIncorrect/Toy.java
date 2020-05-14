package dependencyInversionPrincipleIncorrect;

public class Toy {
	 public void UseBattery(ZincCarbonBattery battery)
     {
         battery.Discharge();
     }
}
