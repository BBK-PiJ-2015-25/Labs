public class Guitar implements WoodenObject, MusicalInstrument {
	
	public Guitar() {
		System.out.println("New Guitar");
	}
	
	public void play() {
		System.out.println("Play method called");
	}
	
	public void burn() {
		System.out.println("Burn method called");
	}
}