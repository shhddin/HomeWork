package hw10Abstraction;

public interface University extends College, Hospital {
	/*
	 * One keyword (extends) is used for the inheritance. An interface inherits
	 * other Interfaces by extends keyword. An interfaces can not inherits a regular
	 * class or an abstract class by using the extends keyword or using implements.
	 * An interface can inherit more than one interfaces.
	 */

	public void lassSize();

	public void playGround();

	public void teacher();

	// public University() {}
	// Interfaces cannot have constructors

	public default void gymnasium() {

	}

	public static void library() {

	}

}
