package hw3JavaVariables;

public class AboutMe {
	public String name; // Variable declared
	public String myName = "Shahed Uddin"; // Variable initialized
	public byte myAge = 28;
	public short myZipCode = 19149;
	public int myYearlySalary = 100000;
	public long my1stBankBalance = 9223372036854775807l;
	public float myHeight = 5.3f;
	public double myGrade = 3.6252222222225555;
	public char mySex = 'M';
	public boolean employed = false;

	public static void main(String[] args) {
		AboutMe aboutme = new AboutMe();
		System.out.println("\tHello, My name is " + aboutme.myName + " and my age is " + aboutme.myAge + "."
				+ "\nI wish my salary was " + aboutme.myYearlySalary + " US dollar.");

	}

}
