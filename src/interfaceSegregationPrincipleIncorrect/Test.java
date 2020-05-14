package interfaceSegregationPrincipleIncorrect;

public class Test {

	public static void main(String[] args) {
		Dog dog = new Dog();
        Fish fish = new Fish();
        Bird bird = new Bird();

        dog.IsPet();
        dog.Fly();   // It's defined for dog incorrectly. So you can call Fly method for dog and you get a UnsupportedOperationException.
        dog.Swim();
        dog.Walk();

        fish.IsPet();
        fish.Fly();  // throw new UnsupportedOperationException();
        fish.Swim();
        fish.Walk(); // throw new UnsupportedOperationException();

        bird.IsPet();
        bird.Fly();
        bird.Swim(); // throw new UnsupportedOperationException();
        bird.Walk();
	}
}
