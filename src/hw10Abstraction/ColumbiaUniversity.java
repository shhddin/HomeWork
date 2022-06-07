package hw10Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University {
	/*
	 * One keywords are used for the inheritance in Java for Regular Class. Regular
	 * Class can inherit other Abstract Class or a regular class by extends keyword.
	 * Regular Class can not inherit interface by extends keyword, but it can
	 * inherit by using implements keywords. One inheritances is possible by a
	 * Regular Class using extends keyword. Using implements keyword multiple
	 * interface inheritance is possible.
	 */

	// public abstract void ColumbiaUniversity();
	// The abstract method only be defined by an abstract class

	public void biology() {
		System.out.println("\"biology\" is the non-abstract method of the class \"ColumbiaUniversity\"");
	}

	public ColumbiaUniversity() {

	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub

	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub

	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void lassSize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub

	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub

	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub

	}

}
