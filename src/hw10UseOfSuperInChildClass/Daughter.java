package hw10UseOfSuperInChildClass;

public class Daughter extends Father {
	public String birthMonth;
	public int age;

	public Daughter() {
		super();
		super.father();
		super.fatherInfo("M uddin", 56, 'M', false);
		super.familyName = "Uddin";
		System.out.println("Family Name is : " + familyName);

		System.out.println("This deafult Constructor is from Daughter class");
	}

	public Daughter(String birthMonth, int age) {
		super("M uddin", 56, 'M', false);
		super.father();
		super.fatherInfo("M uddin", 56, 'M', false);
		super.familyName = "Uddin";
		System.out.println("Family Name is : " + familyName);

		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Doughter Birth Month: " + birthMonth + "\nAge: " + age);
	}

	public void daughter() {
		super.father();
		super.fatherInfo("M uddin", 56, 'M', false);
		super.familyName = "Uddin";
		System.out.println("Family Name is : " + familyName);

		System.out.println("This method is from Daughter class");
	}

	public void daughterInfo(String birthMonth, int age) {
		super.father();
		super.fatherInfo("M uddin", 56, 'M', false);
		super.familyName = "Uddin";
		System.out.println("Family Name is : " + familyName);

		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Doughter Birth Month: " + birthMonth + "\nDoughter Age: " + age);
	}

}
