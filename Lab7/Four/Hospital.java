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
	
	public int countPatients()
	{
		Patient patient = patientListStart;
		int patientCount = 0;
		
		while (patient != null) {
			patientCount++;
			patient = patient.nextPatient;
		}
		
		return patientCount;
	}
	
	public int countPatientsRec(Patient patient)
	{		
		if (patient == null) {
			return 0;
		} else if (patient.nextPatient == null) {
			return 1;
		}
		
		return this.countPatientsRec(patient.nextPatient) + 1;
	}
	
	public void run() {
		Patient a = addPatient(new Patient("a", 21, "some illness"));	
		Patient b = new Patient("b", 22, "some illness");
		addPatient(b);
		addPatient(new Patient("c", 23, "some illness"));
		Patient d = addPatient(new Patient("d", 24, "some illness"));
		addPatient(new Patient("e", 25, "some illness"));
		addPatient(new Patient("f", 26, "some illness"));
		addPatient(new Patient("g", 27, "some illness"));
		addPatient(new Patient("h", 28, "some illness"));
		addPatient(new Patient("i", 29, "some illness"));
		Patient j = new Patient("j", 78, "some illness");
		addPatient(j);
		// printPatients();
		
		// deletePatient(d);
		
		// printPatients();
		
		// deletePatient(a);
		deletePatient(j);
		deletePatient(b);
		
		// printPatients();
		
		System.out.println("Patient count: " + this.countPatients());
		System.out.println("Patient count (rec): " + this.countPatientsRec(a));
		System.out.println("Patient count (rec) from D: " + this.countPatientsRec(d));
	}

	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		hospital.run();
	}

}
