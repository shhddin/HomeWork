package hw11Polymorphism;

public class TestFamily {
	public static void main(String[] args) {
		Sister s = new Sister();
		s.sister();
		s.sister(30);
		s.sister("S", "U");
		s.sister(1, 1, 10);
		s.sister(1, 1, 30, " Years");
		Sister.sister(1, 20, 30, 40);

		System.out.println("\n.........................>");

		Niece n = new Niece();
		n.sister();
		n.sister(30);
		n.sister("S", "U");
		n.sister(1, 1, 10);
		n.sister(1, 1, 30, " Years");
		Sister.sister(0, 0, 0, 0);

	}
}
