package hw11Abstraction;

public class RockefellerUniversity extends EngineeringSchool implements
AeronauticalSchool{

	public void maths() {
		System.out.println("\"maths\" is the non-abstract method of the class \"RockefellerUniversity\"");
	}

	@Override
	public void aeronauticalInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mechanicalLab() {
		// TODO Auto-generated method stub
		
	}

}
