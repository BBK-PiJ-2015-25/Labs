public class Hospital {
	public class Patient {

		private String name;
		private int age;
		private String illness;
		private Patient nextPatient;
		
		public Patient(String name, int age, String illness) {
			this.name = name;
			this.age = age;
			this.illness = illness;
			this.nextPatient = null;
		}
		
		public void print() {
			System.out.println("Patient name: " + this.name + " age: " + this.age + " illness: " + this.illness);
		}
	}
	
	private Patient patientListStart = null;
	
	public Hospital() {
		
	}
	
	public Patient addPatient(Patient patient) {
		if (patientListStart == null)
			patientListStart = patient;
		else {
			Patient item = patientListStart;
			
			while (item.nextPatient != null) {
				item = item.nextPatient;
			}
			item.nextPatient = patient;
		}
		return patient;
	}
	
	public void deletePatient(Patient patient)
	{
		if (patientListStart == patient)
			patientListStart = patient.nextPatient;
		else {
			Patient item = patientListStart;
			
			while (item.nextPatient != patient) {
				item = item.nextPatient;
			}
		
			item.nextPatient = patient.nextPatient;
		}
	}
	
	public void printPatients() {
		Patient patient = patientListStart;
		
		while (patient != null) {
			patient.print();
			patient = patient.nextPatient;
		}
		
		System.out.println("-----------------------");
	}
	
	public void run() {
		Patient a = addPatient(new Patient("a", 21, "some illness"));
		addPatient(new Patient("b", 22, "some illness"));
		addPatient(new Patient("c", 23, "some illness"));
		Patient d = addPatient(new Patient("d", 24, "some illness"));
		addPatient(new Patient("e", 25, "some illness"));
		addPatient(new Patient("f", 26, "some illness"));
		addPatient(new Patient("g", 27, "some illness"));
		addPatient(new Patient("h", 28, "some illness"));
		addPatient(new Patient("i", 29, "some illness"));
		addPatient(new Patient("j", 78, "some illness"));
		
		printPatients();
		
		deletePatient(d);
		
		printPatients();
		
		deletePatient(a);
		
		printPatients();
	}

	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		hospital.run();
	}

}
