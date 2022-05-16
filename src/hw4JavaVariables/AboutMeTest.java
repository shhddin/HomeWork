package hw4JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {
		// Constructor Initialized
		AboutMe aboutme = new AboutMe();
		// Variable Initialized
		aboutme.name = "Shahed Uddin";
		aboutme.age = 27;
		aboutme.sex = 'M';
		aboutme.married = false;
		aboutme.height = 5.8f;
		aboutme.rent = 1012;
		aboutme.salary = 100000;
		aboutme.bankBalance = 1234567890l;
		aboutme.gpa = 3.4;
		// Method Initialized
		aboutme.aboutMe();

		// Constructor Initialized
		AboutMe alex = new AboutMe();
		// Variable Initialized
		alex.name = "Alex";
		alex.age = 28;
		alex.sex = 'M';
		alex.married = true;
		alex.height = 5.98f;
		alex.rent = 1500;
		alex.salary = 900000;
		alex.bankBalance = 65634567890l;
		alex.gpa = 3.23224;
		// Method Initialized
		alex.aboutMe();
	}

}
