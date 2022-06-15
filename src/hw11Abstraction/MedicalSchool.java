package hw11Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool {
	/*
	 * Two keywords are used for the inheritance in Java for Abstract Class.
	 * Abstract Class can inherit other Abstract Class or a regular class by extends
	 * keyword. Abstract Class can not inherit interface by extends keyword. To By
	 * using implement keyword abstract class can inherit interface. One
	 * inheritances is possible using extends keyword, and multiple interface by
	 * using implements.
	 */

	public  abstract void anatomyLab();

	public static void biochemistryLab() {
		System.out.println("This is non-abstract method");
	}

	public MedicalSchool() {

	}

	// Default method is only allowed in the Interface.
	// public default void biology1() {
	// System.out.println("\"biology\" is the non-abstract method of the class
	// \"ColumbiaUniversity\"");}

}
