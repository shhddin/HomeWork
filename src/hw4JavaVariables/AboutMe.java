package hw4JavaVariables;

// Variable Declared
public class AboutMe {
	public String name;
	public byte age;
	public short rent;
	public int salary;
	public long bankBalance;
	public float height;
	public double gpa;
	public char sex;
	public boolean married;

	//// Constructor Declared
	public AboutMe() {
		System.out.println("\nThis is all about us:\n");

	}

	// Method is Implemented
	public void aboutMe() {
		System.out.println("Name: " + name + "\nAge: " + age + "\nSex: " + sex + "\nMarried : " + married + "\nHeight: "
				+ height + "\nRent: " + rent + "\nSalary: " + salary + "\nBankbalance: " + bankBalance + "\nGPA: "
				+ gpa);

	}
}
