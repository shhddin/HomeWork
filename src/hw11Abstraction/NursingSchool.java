package hw11Abstraction;

public abstract class NursingSchool extends RockefellerUniversity{

	public abstract void hygiene();

	public void caring() {
		System.out.println("This is a non-abstract method from abstract class NursingSchool.");
	}

}
