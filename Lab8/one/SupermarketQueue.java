public class SupermarketQueue implements PersonQueue {
	
	private Person queueStart = null;
	
	public void insert(Person person) {
		if (this.queueStart == null) {
			this.queueStart = person;
		} else {
			Person customer = this.queueStart;
			
			while (customer.getNextPerson() != null) {
				customer = customer.getNextPerson();
			}
			
			customer.setNextPerson(person);
		}
	}
	
	public Person retrieve() {
		Person person = this.queueStart;
		this.queueStart = person.getNextPerson();
		return person;
	}
	
	public boolean isEmpty() {
		return this.queueStart == null;
	}
	
	// Test method to print the members of the queue
	public void printQueue() {
		Person customer = this.queueStart;
		
		while (customer != null) {
			System.out.println(customer.getName());
			customer = customer.getNextPerson();
		}
	}
}