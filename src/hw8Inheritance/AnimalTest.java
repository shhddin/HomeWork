package hw8Inheritance;

public class AnimalTest {
	public static void main(String[] args) {
		/*
		 * Animal Class is the parent Class of Mammal, Reptile and Bird Class.
		 * (Hierarchical Inheritance) Mammal extends Animal, Reptile extends Animal,
		 * Birds extends Animal.
		 */
		Animal animal = new Animal();
		animal.animalInfo();

		System.out.println("\n----------------------------------------------------\n");
		// (Single inheritance) Mammal extends Animal
		// Mammal is the child class of the Animal Class
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();

		System.out.println("\n----------------------------------------------------\n");
		// (Multilevel Inheritance) Dog extends Mammal, Mammal extends animal
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();

		System.out.println("\n----------------------------------------------------\n");
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();

		System.out.println("\n----------------------------------------------------\n");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();

		System.out.println("\n----------------------------------------------------\n");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();

		System.out.println("\n----------------------------------------------------\n");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();

		System.out.println("\n----------------------------------------------------\n");
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();

		System.out.println("\n----------------------------------------------------\n");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();

	}

}
