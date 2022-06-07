package hw10UseOfSuperInChildClass;

public class Father {
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;

	public Father() {
		System.out.println("This deafult Constructor is from Father class");
	}

	public Father(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println(
				"Father Name: " + name + "\nFather Age: " + age + "\nSex: " + sex + "\nUs Citizen: " + usCitizen);
	}

	public void father() {
		System.out.println("This method is from Father class");
	}

	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Father Name: " + name + "\nAge: " + age + "\nSex: " + sex + "\nUs Citizen: " + usCitizen);
	}

}
