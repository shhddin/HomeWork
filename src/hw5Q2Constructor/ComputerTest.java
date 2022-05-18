package hw5Q2Constructor;

public class ComputerTest {
	public static void main(String[] args) {
		Computer computer1 = new Computer();
		Computer computer2 = new Computer("Apple", "MacBook Air", "MacOS Mojave", 800, 'A', false);
		Computer computer3 = new Computer(750, "Windows 10", "Dell", "Inspiron 15", 'A', true);
	}

}
