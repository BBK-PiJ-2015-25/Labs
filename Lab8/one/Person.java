public class Person {
	
	private Person nextPerson = null;
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Person getNextPerson() {
		return this.nextPerson;
	}
	
	public void setNextPerson(Person person) {
		this.nextPerson = person;
	}
}