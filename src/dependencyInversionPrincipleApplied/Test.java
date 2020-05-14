package dependencyInversionPrincipleApplied;

public class Test {

	public static void main(String[] args) {
		Toy toy = new Toy();
        ZincCarbonBattery zincCarbonBattery = new ZincCarbonBattery();
        toy.UseBattery(zincCarbonBattery);

        AlcalineBattery alcalineBattery = new AlcalineBattery();
        toy.UseBattery(alcalineBattery);
        // Now we can use alcaline battery
        // Toy class, is Loosely coupled to ZincCarbonBattery and AlcalineBattery classes

        /* But if we want to use a kind of third battery?
        *  We can create a new class that implements IBattery interface.
        *  Then we can use new battery with toy just by calling UseBattery method.
        *  We dont have to make any arrangement in Toy class.
        *  This is what we want.
        */
	}

}
