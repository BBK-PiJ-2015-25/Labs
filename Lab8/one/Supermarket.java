public class Supermarket {
	
	private Person queueStart = null;
	
	public static void main(String[] args) {
		Person customer1 = new Person("billy");
		Person customer2 = new Person("jill");
		Person customer3 = new Person("bob");
		Person customer4 = new Person("jack");
		
		Supermarket market = new Supermarket();
		
		market.addPerson(customer1);
		market.addPerson(customer2);
		market.addPerson(customer3);
		market.addPerson(customer4);
		market.addPerson(new Person("fred"));
		
		market.printQueue();
		
		System.out.println("------------------");
		
		market.servePerson();
		market.servePerson();
		market.servePerson();
		market.servePerson();
		market.servePerson();
		market.servePerson();
		
		market.printQueue();
	}
	
	public void addPerson(Person person) {
		if (this.queueStart == null) {
			this.queueStart = person;
		} else {
			Person item = this.queueStart;
			
			while (item.retrieve() != null) {
				item = item.retrieve();
			}
			
			item.insert(person);
		}
	}
	
	public void servePerson() {
		if (this.queueStart != null) {
			this.queueStart = this.queueStart.retrieve();
		} else {
			System.out.println("There is no one in your queue.");
		}
	}
	
	// Test method to print the members of the queue
	public void printQueue() {
		Person item = this.queueStart;
		
		while (item != null) {
			System.out.println(item.getName());
			item = item.retrieve();
		}
	}
}