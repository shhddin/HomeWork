package hw9Abstraction;

public abstract class MedicalSchool extends NursingSchool {
	/*
	 * One keywords are used for the inheritance in Java for Abstract Class.
	 * Abstract Class can inherit other Abstract Class or a regular class by extends
	 * keyword. Abstract Class can not inherit interface by extends keyword. One
	 * inheritances is possible by an Abstract Class.
	 */

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is non-abstract method");
	}

	public MedicalSchool() {

	}

}
