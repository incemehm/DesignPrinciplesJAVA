package dependencyInversionPrincipleApplied;

public class Toy {
	 public void UseBattery(IBattery battery)
     {
         battery.Discharge();
     }
}
