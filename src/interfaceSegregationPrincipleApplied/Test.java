package interfaceSegregationPrincipleApplied;

public class Test {

	public static void main(String[] args) {
		Dog dog = new Dog();
        Fish fish = new Fish();
        Bird bird = new Bird();

        dog.IsPet();
        //dog.Fly(); // It's undefined for dog correctly. So you cannot use Fly method for dog and you dont get an exception.
        dog.Swim();
        dog.Walk();

        fish.IsPet();
        //fish.Fly(); // It's undefined for fish. 
        fish.Swim();
        //fish.Walk(); // It's undefined for fish

        bird.IsPet();
        bird.Fly();
        //bird.Swim(); // It's undefined for bird
        bird.Walk(); 
	}
}
