package hw9Abstraction;

public interface University {

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
