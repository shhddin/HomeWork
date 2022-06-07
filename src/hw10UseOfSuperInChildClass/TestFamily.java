package hw10UseOfSuperInChildClass;

public class TestFamily {
	public static void main(String[] args) {
		System.out.println("---------- Default constructor initialized from Daughter Class ----------");

		Daughter daughter = new Daughter();

		System.out.println("\n---------- Parameterized method initialized from Daughter Class ----------");

		daughter.daughterInfo("January", 20);

	}
}
