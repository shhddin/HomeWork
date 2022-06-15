package hw11Polymorphism;

public class Sister {
	/*
	 * Overloading method has same method name, with different parameters.
	 */

	public void sister() {
		System.out.println("My age");
	}

	public void sister(int age1) {
		System.out.println(age1);
	}

	public String sister(String s, String ss) {
		String su = s + ss;
		System.out.println(su);
		return (su);
	}

	public int sister(int age1, int age2, int age3) {
		int total = age1 + age2 + age3;
		System.out.println(total);
		return total;
	}

	public static void sister(int age1, int age2, int age3, int age5) {
		int total = age1 + age2 + age3 + age5;
		System.out.println(total);
	}

	public final void sister(int age1, int age2, int age3, String age4) {
		System.out.println(age1 + age2 + age3 + age4);
	}

}
