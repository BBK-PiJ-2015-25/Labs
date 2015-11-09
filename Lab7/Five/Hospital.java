public class Hospital {
		
	private Patient patientListStart = null;
	private Patient patientListEnd = null;
	
	public Hospital() {
		
	}
	
	public void addToTail(Patient patient) {
		if (patientListStart == null && patientListEnd == null) {
			patientListStart = patient;
			patientListEnd = patient;
		} else {
			patient.previousPatient = patientListEnd;
			patientListEnd.nextPatient = patient;
			patientListEnd = patient;
		}
	}
	
	public void addToFront(Patient patient) {
		if (patientListStart == null && patientListEnd == null) {
			patientListStart = patient;
			patientListEnd = patient;
		} else {
			patient.nextPatient = patientListStart;
			patientListStart.previousPatient = patient;
			patientListStart = patient;
		}
	}
	
	public void deletePatient(Patient patient)
	{
		if (patientListStart == patient) {
			patientListStart = patient.nextPatient;
		} else {
			patient.previousPatient.nextPatient = patient.nextPatient;
		}
		
		if (patientListEnd == patient) {
			patientListEnd = patient.previousPatient;
		} else {
			patient.nextPatient.previousPatient = patient.previousPatient;
		}
	}
	
	public void safeDelete(Patient patient)
	{
		Patient item = patientListStart;
		
		while (item != null) {
			if (item == patient) {
				this.deletePatient(patient);
				return;
			}
			
			item = item.nextPatient;
		}
	}
	
	public void printPatientsForward() {
		Patient patient = patientListStart;
		
		while (patient != null) {
			patient.print();
			patient = patient.nextPatient;
		}
		
		System.out.println("-----------------------");
	}
	
	public void printPatientsBack() {
		Patient patient = patientListEnd;
		
		while (patient != null) {
			patient.print();
			patient = patient.previousPatient;
		}
		
		System.out.println("-----------------------");
	}

	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		
		Patient a = new Patient("a", 24, "some illness");
		Patient b = new Patient("b", 22, "some illness");
		//Patient c = new Patient("c", 90, "some illness");
		
		hospital.addToFront(a);
		//hospital.addToFront(c);
		//hospital.addToTail(b);
		
		hospital.safeDelete(b);
		
		hospital.printPatientsForward();
		hospital.printPatientsBack();
	}

}
