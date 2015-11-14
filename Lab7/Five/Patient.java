public class Patient {

	private String name;
	private int age;
	private String illness;
	public Patient nextPatient;
	public Patient previousPatient;
	
	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
		this.previousPatient = null;
	}
	
	public void print() {
		System.out.println("Patient name: " + this.name + " age: " + this.age + " illness: " + this.illness);
	}
}