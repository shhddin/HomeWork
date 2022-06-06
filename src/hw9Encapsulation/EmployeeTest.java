package hw9Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Shahed Uddin");
		employee.setAge(28);
		employee.setSex('M');
		employee.setUsCitizen(true);

		System.out.println("Name: " + employee.getName() + "\nAge: " + employee.getAge() + "\nSex: " + employee.getSex()
				+ "\nUs Citizen: " + employee.isUsCitizen());
	}

}
