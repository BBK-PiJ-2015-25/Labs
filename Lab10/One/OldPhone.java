public class OldPhone implements Phone {
	
	protected String[] calls;
	private String brand = null;
	
	public OldPhone(String brand) {
		this.calls = new String[10];
		this.brand = brand;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public void call(String number) {
		System.out.println("Calling: " + number);
		
		this.cacheNumber(number);
	}
	
	public void cacheNumber(String number) {
		for (int i = this.calls.length - 2; i >= 0; i--) {
			if (this.calls[i] != null) {
				this.calls[i+1] = this.calls[i];
			}
		}
		
		this.calls[0] = number;
	}
	
	public int existingNumberLength() {
		int count = 0;
		int l = this.calls.length;
		
		for (int i = 0; i < l; i++) {
			if (this.calls[i] != null) {
				count++;
			}
		}
		
		return count;
	}
	
	public void printLastNumbers() {
		int existing = this.existingNumberLength();
		
		if (existing == 0) {
			System.out.println("There is no call history.");
		} else {
			System.out.println("Previous " + existing + " called numbers: ");
			for (int i = 0; i < existing; i++) {
				System.out.println(this.calls[i]);
			}
		}
	}
}