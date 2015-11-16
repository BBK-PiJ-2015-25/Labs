public class Person implements PersonQueue {
	
	private Person nextPerson = null;
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void insert(Person person) {
		this.nextPerson = person;
	}
	
	public Person retrieve() {
		return this.nextPerson;
	}
	
	public String getName() {
		return this.name;
	}
}