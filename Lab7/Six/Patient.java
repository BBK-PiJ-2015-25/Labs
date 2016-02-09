public class Patient {
	private String name;
	private Patient next;

	Patient(String name) {
		this.name = name;
		this.next = null;
	}

	public void setNext(Patient patient) {
		this.next = patient;
	}

	public Patient getNext() {
		return this.next;
	}

	public String getName() {
		return this.name;
	}
}