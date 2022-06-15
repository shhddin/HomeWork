package hw11Polymorphism;

public class Niece extends Sister {
	/*
	 * When different methods exist with the same method name with same parameters,
	 * but with different logic, it is called method overriding.
	 */

	@Override
	public void sister() {
		System.out.println("My age, from Niece class.");
	}

	@Override
	public void sister(int age1) {
		int total = age1 + 0;
		System.out.println(total);
	}

	@Override
	public String sister(String s, String ss) {
		String us = s + ss + ss;
		System.out.println(us);
		return (us);

	}

	@Override
	public int sister(int age1, int age2, int age3) {
		int total = age1 + age2 * age3;
		System.out.println(total);
		return total;
	}

	/*
	 * Static method can't be Overridden. "Static" belongs to the same class.
	 * 
	 * @Override public static void sister(int age1, int age2, int age3, int age5) {
	 * int total = age1 + age2 + age3 + age5; System.out.println(total); }
	 */

	/*
	 * Final method from Sister class can not be Overridden. "Final" also belong to
	 * the same class, no other class can't access Final type.
	 * 
	 * @Override public final void sister(int age1, int age2, int age3, String age4)
	 * { System.out.println(age1 + age2 + age3 + age4); }
	 */

}
