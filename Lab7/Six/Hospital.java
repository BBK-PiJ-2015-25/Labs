public class Hospital {

	private Patient start = null;
	
	public static void main(String[] args) {
		System.out.println("Lab 7.6 - Circular lists");
		System.out.println("---------------------");

		Patient one = new Patient("Dave");
		Patient two = new Patient("Bob");
		Patient three = new Patient("Dorris");

		Patient notInList = new Patient("Anon");

		Hospital hospital = new Hospital();
		hospital.addPatient(one);
		hospital.addPatient(new Patient("Bob"));
		hospital.addPatient(new Patient("John"));
		hospital.addPatient(new Patient("Jill"));
		hospital.addPatient(two);
		hospital.addPatient(new Patient("Sally"));
		hospital.addPatient(new Patient("Jane"));
		hospital.addPatient(new Patient("Joe"));
		hospital.addPatient(new Patient("Bill"));
		hospital.addPatient(three);

		hospital.printList();

		hospital.deletePatient(one);
		hospital.deletePatient(two);
		hospital.deletePatient(three);
		hospital.deletePatient(notInList);

		hospital.printList();

		System.out.println("---------------------");
		System.out.println("Goodbye.");
	}

	public void addPatient(Patient patient) {
		if (this.start == null) {
			this.start = patient;
			patient.setNext(patient);
		} else {
			Patient item = this.start;

			while (item.getNext() != this.start) {
				item = item.getNext();
			}

			patient.setNext(this.start);
			item.setNext(patient);	
		}
	}

	public void deletePatient(Patient patient) {
		if (patient == this.start) {
			Patient item = this.start;
			while(item.getNext() != this.start) {
				item = item.getNext();
			}

			item.setNext(this.start.getNext());
			this.start = this.start.getNext();
		} else {
			Patient item = this.start;
			while (item.getNext() != patient) {
				item = item.getNext();

				if (item.getNext() == this.start) {
					return;
				}
			}

			item.setNext(item.getNext().getNext());
		}
	}

	public void printList() {
		if (this.start != null) {
			Patient item = this.start;

			do {
				System.out.println("Patients name is: " + item.getName());
				item = item.getNext();
			} while (item != this.start);

		} else {
			System.out.println("There are no patients in the list.");
		}

		System.out.println("---------------------");
	}
}